package com.lp.yihan.common.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author lp
 * @create 2020/5/23 12:25
 */
@Data
@ApiModel(description = "统一返回结果")
public class ResponseResult<T> {

    @ApiModelProperty("返回的状态码")
    private Integer code;

    @ApiModelProperty("返回的消息")
    private String msg;

    @ApiModelProperty("返回的总行数")
    private Long count;

    @ApiModelProperty("返回的数据")
    private T data;

    /**
     * 无参构造
     */
    public ResponseResult() {
    }

    /**
     * 全参构造
     *
     * @param code    返回的状态码
     * @param message 返回的消息
     * @param data    返回的数据
     * @param count   返回的总行数
     */
    public ResponseResult(Integer code, String message, T data, Long count) {
        this.code = code;
        this.msg = message;
        this.data = data;
        this.count = count;
    }

    /**
     * 重载构造
     *
     * @param code    返回的状态码
     * @param message 返回的消息
     * @param data    返回的数据
     */
    public ResponseResult(Integer code, String message, T data) {
        this.code = code;
        this.msg = message;
        this.data = data;
    }

    /**
     * 重载构造
     *
     * @param code    返回的状态码
     * @param message 返回的消息
     */
    public ResponseResult(Integer code, String message) {
        this.code = code;
        this.msg = message;
    }

    /**
     * 重载构造枚举
     *
     * @param resultEnum 状态枚举
     */
    public ResponseResult(ResultEnum resultEnum) {
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMessage();
    }

    /**
     * 操作成功
     *
     * @return
     */
    public static ResponseResult sucess() {
        return new ResponseResult(ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getMessage());
    }

    /**
     * 操作成功
     *
     * @return
     */
    public static ResponseResult sucess(Object data) {
        ResponseResult result = new ResponseResult();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMsg(ResultEnum.SUCCESS.getMessage());
        result.setData(data);
        return result;
    }

    /**
     * 操作成功
     *
     * @return
     */
    public static ResponseResult sucess(Object data,Long count) {
        ResponseResult result = new ResponseResult();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMsg(ResultEnum.SUCCESS.getMessage());
        result.setCount(count);
        result.setData(data);
        return result;
    }

    /**
     * 操作失败
     *
     * @return
     */
    public static ResponseResult fail() {
        return new ResponseResult(ResultEnum.FAIL.getCode(), ResultEnum.FAIL.getMessage());
    }

}
