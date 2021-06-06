package com.project.bootcamp.exceptions;

import com.project.bootcamp.util.MessageUtils;
import org.aspectj.weaver.ast.Not;

public class NotFoundException extends RuntimeException {

    public NotFoundException(){
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}
