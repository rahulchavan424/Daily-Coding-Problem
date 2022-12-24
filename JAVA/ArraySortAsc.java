package com.example;

import java.util.Scanner;

public class ArraySortAsc {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in array: ");
        int n = sc.nextInt();
        int temp=0;

        int[] array = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }

        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (array[i]>array[j]){
                   temp = array[i];
                   array[i] = array[j];
                   array[j] = temp;
                }
            }
        }
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }
}
