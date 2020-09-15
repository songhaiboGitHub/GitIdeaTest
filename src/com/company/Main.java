package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println( test());
        System.out.println(new Main().equals("a"));
    }
    public static String test(){
        return "测试git";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return 2;
    }
}
