package org.example;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.common.util.concurrent.*;
import java.util.List;
import java.util.Set;

public class Array {
    public static void main(String[] args) {
        List<String> num = Lists.newArrayList("1","2","3");
        List<String> numbers2 = Lists.newLinkedList(num);
        Set<String> numbersSet = Sets.newHashSet("1","2", "2", "3", "4", "5");
        System.out.println(num);
        System.out.println(numbers2);
        System.out.println(numbersSet);
    }
}
