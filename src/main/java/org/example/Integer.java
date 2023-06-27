package org.example;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

import javax.annotation.processing.Generated;
import java.util.Random;

public class Integer {


    static Random MAX_VALUE = new Random(1000000000);

    public static void main(String[] args) {
        int a = 5;
        int b = 100500;
        int c = Integer.MAX_VALUE.nextInt();
        System.out.println(NumberUtils.min(a,b,c));
        System.out.println(NumberUtils.max(a,b,c));

        String floatedPointString = "1.0f";
        float f = NumberUtils.toFloat(floatedPointString);
        System.out.println(f);
    }
}

