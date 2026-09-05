package com.During_Programming_Session;

public class Remove_Duplicate {
    public static void main(String[] args) {

        int arr[] = { 2, 1, 23, 4, 3, 2, 54, 3, 5,5,2 };
        int temp[] = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDup = false;
            for (int j = 0; j < count; j++) {
                if (arr[i] == temp[j]) {
                    isDup = true;
                    break;
                }
            }
            if (!isDup) {
                temp[count++] = arr[i];
             }
        }

        System.out.print("Unique Array: ");
        for (int i = 0; i < count; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}