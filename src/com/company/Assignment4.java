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
        int repeatCount = 0;
        String temp = "";
        boolean prevSpace = true;
        boolean keep = false;

        // Checks for vowels and space
        for (int i = 0; i < input.length(); i++) {
            if ("aeiou".indexOf(input.substring(i, i + 1)) != -1) {
                if (prevSpace == true) {
                    keep = true;
                } else {
                    keep = false;
                    vowelCount++;
                }
            } else {
                if (i != input.length() - 1 && input.substring(i, i + 1).equals(input.substring(i + 1, i + 2))) {
                    keep = false;
                    repeatCount++;
                } else {
                    keep = true;
                }
            }
            if (input.substring(i, i + 1).equals(" ")) {
                prevSpace = true;
            } else {
                prevSpace = false;
            }
            if (keep == true) {
                temp = temp + input.substring(i, i + 1);
            }
        }
        // Algorithm 1 Output
        System.out.println("Algorithm 1");
        System.out.println("Vowels remove: " + vowelCount);
        System.out.println("Repeats remove: " + repeatCount);
        System.out.println("Algorithm 1 message: " + temp);
        System.out.println("Algorithm 1 characters saved: " + (input.length()-temp.length()));



        // Algorithm 2
        String temp2 = "";
        for (int i = 0; i < input.length(); i++) {
            int letterCount = 0;
            
            for (int j = 0; j < input.length(); j++) {

                if (input.substring(i, i + 1).equals(input.substring(j, 
                }
            }
            if(temp2.indexOf(input.substring(i, i + 1)) == -1 && !(input.substring(i, i + 1).equals(" "))) {
                temp2 += letterCount + input.substring(i, i + 1);
            }
        }
        System.out.println("\nAlgorithm 2");
        System.out.println("Unique characters found: " + (temp2.length() / 2));
        System.out.println("Algorithm 2 message: " + temp2);
        System.out.println("Algorithm 2 characters saved: " + (input.length() - temp2.length());
    }
}
