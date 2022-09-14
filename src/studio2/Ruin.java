package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);{
			System.out.println("Please enter your start amount: ");
			int startAmount = in.nextInt();
			System.out.println("Enter the known odds: ");
			double winChance = in.nextDouble();
			System.out.println("What is your win limit? ");
			int winLimit = in.nextInt();
			int current = startAmount;
			System.out.println("How many Simulations?");
			int totalSims = in.nextInt();
			int x = 1;
			if(x<= totalSims)
			while (x <= totalSims) {
				current = startAmount;
				//	if(winLimit <= current && current < 0){
				//		System.out.println("Invalid entry.");	
				//	}
				int rounds = 1;
				int wins = 0;
				int loss = 0;
				if(current < winLimit && current > 0)
					while (current < winLimit && current > 0){
						double roundOdds = Math.random();
						boolean outcome = (winChance > roundOdds);
						if (winChance > roundOdds){
							current++;
							//System.out.println("Round " + rounds + ": Win! You have $" + current );
							rounds++;
							wins++;

						}else {
							current--;		
							//System.out.println("Round " + rounds + ": Loss. You have $" + current);
							rounds++;
							loss++;
							if(current == 0) {
								System.out.println("Simulation "+ x +":" + rounds + " LOSE");
								//define x as some variable
								//System.out.println("Total Rounds: " + rounds);
								//System.out.println("Total Wins: " + wins );
								//System.out.println("Total Losses: " + loss);
							}
						}
						if (current == winLimit) {
							System.out.println("Simulation "+ x +":" + rounds + " WIN");
							//define x as some variable
							//System.out.println("Total Rounds: " + rounds);
							//System.out.println("Total Wins: " + wins );
							//System.out.println("Total Losses: " + loss);
						}

					}x++;}
		}}}


