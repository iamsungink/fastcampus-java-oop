package com.fastcampus.oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

//        List<Integer> intList = new ArrayList<>();
//        intList.add(64);
//        intList.add(34);
//        intList.add(25);
//        intList.add(12);
//        intList.add(22);
//        intList.add(11);
//        intList.add(90);
//
//        System.out.println("Before sorting:");
//        System.out.println(intList);
//
//        BubbleSort bubbleSort = new BubbleSort();
//        List<Integer> sortedIntList = bubbleSort.sort(intList);
//
//        System.out.println("After sorting:");
//        System.out.println(sortedIntList);

        BubbleSort<String> sort = new BubbleSort<>();

        System.out.println("[result]=" + sort.sort(Arrays.asList(args)));

    }
}