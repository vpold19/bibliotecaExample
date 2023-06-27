package org.example;
import org.apache.commons.lang3.StringUtils;



public class Main {
    public static void main(String[] args) {
        String letterAndSpaceStr = "Vadim Poldolin";
        String emptyStr = "   ";
        System.out.println(StringUtils.capitalize(letterAndSpaceStr));
        System.out.println(StringUtils.deleteWhitespace(letterAndSpaceStr));
        System.out.println(StringUtils.substringAfterLast(letterAndSpaceStr, " "));
        System.out.println();
        System.out.println(StringUtils.isAllUpperCase(letterAndSpaceStr));
        System.out.println(StringUtils.isAlphanumericSpace(letterAndSpaceStr));
        System.out.println(StringUtils.isWhitespace(emptyStr));

    }
}