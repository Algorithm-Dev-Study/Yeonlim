package com.yl.gbdstudy.baekjoon.week01;

import java.util.Scanner;

/*
 * 백준 10828 : 스택
 * 정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
 * */
public class BJ_10828_Stack {

    public static int[] stack;
    public static int size = 0;

    public static void push(int item) {
        stack[size++] = item;
    }

    public static int pop() {
        if(size == 0) return -1;
        else {
            stack[size--] = 0;
            return stack[size];
        }
    }

    public static int size() {
        return size;
    }

    public static int empty() {
        if(size == 0) return 1;
        else return 0;
    }

    public static int top() {
        if(size == 0) return -1;
        else return stack[size - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();

        stack = new int[num];

        for(int i = 0; i < num; i++) {
            String str = sc.next();
            switch (str) {
                case "push":
                    push(sc.nextInt());
                    break;
                case "pop":
                    sb.append(pop()).append('\n');
                    break;
                case "size":
                    sb.append(size()).append('\n');
                    break;
                case "empty":
                    sb.append(empty()).append('\n');
                    break;
                case "top":
                    sb.append(top()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }
}
