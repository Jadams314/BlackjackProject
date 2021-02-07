package com.skilldistillery.blackjack;

import java.util.Scanner;

public class BlackjackApp {

	public static void main(String[] args) {
		BlackjackApp input = new BlackjackApp();
		input.run();
	//	input.playAgain();
	}
	public void run() {
		BlackjackTable bjt = new BlackjackTable();
		
		bjt.startGame();
		
	}
	public void playAgain() {
		Scanner kb = new Scanner(System.in);
		
		boolean keepGoing = true;
		int choice;
		
		while (keepGoing) {
			System.out.println("Would you like to play again?");
			System.out.println("1) Yes or 2) No");
			choice = kb.nextInt();
			if (choice == 1) {
				run();
			}else if (choice == 2) {
				System.out.println("Thanks again for playing!");
				keepGoing = false;
			}else {
				System.out.println("That is not a valid entry");
			
			}
		}
		
	}
	
}
