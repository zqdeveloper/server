package com.dormitory.back.pojo.vo;


import com.dormitory.back.pojo.result.CodeMsg;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("返回结果")
public class JsonVo {
    private static final int CODE_OK = CodeMsg.OPERATE_OK.getCode();
    private static final int CODE_ERROR = CodeMsg.BAD_REQUEST.getCode();
    
    @ApiModelProperty("代码【0代表成功，其他代表失败】")
    private Integer code;

    @ApiModelProperty("消息描述")
    private String msg;

    public JsonVo() {
        this(true);
    }

    public JsonVo(boolean ok) {
        this(ok, null);
    }

    public JsonVo(boolean ok, String msg) {
        this(ok ? CODE_OK : CODE_ERROR, msg);
    }

    public JsonVo(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public JsonVo(CodeMsg codeMsg) {
        this(codeMsg.getCode(), codeMsg.getMsg());
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
