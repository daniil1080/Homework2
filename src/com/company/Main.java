/* Даниил Лазарев
Домашняя работа к 2 занятию.
 */
package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task 1: ");
        changeArray();
        System.out.println("\n\nTask 2: ");
        createArray();
        System.out.println("\n\nTask 3: ");
        changeArray2();
        System.out.println("\n\nTask 4: ");
        createArray2();
        System.out.println("\nTask 5: ");
        findMinimalAndMaximalElementOfArray();
        System.out.println("\nTask 6: ");
        System.out.println(checkBalance(new int[]{1, 1, 1, 2, 1}));
        System.out.println(checkBalance(new int[]{2, 1, 1, 2, 1}));
        System.out.println(checkBalance(new int[]{10, 10}));
        System.out.println("\nTask7");
        modifyArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, -2);


    }


    //Задание №1
    static void changeArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Before: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
        System.out.println("\nAfter: ");
        for (int i : arr) {
            System.out.println(i + "");
        }
    }
        //Задание №2
        static void createArray () {
            int[] arr = new int[8];
            for (int i = 0, j = 0; i < arr.length; i++, j += 3) {
                arr[i] = j;
            }

        }


    //Задание №3
    static void changeArray2() {
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int b = 0; b < arr3.length; b++) {
            if (arr3[b] < 6) arr3[b] *= 2;
            System.out.println(arr3[b] + "");

        }
    }

    //Задание №4

    private static void createArray2() {
        int length = 5;

        int[][] arr4 = new int[length][length];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < length; j++) {
                if ((i == j) || (i == length - 1 - j)) {
                    arr4[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.println(arr4[i][j] + "");
            }
            System.out.println();
        }
    }


    //Задание №5
    static void findMinimalAndMaximalElementOfArray() {
        int[] arr = {10, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1,};
        int min = arr[0], max = arr[0];
        System.out.println("in array: ");
        for (int i : arr) {
            System.out.println(i + "");
        }
        for (int i = 0; i < arr.length; i++) {
            min = (min < arr[i]) ? min : arr[i];
            max = (max > arr[i]) ? max : arr[i];
        }
        System.out.println("\nminimal element is: " + min + "\nmaximal element is: " + max);
    }


    //Задание №6
    static boolean checkBalance(int[] arr) {
        int leftSum = 0, rightSum = 0;

        for (int q = 0; q < arr.length + 1; q++) {
            leftSum = 0;
            rightSum = 0;

            for (int w = 0; w < q; w++) {
                leftSum += arr[w];
            }
            for (int w = q; w < arr.length; w++) {
                rightSum += arr[w];
            }
            if (leftSum == rightSum) return true;
        }
        return false;
    }

    //Задание №7
    static void modifyArray(int[] arr, int n) {
        System.out.println("Before: ");
        for (int i : arr) {
            System.out.println(i + "");
        }
        System.out.println("(n = " + n + ")");

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int tmp = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = tmp;
            }
        } else if (n < 0) {
            for (int i = 0; i < n; i++) {
                int tmp = arr[0];
                for (int j = 0; j < arr.length; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = tmp;

            }
        }
        System.out.println("\nAfter; ");
        for (int i : arr) {
            System.out.println(i + "");
        }
    }

}

