package com.yl.gbdstudy.baekjoon.week02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * 백준 4949 : 균형잡힌 문자열
 *
 * */
public class BJ_4949_Balance {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = "";

        while(true) {
            str = sc.nextLine();
            if(str.equals(".")) break;
            else System.out.println(checkBalance(str));
        }
    }

    public static String checkBalance(String str) {
        char c;
        int size = 0;
        ArrayList<Character> arr = new ArrayList<Character>();

        for(int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            size = arr.size();
            if(c == '(' || c == '[') {
                arr.add(c);
            } else if (c == ')') {
                if (size == 0 || arr.remove(size - 1) != '(') {
                    return "no";
                }
            } else if (c == ']') {
                if (size == 0 || arr.remove(size - 1) != '[') {
                    return "no";
                }
            }
        }

        if(size == 0) return "yes";
        else return "no";
    }
}

