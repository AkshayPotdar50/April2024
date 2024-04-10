package com.java.array;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {

        int[] numbers ={10, 20, 10, 23, 54, 74, 12 };

        //basic problems
        double average= Arrays.stream(numbers).average().orElse(0.0);
        System.out.println(average);

        int seconLrgest =Arrays.stream(numbers).distinct().boxed().sorted((a, b)->b-a).skip(1).findFirst().orElse(-1);

        int secondSmallest =Arrays.stream(numbers).distinct().boxed().sorted().skip(1).findFirst().orElse(-1);

        System.out.println(secondSmallest +" "+seconLrgest);

        System.out.println("*********************************************************");

        int[] arr={10, 0, 12, 0, 14, 0, 16, 0, 20};
        moveZerosToStart(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("*********************************************************");

        moveZerosToStart3(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("*********************************************************");

        moveZerosToStart2(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("*********************************************");

        moveZerosToStart4(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void moveZerosToStart(int[] arr){
        int n = arr.length;
        int nonZeroIndex = n - 1; // Start from the end of the array
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[nonZeroIndex];
                arr[nonZeroIndex] = temp; // Move non-zero element to the end
                nonZeroIndex--; // Decrement nonZeroIndex after the swap
            }
        }
    }
    private static void moveZerosToStart2(int[] arr){
        int n = arr.length;
        int nonZeroIndex = n - 1; // Start from the end of the array
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[nonZeroIndex];
                arr[nonZeroIndex] = temp; // Move non-zero element to the end
                nonZeroIndex--; // Decrement nonZeroIndex after the swap
            }
        }
    }
    private static void moveZerosToStart3(int[] arr) {
        int[] nonZeroElements = Arrays.stream(arr)
                .filter(num -> num != 0)
                .toArray();
        int numZeros = arr.length - nonZeroElements.length;
        Arrays.fill(arr, 0); // Fill the array with zeros
        System.arraycopy(nonZeroElements, 0, arr, numZeros, nonZeroElements.length);
    }


    private static void moveZerosToStart4(int[]arr){
        int n=arr.length;
        int nonZeroElement=n-1;

        for(int i=n-1; i>=0; i--){
            if(arr[i] !=0){
                int temp =arr[i];
                arr[i] =arr[nonZeroElement];
                arr[nonZeroElement]=temp;
                nonZeroElement--;
            }
        }
    }


}
