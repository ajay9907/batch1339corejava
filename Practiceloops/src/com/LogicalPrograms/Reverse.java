package com.LogicalPrograms;

public class Reverse {

    public static void main(String[] args) {

        int num = 123;
        int rev = 0;

        while (num > 0) {

            int digit = num % 10;     // Get last digit
            rev = rev * 10 + digit;   // Build reverse number
            num = num / 10;           // Remove last digit
        }

        System.out.println("Reverse Number : " + rev);
    }
}