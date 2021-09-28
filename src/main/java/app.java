/*
 *  UCF COP3330 Fall 2021 Assignment 16 Solution
 *  Copyright 2021 Josh Boada
 */

import java.util.Scanner;

public class app {
    public static void main( String[] args )
    {
        Scanner input= new Scanner(System.in);
        System.out.print("What is your age? ");
        int age =input.nextInt();

        if(age <= 0) {
            System.out.println("Enter a valid age");
        }
        else
        {
            int validage= 16;
            System.out.println( age >= validage ? "You are old enough to legally drive." : "You are not old enough to drive.");
        }
    }
}