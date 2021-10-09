package com.skilldistillery.app;

import java.util.Scanner;

public class MakeChange {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// display menu
		printMenu();
//		System.out.println(makeChange(8,9));

	}

	public static void printMenu() {
		// ask the user how much does item cost
		// ask the user ho wmuch is tendered
		// figure out how much, if any, is owed**

		double cost = 0.00;
		double amount = 0.00;
		boolean keepGoing = true;

		while (keepGoing) {
			System.out.println("How much does the item you want cost?");
			cost = input.nextDouble();
			input.nextLine();

			System.out.println("The item you want to purchase cost: " + cost + "\n");
			System.out.print("How much money will you pay?" + "\n");
			amount = input.nextDouble();
			input.nextLine();

			System.out.println("The amount tendered is: " + amount + "\n");
//		the amount given is less than the cost?
			if (cost > amount) {
				System.out.println(
						"The amount given is less than the cost listed, please give the cost listed." + "\n");
			} else if (cost - amount == 0) {
				System.out.println("The amount given is the exact cost of the item!" + "/n");
			}

			if( cost < amount) {
					double amtReturned = amount - cost;
			System.out.printf("The change owed to the customer is:  %.2f\n" , amtReturned);

			makeChange(amtReturned);
//			run makeChange method here!
			}

			System.out.println("\nAre you finished shopping? Type 'Yes' or 'No'");
			String response = input.nextLine();

			if (response.equals("Yes")) {
				keepGoing = false;
				System.out.println("Thank you for shopping with us!");
			} else
				keepGoing = true;
		}
	}
//		output needs to read as x amount: dollars, quarter(s), nickel(s), penny(ies)

	public static void makeChange(double exactChangeNeeded) {
		int twenties, tens, fives, ones, quarters, dimes, nickels, pennies;
		
		twenties = (int) (exactChangeNeeded / 20); 
		if (twenties == 1 ) {
			System.out.print("Your change back is: " + twenties + " twenty dollar bill, ");
		}else if(twenties > 1) {
		System.out.print("Your change back is: " + twenties + " twenty dollar bill, ");
		}
		exactChangeNeeded %= 20;
		
		tens = (int) (exactChangeNeeded /10);
		if (tens == 1 ) {
		System.out.print(tens + " ten dollar bill, ");
		}else if(tens >1) {
		System.out.print(tens + " ten dollar bill, ");
		}
		exactChangeNeeded %= 10;
		
		fives = (int) (exactChangeNeeded / 5);
		if (fives == 1 ) {
		System.out.print(fives + " five dollar bill, ");
		}else if(fives > 1) {
		System.out.print(fives + " five dollar bill, ");
		}
		exactChangeNeeded %= 5;
		
		ones = (int) (exactChangeNeeded / 1);
		if (ones == 1 ) {
		System.out.print(ones + " one dollar bill, ");
		}else if(ones > 1) {
			System.out.print(ones + " one dollar bill, ");
		}
		exactChangeNeeded %= 1;
		
		exactChangeNeeded *=100 + .5; 
		
		quarters = (int) (exactChangeNeeded / 25);
		if (quarters == 1 ) {
		System.out.print(quarters + " quarter, ");
		}else if(quarters > 1) {
			System.out.print(quarters + " quarters, ");
		}
		exactChangeNeeded %= 25;
		
		dimes = (int) (exactChangeNeeded / 10);
		if(dimes == 1) {
			System.out.print(dimes + " dime, ");
		}else if(dimes >1) {
		System.out.print(dimes + " dimes, ");
		}
		exactChangeNeeded %= 10;
		
		nickels = (int) (exactChangeNeeded / 5);
		if(nickels == 1) {
		System.out.print(nickels + " nickel, and ");
		}else if(dimes > 1) {
			System.out.print(nickels + " nickels, and ");
		}
		exactChangeNeeded %= 5;
		
		pennies = (int) (exactChangeNeeded / 1);
		if(pennies == 1) {
		System.out.print(pennies + " penny.");
		}else if(pennies > 1) {
			System.out.print(pennies + " pennies.");
		}
		exactChangeNeeded %= 1;
//		System.out.println(".");

//		exactChangeNeeded % twenties 
	}
}
