package com.company;

import java.util.Scanner;

public class h1_en_h2 {

    public static void main(String[] args) {

    	//OPDRACHT 1.1
		System.out.println("\nOpdracht 1.1\n");
	    System.out.println("Java is Object Georiënteerd");
	    System.out.println("Java is strongly typed");
	    System.out.println("Java is geen JavaScript");

	    //OPDRACHT 1.2
		System.out.println("Opdracht1.2\n");
		System.out.println("Java is geweldig!");
		System.out.println("Java is geweldig!");
		System.out.println("Java is geweldig!");
		System.out.println("Java is geweldig!");
		System.out.println("Java is geweldig!\n\n");

		//OPDRACHT 1.3
		System.out.println("Opdracht 1.3\n");
		System.out.println("a\ta^2\ta^3\ta^4");
		System.out.println("1\t1\t1\t1");
		System.out.println("2\t4\t8\t16");
		System.out.println("3\t9\t27\t81");
		System.out.println("4\t16\t64\t256\n\n");

		//OPDRACHT 1.4
		System.out.println("Opdracht 1.4\n");
		double teller= 7.5 * 6.5 - 4.5 * 3;
		double noemer= 47.5 * 5.5;
		double breuk= teller / noemer;
		System.out.println(breuk + "\n\n");

		double optie2= (7.5 * 6.5 - 4.5 * 3) / (47.5 * 5.5);
		System.out.println(optie2 + "\n\n");

		//OPDRACHT 1.5
		System.out.println("Opdracht 1.5\n");
		int optelsom= (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10);
		System.out.println(optelsom + "\n\n");

		//OPDRACHT 1.6
		System.out.println("Opdracht 1.6\n");
		double benaderingVanPI= 4 * (1 - 1.0  / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11 + 1.0 / 13);
		System.out.println(benaderingVanPI + "\n\n");

		//OPDRACHT 1.7
		System.out.println("Opdracht 1.7\n");
		double TT= 3.14159;
		double straal= 6.5;
		double oppervlakte= straal * straal * TT;
		double omtrek= 2 * straal * TT;
		System.out.println("oppervlakte=" + oppervlakte);
		System.out.println("omtrek=" + omtrek + "\n\n");

		//OPDRACHT 1.8
		System.out.println("Opdracht 1.8\n");
		double lengte= 5.3;
		double breedte= 8.6;
		double Oppervlakte= lengte * breedte;
		double Omtrek= 2 * (lengte + breedte);
		System.out.println("oppervlakte=" + Oppervlakte);
		System.out.println("omtrek=" + Omtrek + "\n\n\n");

		Scanner scanner= new Scanner(System.in);

		//OPDRACHT 2.1
		System.out.println("Opdracht 2.1\n");
		System.out.print("Typ het aantal mijlen: ");
		double mijlen= scanner.nextDouble();
		double kilometers= mijlen * 1.6;
		double tussenstap= (int) (kilometers * 10);
		kilometers= tussenstap / 10;
		System.out.println(mijlen + " mijlen is " + kilometers + " kilometers" + "\n\n");

		//OPDRACHT 2.2
		System.out.println("Opdracht 2.2\n");
		System.out.print("Hoeveel jaar oud ben je?: ");
		int leeftijdInJaren= scanner.nextInt();
		System.out.print("Hoeveel maanden komen daar nog bij?: ");
		int leeftijdInMaanden= scanner.nextInt();
		int leeftijdInMinuten= leeftijdInJaren * 365 * 24 * 60 + leeftijdInMaanden * 30 * 24 * 60;
		System.out.println("Dan ben je nu ongeveer " + leeftijdInMinuten + " minuten oud" + "\n\n");

		//OPDRACHT 2.3

		System.out.println("Opdracht 2.3\n");
		System.out.print("Typ het startbedrag: ");
		double startbedrag= scanner.nextDouble();
		System.out.print("Type het rentepercentage: ");
		double rentepercentage= scanner.nextDouble();
		double rente= rentepercentage / 100 * startbedrag;
		double totaalbedrag= rente + startbedrag;
		System.out.println("De rente is " + rente + " en het totaal bedrag is " + totaalbedrag + "\n\n" );

		//OPDRACHT 2.4

		System.out.println("Opdracht 2.4\n");
		System.out.print("Typ een getal tussen 10 en 100: ");
		int userInput = scanner.nextInt();
		int buurman1= userInput - 1;
		int buurman2= userInput - 2;
		int buurman3= userInput + 1;
		int buurman4= userInput + 2;
		System.out.println("De vijf getallen zijn " + buurman2 + " - " + buurman1 + " - " + userInput + " - " + buurman3 + " - " + buurman4 + "\n\n");

		//OPDRACHT 2.5

		System.out.println("Opdracht 2.5\n");
		System.out.print("Typ een getal  tussen 0 en 1000: ");
		userInput= scanner.nextInt();

		if (userInput >= 100 && userInput < 1000) {
			int lastDigit = userInput % 10;
			userInput= userInput / 10;

			int middleDigit= userInput % 10;
			userInput= userInput / 10;

			int firstDigit= userInput;


			int som= firstDigit * middleDigit * lastDigit;
			System.out.println("De vermenigvuldiging van de cijfers luidt: " + firstDigit + " x " + middleDigit + " x " + lastDigit + "= " + som );

		} else if (userInput >= 10 && userInput < 100){
			int lastDigit = userInput % 10;
			userInput= userInput / 10;

			int firstDigit= userInput;

			int som= firstDigit * lastDigit;
			System.out.println("De vermenigvuldiging van de cijfers luidt: " + firstDigit + " x " + lastDigit + "= " + som);

		} else if (userInput >= 0 && userInput < 10) {
			System.out.println("De vermenigvuldiging van de cijfers luidt: " + userInput + " = " + userInput + "\n\n\n");

		} else {
			System.out.println("Bro kan je lezen.... Getal moet tussen 0 en 1000 XDDDD");
		}









	}
}
