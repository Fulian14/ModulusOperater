package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        testOddness();
        KeepContained();
        lastdigit();

    }
        public static void testOddness() {

            int number;

            Scanner keyboard;
            keyboard = new Scanner(System.in);

            System.out.println("Give me a positive number");
            number = keyboard.nextInt();
            System.out.println("Number is odd:" + (number % 2 != 0));



        }

            public static void KeepContained() {

                int number;

                Scanner keyboard;
                keyboard = new Scanner(System.in);
                System.out.println("Give me a positive number");
                number = keyboard.nextInt();
                System.out.println("number contained is:" + (number % 8));
            }


                public static void lastdigit()  {

                int number;
                Scanner keyboard;
                keyboard = new Scanner(System.in);
                System.out.println("Give me a positive number that is 4 digits long");
                number = keyboard.nextInt();
                System.out.println("Last digit of number is:" + number%10);




        }
    }

