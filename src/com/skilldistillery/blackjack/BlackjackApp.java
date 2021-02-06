package com.skilldistillery.blackjack;

public class BlackjackApp {

	public static void main(String[] args) {
		BlackjackApp input = new BlackjackApp();
		input.run();
	}
	public void run() {
		BlackjackTable bjt = new BlackjackTable();
		
		bjt.startGame();
		
	}
	
	public void	printMenu(){
		System.out.println("1) Play Blackjack");
		System.out.println("2) ");
		System.out.println();
	}
}
