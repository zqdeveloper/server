package com.dormitory.back.common.util;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class ClassUtils {
    public static <T> Map<String, Object> getColumns(T clz) {
        Map<String, Object> map = new HashMap<>();
        try {
            if (clz != null) {
                Field[] declaredFields = clz.getClass().getDeclaredFields();
                for (Field declaredField : declaredFields) {
                    declaredField.setAccessible(true);
                    Object value = declaredField.get(clz);
                    declaredField.setAccessible(false);
                    if (ObjectUtils.isEmpty(value) || StringUtils.isBlank(String.valueOf(value))) {
                        continue;
                    }
                    TableId tableId = declaredField.getAnnotation(TableId.class);
                    String column = "";
                    if (tableId != null) {
                        column = tableId.value();
                        if (value instanceof Number && Long.parseLong(String.valueOf(value)) <= 0) {
                            continue;
                        }
                    }
                    TableField tableField = declaredField.getAnnotation(TableField.class);
                    if (tableField != null) {
                        if (!tableField.exist()) {
                            continue;
                        }
                        column = tableField.value();
                    }
                    if (StringUtils.isEmpty(column)) {
                        column = declaredField.getName();
                    }
                    map.put(column, value);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
}
