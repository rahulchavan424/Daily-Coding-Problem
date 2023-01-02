package com.example;

import java.util.Scanner;

public class primeNumberSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countDiv, countNum=0;
        System.out.println("Enter number of prime numbers required: ");
        int n = sc.nextInt();
        System.out.println("First " + n + " prime numbers are: ");
        int N = 100;

        for (int i = 2; i <= N && countNum<n; i++) {
            countDiv = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    countDiv++;
                }
            }
            if (countDiv == 2) {
                countNum++;
                System.out.println(i+" ");
                }
            }
        }
    }


