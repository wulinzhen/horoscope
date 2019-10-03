package com.boc.server;

import com.boc.annotation.TestAnnotation;
import lombok.Data;

@Data
public class TestAnnotationClass {
    @TestAnnotation
    private String name;

//    @TestAnnotation("sas")
//    public String getName() {
//        return name;
//    }
//
//    @TestAnnotation
//    public void setName(String name) {
//        this.name = name;
//    }
}
