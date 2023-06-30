package com.atguigu.exception;

import com.atguigu.result.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(Exception e){
        e.printStackTrace();
        return Result.fail();
    }


    /**
     * 自定义异常处理方法
     * @param e
     * @return
     */
//    @ExceptionHandler(SsyxException.class)
//    @ResponseBody
//    public Result error(SsyxException e){
//        return Result.build(null,e.getCode(),e.getMessage());
//    }
}
