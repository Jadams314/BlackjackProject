package com.skilldistillery.blackjack;

import java.util.Scanner;

import com.skilldistillery.players.BlackjackPlayer;
import com.skilldistillery.players.Dealer;
import com.skilldistillery.players.Player;

public class BlackjackTable {
	private BlackjackPlayer player = new BlackjackPlayer();
	private Dealer dealer = new Dealer();

	public void startGame() {
		boolean keepGoing = true;

		
		
		while (keepGoing) {
			System.out.println("Let's play BlackJack!");
			dealer.shuffle();
			player.setHand(dealer.dealHand());
			dealer.setHand(dealer.dealHand());
			int dValue = dealer.getHandValue();
			int pValue = player.getHandValue();
			System.out.println("The dealer gives you " + player);
			System.out.println("Your total vale you is " + pValue);
			System.out.println("The dealer has " + dealer);
			System.out.println("The dealers total value is  " + dValue);
			if (pValue == 21 && dValue != 21) {
				System.out.println("Blackjack!");
				System.out.println("You Win!");
				keepGoing = false;
			} else if (dValue == 21 && pValue != 21) {
				System.out.println("Dealer has Blackjack");
				System.out.println("Dealer wins");
				keepGoing = false;
			} else if (pValue == 21 && dValue == 21) {
				System.out.println("Push!");
				System.out.println("No winner");
				keepGoing = false;
			} else {
				hitOrStay(player);
				pValue = player.getHandValue();
				if (pValue > 21) {
					System.out.println("Thanks for playing!");
					keepGoing = false;
				} else {
					dealerHits(dealer);
					checkWin(player, dealer);
					keepGoing = false;
				}
			}

		}
	}

	private BlackjackHand dealerHits(Dealer d) {
		BlackjackHand hand = (BlackjackHand) d.getHand();
		int hValue = hand.getHandValue(hand);
		boolean bust = true;

		if (hValue == 17) {
			System.out.println("Dealer stays on 17");
		}
		
		while (hValue < 17) {
		
			
			if (hValue < 17) {
				System.out.println("Dealer Hits");
				d.setHand(dealer.dealCard(hand));
				hValue = (hand.getHandValue(hand));
				System.out.println("Dealer has " + hValue);
			} if (hValue > 21) {
				System.out.println("Dealer busts");
				System.out.println("You Win");
			}
			return hand;
		}
		return hand;

	}

	private void checkWin(BlackjackPlayer p, Dealer d) {
		BlackjackHand pHand = (BlackjackHand) p.getHand();
		BlackjackHand dHand = (BlackjackHand) d.getHand();
		int pValue = pHand.getHandValue(pHand);
		int dValue = dHand.getHandValue(dHand);

		if (pValue > dValue && pValue <= 21) {
			System.out.println("You Win!");
		} else if (pValue < dValue && dValue <= 21) {
			System.out.println("Dealer Wins");
		} else if (pValue == dValue) {
			System.out.println("Push");
		}

	}

	public BlackjackHand hitOrStay(Player activePlayer) {
		Scanner kb = new Scanner(System.in);
		BlackjackHand hand = (BlackjackHand) activePlayer.getHand();
		int hValue = hand.getHandValue(hand);
		boolean bust = true;

		while (bust) {
			if (hValue > 21) {
				System.out.println("Bust!");
				bust = false;

			} else {
				System.out.println("1)Hit");
				System.out.println("2)Stay");
				int choice = kb.nextInt();
				if (choice == 1) {
					activePlayer.setHand(dealer.dealCard(hand));
					hValue = (hand.getHandValue(hand));
					System.out.println(hValue);
				} else {
					System.out.println("You have chosen to stay");
					return hand;
				}
			}

		}
		kb.close();
		return hand;
	}

	/*
	 * The table gets 2 players..A dealer and a player
	 * 
	 * 
	 * The table has a deck of cards(52..for now)
	 * 
	 * The table will implement the rules of blackjack
	 * 
	 * at this table the cards will be dealt to each player (their hand). each time
	 * the card is dealt we will remove it from the deck.
	 * 
	 * Once the cards have been dealt check the value of the hand Player: while
	 * (hand !=bust) ask player to hit or stay. if hit add a card and check while
	 * condition. if stay move on to dealer Dealer: while (hand != bust || hand <
	 * 17) dealer adds a card and rechecks while if (hand >= 17) dealer stays
	 *
	 * after players stay check hand value of players. compare value of player vs
	 * dealer sysout who has higher value w/o bust
	 *
	 * 
	 */

}
