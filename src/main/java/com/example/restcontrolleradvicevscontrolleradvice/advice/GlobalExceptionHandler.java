package com.example.restcontrolleradvicevscontrolleradvice.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice

public class GlobalExceptionHandler {

    @ExceptionHandler(NullPointerException.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
   public Map<String,String> handleNullPointer( NullPointerException exception ) {
       Map<String,String>  errorMap = new HashMap<String,String>();
       errorMap.put("error message ", exception.getMessage());
       return errorMap;
    }
}
