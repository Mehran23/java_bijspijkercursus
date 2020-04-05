package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class h5 {
    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);

        //Opdracht 5.1
        System.out.println("Opdracht 5.1\n");
        boolean proceed= true;
        while (proceed) {
            System.out.print("Wat is je toetscijfer? ");
            double grade = scanner.nextDouble();
            if (grade == -1){
                System.out.println("tot ziens.\n");
                proceed = false;
                continue;
            } else if (grade >= 5.5){
                System.out.println("Je hebt een voldoende!");
            } else {
                System.out.println("Je hebt een onvoldoende.");
            }
        }

        //Opdracht 5.2
        System.out.println("Opdracht 5.2\n");
        int score= 0;
        for (int i=0; i < 10; i++){
            int getal1= (int) (Math.random() * 10 + 1);
            int getal2= (int) (Math.random() * 10 + 1);
            int optelsom= getal1 + getal2;
            System.out.println("Hoeveel is " + getal1 + " + " + getal2 + "?");
            int userinput = scanner.nextInt();
            if (userinput == optelsom){
                System.out.println("Dat klopt!");
                score++;
            } else {
                System.out.println("Helaas, het goede antwoord is " + optelsom + ".");
            }
        }
        System.out.println("De toets is klaar. Je score is " + score + ".\n");

        //Opdracht 5.3
        System.out.println("Opdracht 5.3\n");
        for (int i = 1; i <= 10; i++){
            int product = i * 7;
            System.out.println(i + " x 7 = " + product);
        }

        //Opdracht 5.4
        int lowestNumber = 0;
        System.out.println("Opdracht 5.4\n");
        for (int i= 0; i < 5; i++){
            System.out.print("Typ een getal: ");
            int number= scanner.nextInt();
            if (i == 0){
                lowestNumber= number;
            } else {
                if (number < lowestNumber){
                    lowestNumber = number;
                }
            }
        }
        System.out.println("Het laagste getal wat je hebt getypt= " + lowestNumber + ".\n");

        //Opdracht 5.5
        System.out.println("Opdracht 5.5\n");
        double highestgrade= 0;
        String student= "unknown";
        for (int i = 1; i <= 5; i++){
            System.out.println("Hoe heet de " + i +"e student?: ");
            String name= scanner.nextLine();
            System.out.println("Wat is zijn of haar cijfer?: ");
            double grade= scanner.nextDouble();
            scanner.nextLine();
            if (i == 0){
                highestgrade= grade;
                student= name;
            } else {
                if (grade > highestgrade){
                    highestgrade= grade;
                    student= name;
                }
            }

        }
        System.out.println("Het hoogste cijfer is behaald door " + student );
        System.out.println("Hij of zij had een " + highestgrade + ".");

        //Opdracht 5.6
        //System.out.println("Opdracht 5.6\n");
        //for (int i =0; i < 100; i++){
            //if (i & 5 == 0){
                //System.out.println(i + " is deelbaar door 5.");
          //  }
        //}

        //Opdracht 5.7
        System.out.println("Opdracht 5.7\n");
        proceed= true;
        int counter = 0;
        while (proceed){
            int square = counter * counter;
            if (square < 1000){
                System.out.println("Het getal is " + counter);
                System.out.println("Het kwadraat daarvan is " + square);
                counter++;
            } else {
                proceed = false;
            }
        }
    }
}
