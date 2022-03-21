package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        int ones = number % 10;
        int tens = (number / 10) % 10;
        int hundreds = number / 100;

        if (hundreds == 0) {
            if (tens == 0) {
                switch (ones) {
                    case 0:
                        System.out.print("Zero");
                        break;
                    case 1:
                        System.out.print("One");
                        break;
                    case 2:
                        System.out.print("Two");
                        break;
                    case 3:
                        System.out.print("Three");
                        break;
                    case 4:
                        System.out.print("Four");
                        break;
                    case 5:
                        System.out.print("Five");
                        break;
                    case 6:
                        System.out.print("Six");
                        break;
                    case 7:
                        System.out.print("Seven");
                        break;
                    case 8:
                        System.out.print("Eight");
                        break;
                    case 9:
                        System.out.print("Nine");
                        break;
                }
            } else if (tens == 1) {
                switch (ones) {
                    case 0:
                        System.out.print("Ten");
                        break;
                    case 1:
                        System.out.print("Eleven");
                        break;
                    case 2:
                        System.out.print("Twelve");
                        break;
                    case 3:
                        System.out.print("Thirdteen");
                        break;
                    case 4:
                        System.out.print("Fourteen");
                        break;
                    case 5:
                        System.out.print("Fifteen");
                        break;
                    case 6:
                        System.out.print("Sixteen");
                        break;
                    case 7:
                        System.out.print("Seventeen");
                        break;
                    case 8:
                        System.out.print("Eighteen");
                        break;
                    case 9:
                        System.out.print("Nineteen");
                        break;
                }
            } else if (tens > 1 && tens <= 9) {
                switch (tens) {
                    case 2:
                        System.out.print("Twenty ");
                        break;
                    case 3:
                        System.out.print("Thirsty ");
                        break;
                    case 4:
                        System.out.print("Four ");
                        break;
                    case 5:
                        System.out.print("Fifty ");
                        break;
                    case 6:
                        System.out.print("Sixty ");
                        break;
                    case 7:
                        System.out.print("Seventy ");
                        break;
                    case 8:
                        System.out.print("Eighty ");
                        break;
                    case 9:
                        System.out.print("Ninety ");
                        break;
                }
                switch (ones) {
                    case 1:
                        System.out.print("One");
                        break;
                    case 2:
                        System.out.print("Two");
                        break;
                    case 3:
                        System.out.print("Three");
                        break;
                    case 4:
                        System.out.print("Four");
                        break;
                    case 5:
                        System.out.print("Five");
                        break;
                    case 6:
                        System.out.print("Six");
                        break;
                    case 7:
                        System.out.print("Seven");
                        break;
                    case 8:
                        System.out.print("Eight");
                        break;
                    case 9:
                        System.out.print("Nine");
                        break;
                }
            }
        } else {
            switch (hundreds) {
                case 1:
                    System.out.print("One hundred and ");
                    break;
                case 2:
                    System.out.print("Two hundred and ");
                    break;
                case 3:
                    System.out.print("Three hundred and ");
                    break;
                case 4:
                    System.out.print("Four hundred and ");
                    break;
                case 5:
                    System.out.print("Five hundred and ");
                    break;
                case 6:
                    System.out.print("Six hundred and ");
                    break;
                case 7:
                    System.out.print("Seven hundred and ");
                    break;
                case 8:
                    System.out.print("Eight hundred and ");
                    break;
                case 9:
                    System.out.print("Nine hundred and ");
                    break;
            }
            if (tens == 0) {
                switch (ones) {
                    case 0:
                        break;
                    case 1:
                        System.out.print("One");
                        break;
                    case 2:
                        System.out.print("Two");
                        break;
                    case 3:
                        System.out.print("Three");
                        break;
                    case 4:
                        System.out.print("Four");
                        break;
                    case 5:
                        System.out.print("Five");
                        break;
                    case 6:
                        System.out.print("Six");
                        break;
                    case 7:
                        System.out.print("Seven");
                        break;
                    case 8:
                        System.out.print("Eight");
                        break;
                    case 9:
                        System.out.print("Nine");
                        break;
                }
            } else if (tens == 1) {
                switch (ones) {
                    case 0:
                        System.out.print("Ten");
                        break;
                    case 1:
                        System.out.print("Eleven");
                        break;
                    case 2:
                        System.out.print("Twelve");
                        break;
                    case 3:
                        System.out.print("Thirdteen");
                        break;
                    case 4:
                        System.out.print("Fourteen");
                        break;
                    case 5:
                        System.out.print("Fifteen");
                        break;
                    case 6:
                        System.out.print("Sixteen");
                        break;
                    case 7:
                        System.out.print("Seventeen");
                        break;
                    case 8:
                        System.out.print("Eighteen");
                        break;
                    case 9:
                        System.out.print("Nineteen");
                        break;
                }
            } else if (tens > 1 && tens <= 9) {
                switch (tens) {
                    case 2:
                        System.out.print("Twenty ");
                        break;
                    case 3:
                        System.out.print("Thirsty ");
                        break;
                    case 4:
                        System.out.print("Four ");
                        break;
                    case 5:
                        System.out.print("Fifty ");
                        break;
                    case 6:
                        System.out.print("Sixty ");
                        break;
                    case 7:
                        System.out.print("Seventy ");
                        break;
                    case 8:
                        System.out.print("Eighty ");
                        break;
                    case 9:
                        System.out.print("Ninety ");
                        break;
                }
                switch (ones) {
                    case 1:
                        System.out.print("One");
                        break;
                    case 2:
                        System.out.print("Two");
                        break;
                    case 3:
                        System.out.print("Three");
                        break;
                    case 4:
                        System.out.print("Four");
                        break;
                    case 5:
                        System.out.print("Five");
                        break;
                    case 6:
                        System.out.print("Six");
                        break;
                    case 7:
                        System.out.print("Seven");
                        break;
                    case 8:
                        System.out.print("Eight");
                        break;
                    case 9:
                        System.out.print("Nine");
                        break;
                }
            }
        }