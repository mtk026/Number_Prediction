package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random orgin = new Random();
        Scanner prediction = new Scanner(System.in);
        System.out.println("hello you have 5 predicition if you finf the number which is 0 to 20");
        System.out.println("you will win");


        int baseNumber = orgin.nextInt(20);

        //test
        // System.out.println(baseNumber);


        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter prediction");

            int prediction1 = prediction.nextInt();
            if (prediction1 < 0 || prediction1 > 20) {
                int remained = 4 - i;
                System.out.println("please enter from 0 to 20 "+" remaind "+ remained);
                continue;
            } else {
                if (baseNumber == prediction1 && i < 5) {
                    System.out.println("you win congrutulations" + baseNumber + " " + prediction1);
                    break;
                } else if (i < 3) {
                    int remained = 4 - i;

                    System.out.println("try one mor time " + "remained " + remained);

                } else if(i==4){
                    System.out.println("this your last chanse");

                }

            }

        }
    }
}