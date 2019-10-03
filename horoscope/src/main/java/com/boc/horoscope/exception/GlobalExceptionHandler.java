package com.boc.horoscope.exception;

import com.boc.common.errorcode.HoroScopeErrorCode;
import com.boc.common.exception.HoroScopeException;
import com.boc.common.result.ResultBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
    private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    /**
     * @ExceptionHandler 匹配抛出自定义的异常类型 MyException
     * ErrorInfo<String> 为自定义的一个数据封装类，用于返回的json数据
     * 如果返回的是json格式，需要加上@ResponsBody
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultBean<String> jsonErrorHandler(Exception e) throws Exception{
        logger.info(e.getMessage(),e);
        if (e instanceof HoroScopeException){
            HoroScopeException horoScopeException = (HoroScopeException) e;
            return horoScopeExceptionHandler(horoScopeException);
        }
        ResultBean<String> error = new ResultBean<>();
        error.setCode(HoroScopeErrorCode.COMMON_ERROR);
        error.setMessage(e.getMessage());
        return error;
    }

    private ResultBean<String> horoScopeExceptionHandler(HoroScopeException e){
        ResultBean<String> error = new ResultBean<>();
        error.setCode(e.getCode());
        error.setMessage(e.getMsg());
        return error;
    }

}
