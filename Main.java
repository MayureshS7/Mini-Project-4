import java.util.Scanner;

class Main {
public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

	 	System.out.println("\nWelcome to KFC");

		System.out.println("\nHow many chicken sandwiches do you want?");
		int chickenSandwiches = scan.nextInt();
		
		System.out.println("What is your name?");
		String name = scan.next();

		System.out.println("\nHow many people are with you?");
		int amountPeople = scan.nextInt();

		System.out.println("\nThank you " + name + " you have " + amountPeople + " with you.");

		int price = priceTotal(chickenSandwiches, amountPeople);
		System.out.println("\nYour total is $" + price);

		System.out.println(goodBye(name));
	}	

	//priceTotal method calculates price per person.
	static int priceTotal(int chickenSandwiches, int amountPeople)
	{
		int price = chickenSandwiches + amountPeople;
		return price;
	}

	//Good bye method.
	static String goodBye(String name)
	{
		String cya = "\nThank you for coming to KFC :) " + name;
		return cya;
	}






}