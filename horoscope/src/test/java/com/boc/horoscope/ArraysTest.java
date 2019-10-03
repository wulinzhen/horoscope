package com.boc.horoscope;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysTest {
    private Logger logger  = LoggerFactory.getLogger(ArraysTest.class);
    @Test
    public void ArraysCopy(){
        List<String> list = new ArrayList<String>();
        list.add("one") ;
        list.add("two");
        list.add("three");

        Object[] arrayl = list.toArray();
        list.toArray(arrayl);
        System.out.println(Arrays.asList(arrayl));


        String[] array2 = new String[ 2 ];
        list.toArray(array2);
        System.out.println(Arrays.asList(array2));

        String[] array3 = new String[ 3];
        list.toArray(array3);
        System.out.println(Arrays.asList(array3));

        Integer.valueOf(20);

        Integer.getInteger("+78",6);
        System.out.println(Integer.valueOf("+10011",10));

        for (int i = -10; i < 10; i++) {
            System.out.println( i & -i);
        }
        System.out.println( "---------------------");
        for (int i = -10; i < 10; i++) {
            System.out.println( i | -i);
        }
        System.out.println( 100 & 1);

        System.out.println( 100 | 22);


    }

    @Test
    public void ListTTest(){
        List<? extends Animal> list = new ArrayList<>(Arrays.asList(new Animal(),new Cat(),new Garfield()));

    }
}
