package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int centcount = 0;
        float change;
        do {
            System.out.print("How much change is owed?: ");
            change = keyboard.nextFloat();
        } while (change < 0);

        int cents = Math.round(change * 100);
        for ( int quarter = 1;cents >=25; quarter++) {
            cents = cents - 25;
            centcount ++;
        }
        for ( int dime= 1; cents >=10 ;dime ++) {
            cents = cents - 10;
            centcount++;
        }
        for (int nickel = 1; cents >=5 ; nickel++) {
            cents= cents - 5;
            centcount++;
        }
        for ( int penny = 1; cents >=1; penny++){
            cents= cents - 1;
            centcount ++;
        }
        System.out.println("You get " + centcount +" coins back");
        }



}

