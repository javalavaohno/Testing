package com.company;

import java.util.Scanner;
// Need to change class back to "Assignment4"
class Assignment4 {
    public static void main(String[] args) {

        /* Write your code here */
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the message to be shortened");
        String input = scan.nextLine();
        input = input.toLowerCase();
        int length = input.length();

        // Algorithm 1
        int vowelCount = 0;
        int RepeatCount = 0;
        String temp = "";
        boolean prevSpace = true;
        boolean keep = false;

        // Checks for vowels and space
        for (int i = 0; i < input.length(); i++) {
            if (((input.substring(i, i+1).equals("a") ||
                    input.substring(i, i+1).equals("e") ||
                    input.substring(i, i+1).equals("i") ||
                    input.substring(i, i+1).equals("o") ||
                    input.substring(i, i+1).equals("u")))) {
                keep = false;
                if (prevSpace) {
                    keep = true;
                }
            } else {
                if (i != input.length() - 1 && input.substring(i, i + 1).equals(input.substring(i + 1, i + 2))) {
                    keep = false;
                } else {
                    keep = true;
                }
            }
            if (!(input.substring(i, i + 1).equals(" "))) {
                prevSpace = false;
            }
            if (keep == true) {
                temp = temp + input.substring(i, i + 1);
            }
        }
        System.out.println(temp + prevSpace + keep);
    }
}
