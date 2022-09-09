package com.dormitory.back.common.exception;

import com.dormitory.back.pojo.result.CodeMsg;
import com.dormitory.back.pojo.vo.JsonVo;
import com.dormitory.back.common.util.JsonVos;
import com.dormitory.back.common.util.Streams;
import org.apache.shiro.authz.AuthorizationException;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.List;

@RestControllerAdvice
public class CommonExceptionHandler {
    @ExceptionHandler(Throwable.class)
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public JsonVo handle(Throwable t) {

        // 一些可以直接处理的异常
        if (t instanceof CommonException) {
            return handle((CommonException) t);
        } else if (t instanceof BindException) {
            return handle((BindException) t);
        } else if (t instanceof ConstraintViolationException) {
            return handle((ConstraintViolationException) t);
        } else if (t instanceof AuthorizationException) {
            return JsonVos.error(CodeMsg.NO_PERMISSION);
        }

        // 处理cause异常（导致产生t的异常）
        Throwable cause = t.getCause();
        if (cause != null) {
            return handle(cause);
        }

        // 其他异常（没有cause的异常）
        return JsonVos.error();
    }

    private JsonVo handle(CommonException ce) {
        return JsonVos.error(ce.getCode(), ce.getMessage());
    }

    private JsonVo handle(BindException be) {
        List<ObjectError> errors = be.getBindingResult().getAllErrors();
        // 函数式编程的方式：stream
        List<String> defaultMsgs = Streams.map(errors, ObjectError::getDefaultMessage);
        String msg = StringUtils.collectionToDelimitedString(defaultMsgs, ", ");
        return JsonVos.error(msg);
    }

    private JsonVo handle(ConstraintViolationException cve) {
        List<String> msgs = Streams.map(cve.getConstraintViolations(), ConstraintViolation::getMessage);
        String msg = StringUtils.collectionToDelimitedString(msgs, ", ");
        return JsonVos.error(msg);
    }
}
