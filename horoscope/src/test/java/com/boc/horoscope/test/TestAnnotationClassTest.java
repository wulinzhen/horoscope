package com.boc.horoscope.test;

import com.boc.horoscope.HoroscopeApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;

import static org.junit.Assert.*;

public class TestAnnotationClassTest extends HoroscopeApplicationTests {

    private Logger logger = LoggerFactory.getLogger(TestAnnotationClassTest.class);
    @Test
    public void test00(){
        logger.info("test00");
        /**
         * {@link com.boc.annotation.processor.MyProcessor#process(Set, RoundEnvironment)}
         * @see com.boc.annotation.processor.MyProcessor
         */
        TestAnnotationClass testAnnotation = new TestAnnotationClass();
        testAnnotation.setName("");
        testAnnotation.getName();
    }
}