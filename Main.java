import java.util.Scanner;

class Main {
public static void main(String[] args) 
	{
		//Scanner
		Scanner scan = new Scanner(System.in);
		//Welcome printstatement.
	 	System.out.println("\nWelcome to KFC");
		
		System.out.println("\nHow many chicken sandwiches do you want?");
		int chickenSandwiches = scan.nextInt();
		//Print statement for name
		System.out.println("What is your name?");
		String name = scan.next();
		//Print statement for people
		System.out.println("\nHow many people are with you?");
		int amountPeople = scan.nextInt();

		System.out.println("\nThank you " + name + " you have " + amountPeople + " people with you.");
		
		int price = priceTotal(chickenSandwiches);
		System.out.println("\nYour total is $" + price);

		//parameter for the giftcard
		System.out.println("Your giftcard amount = " + giftCard(price));

	}	

	//priceTotal method calculates price per person.
	static int priceTotal(int chickenSandwiches)
	{
		int price = chickenSandwiches * 5;
		return price;
	}

	//Giftcard method
	static int giftCard(int price)
	{
		if (price >= 50){
			System.out.println("\nYou will get a 5$ KFC Giftcard congratulations!");
			return 5;
		}else{
			System.out.println("Sorry you will not get a Giftcard.");
			return 0;
		}
	}
}