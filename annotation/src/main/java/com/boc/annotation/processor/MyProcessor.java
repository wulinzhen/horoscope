package com.boc.annotation.processor;

import com.google.auto.service.AutoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import java.util.Set;
@AutoService(Processor.class)
public class MyProcessor extends AbstractProcessor {
    @Override
    public synchronized void init(ProcessingEnvironment env){ }
    private Logger logger = LoggerFactory.getLogger(MyProcessor.class);
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        logger.info("com.boc.annotation.TestAnnotation");
        System.out.println("com.boc.annotation.TestAnnotation");
        return true;
    }
}
