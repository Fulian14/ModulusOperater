package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        testOddness();


    }
        public static void testOddness(){

             int number = 17;

            Scanner input;
            input= new Scanner(System.in);

            System.out.println("Number is odd:"+(number % 2 != 0));
        }
    }

