/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Grafton
 */
import java.util.Calendar;
import java.util.Scanner;
import java.lang.String;


public class Assignment_1_Exercise_6 {

        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);   //create scanner object

            int current_year = Calendar.getInstance().get(Calendar.YEAR);


            System.out.print("What is your current age? ");       //get age of user
            int age = in.nextInt();

            System.out.print("At what age would you like to retire? ");       //get retirement age of user
            int retire_age = in.nextInt();

            int years_left = retire_age - age;                   //compute years left to retire
            System.out.println("You have " + years_left + " years left until you can retire.");   //print years left

            int retire_year = current_year + years_left;       //compute at which year they should retire
            System.out.println("It's " + current_year +", so you can retire in " + retire_year + ".");

        }

    }

