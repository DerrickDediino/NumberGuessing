package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("This is the number guessing game. Pick a number between 1 and 100 inclusive.");

        Scanner keyboard = new Scanner(System.in);
        Integer number = keyboard.nextInt();

        int computerNumber = (int) (Math.random()*100);

       do{
           System.out.println("Your number is too high.");
       }while (number>computerNumber);



    }
}
