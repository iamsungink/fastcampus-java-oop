package com.fastcampus.oop;

import com.fastcampus.oop.logic.JavaSort;
import com.fastcampus.oop.logic.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Sort<String> sort = new JavaSort<>();

        System.out.println("[result]=" + sort.sort(Arrays.asList(args)));

    }
}