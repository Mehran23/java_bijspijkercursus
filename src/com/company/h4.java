package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class h4 {

    public static void main(String[] args){

        //Voorbereidingen
        char userInput;
        Scanner scanner= new Scanner(System.in);

         //Opdracht 4.1
        System.out.println("Opdracht 4.1\n");
        System.out.print("Van welke waarde wil je de ASCII waarde weten?");
         userInput= scanner.nextLine().charAt(0);
         int asciiValue= (int) userInput;
         System.out.println("De ASCII waarde van het karakter " + userInput + " is " + asciiValue + ".\n");

         //Opdracht 4.2
        System.out.println("Opdracht 4.2\n");
        System.out.println("Van welk karakter wil je weten of het een getal of letter is?");
        userInput= scanner.nextLine().charAt(0);
        if (Character.isLetter(userInput)){
            System.out.println("De " + userInput + " is een letter.");
        } else if (Character.isDigit(userInput)){
            System.out.println("De " + userInput + " is een getal.");
        } else {
            System.out.println("De " + userInput + " is geen letter en ook geen getal.\n");
        }

        //Opdracht 4.3
        System.out.println("Opdracht 4.3\n");
        System.out.println("Van welke letter wil je weten of het een klinker is?");
        userInput= scanner.nextLine().toLowerCase().charAt(0);
        if (userInput == 'a' || userInput == 'e' || userInput == 'i' || userInput == 'o' || userInput == 'u'){
            System.out.println("De " + userInput + " is een klinker.\n");
        } else {
            System.out.println("De " + userInput + "is een medeklinker.\n");
        }

        //Opdracht 4.4
        System.out.println("Opdracht 4.4\n");
        System.out.println("Van welke letter wil je het nummer in International standard letter/number mapping weten?");
        userInput= scanner.nextLine().toLowerCase().charAt(0);
        if (userInput == 'a' || userInput == 'b' || userInput == 'c'){
            System.out.println("De letter " + userInput + " staat op de 2-toets.\n");
        } else if (userInput == 'd' || userInput == 'e' || userInput == 'f'){
            System.out.println("De letter " + userInput + " staat op de 3-toets.\n");
        } else if (userInput == 'g' || userInput == 'h' || userInput == 'i'){
            System.out.println("De letter " + userInput + " staat op de 4-toets.\n");
        } else if (userInput == 'j' || userInput == 'k' || userInput == 'l'){
            System.out.println("De letter " + userInput + " staat op de 5-toets.\n");
        } else if (userInput == 'm' || userInput == 'n' || userInput == 'o'){
            System.out.println("De letter " + userInput + " staat op de 6-toets.\n");
        } else if (userInput == 'p' || userInput == 'q' || userInput == 'r' || userInput == 's'){
            System.out.println("De letter " + userInput + " staat op de 7-toets.\n");
        } else if (userInput == 't' || userInput == 'u' || userInput == 'v'){
            System.out.println("De letter " + userInput + " staat op de 8-toets.\n");
        } else if (userInput == 'w' || userInput == 'x' || userInput == 'y' || userInput == 'z'){
            System.out.println("De letter " + userInput + " staat op de 9-toets.\n");
        } else {
            System.out.println("De " + userInput + " staat niet op de toets.\n" );
        }


        //Opdracht 4.5
        System.out.println("Opdracht 4.5\n");
        int randomNumber= (int) (Math.random() * 26 + 97);
        char aschiiChar = (char) randomNumber;
        System.out.println("Uw willekeurige letter is de '" + aschiiChar + "'.\n");


        //Opdracht 4.6
        System.out.println("Opdracht 4.6\n");
        System.out.print("Type een string: ");
        String userString= scanner.nextLine();
        int lengte= userString.length();
        System.out.println("De lengte van de String is " + lengte + ".");
        char firstChar= userString.charAt(0);
        System.out.println("Het eerste karakter is " + firstChar + ".");
        char lastChar= userString.charAt(lengte - 1);
        System.out.println("Het laatste karakter is " + lastChar + ".\n");

        //Opdracht 4.7
        System.out.println("Opdracht 4.7\n");
        System.out.println("Land 1: ");
        String country1 =scanner.nextLine();
        System.out.println("Land 2: ");
        String country2 =scanner.nextLine();
        System.out.println("Land 3: ");
        String country3 =scanner.nextLine();
        String[] countries= {country1,country2,country3};
        Arrays.sort(countries);
        System.out.println(countries[0] + "-" + countries[1] + "-" + countries[2]);



    }
}
