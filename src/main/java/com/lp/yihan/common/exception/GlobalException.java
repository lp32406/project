package com.lp.yihan.common.exception;

import com.lp.yihan.common.result.ResponseResult;
import com.lp.yihan.common.result.ResultEnum;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.http.ResponseUtil;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

/**
 * @author lp
 * @create 2020/5/23 12:37
 * 全局异常处理
 */
@Slf4j
@RestControllerAdvice
public class GlobalException {

    /**
     * validation参数校验异常
     * @param e
     * @return
     */
    @ExceptionHandler(value = org.springframework.validation.BindException.class)
    public ResponseResult validationBindException(org.springframework.validation.BindException e) {
        List<ObjectError> allErrors = e.getAllErrors();
        String errorMsg = null;
        for (ObjectError objectError : allErrors) {
            errorMsg = objectError.getDefaultMessage();
        }
        return new ResponseResult(ResultEnum.BODY_NOT_MATCH.getCode(),  errorMsg);
    }

    /**
     * 业务异常
     *
     * @param e
     * @return
     */
    public ResponseResult bizExceptionHandler(BizException e) {
        log.error("发生业务异常！原因是：{}", e.getMessage());
        return new ResponseResult(e.getErrorCode(), e.getMessage());
    }

    /**
     * 其他异常
     *
     * @param e
     * @return
     */
    public ResponseResult exceptionHandler(Exception e) {
        log.error("未知异常！原因是: {}", e.getMessage());
        return new ResponseResult(ResultEnum.UNKNOWN_ERROR);
    }
}
