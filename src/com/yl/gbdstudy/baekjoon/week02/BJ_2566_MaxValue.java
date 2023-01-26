package com.yl.gbdstudy.baekjoon.week02;

import java.util.Scanner;

/*
 * 백준 2566 : 최댓값
 *
 * */
public class BJ_2566_MaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[9][9];
        int max = 0;
        int row = 0, col = 0;

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                arr[i][j] = sc.nextInt();
                if(max < arr[i][j]) {
                    max = arr[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println(max);
        System.out.println((row + 1) + " " + (col + 1));
    }
}
