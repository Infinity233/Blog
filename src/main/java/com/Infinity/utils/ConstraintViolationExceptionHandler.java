package com.Infinity.utils;


import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

// Bean验证处理
public class ConstraintViolationExceptionHandler {

    public static String getMessage(ConstraintViolationException e) {
        List<String> msgList = new ArrayList<>();

        for(ConstraintViolation<?> constraintViolation: e.getConstraintViolations()) {
            msgList.add(constraintViolation.getMessage());
        }

        return StringUtils.join(msgList.toArray(), ";");
    }
}
