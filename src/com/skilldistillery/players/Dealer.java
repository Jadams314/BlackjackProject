package com.skilldistillery.players;

import com.skilldistillery.blackjack.BlackjackHand;
import com.skilldistillery.cards.Card;
import com.skilldistillery.cards.Deck;
import com.skilldistillery.cards.Hand;

public class Dealer extends Player {
	private Deck deck = new Deck();
	private BlackjackHand hand;
	
	public Dealer() {}
	
	public Dealer(BlackjackHand hand) {
		super();
		this.hand = hand;
	}
	
	public void shuffle() {
		deck.shuffle();
	}
	public void startGame() {
	}
	
	public int getHandValue() {
	int totalValue = hand.getHandValue(this.hand);
		
		return totalValue;
	}
	
	public BlackjackHand dealHand() {
		BlackjackHand dHand = new BlackjackHand();
	
		
		Card card1 = deck.dealCard();
		Card card2 = deck.dealCard();
		
		dHand.addCard(card1);
		dHand.addCard(card2);
		
		
		return dHand;
	}
	public BlackjackHand dealCard(BlackjackHand hand) {

		
		Card card1 = deck.dealCard();
		hand.addCard(card1);
		
		return hand;
	}

	public Deck getDeck() {
		return deck;
	}

	public BlackjackHand getHand() {
		return hand;
	}

	public void setHand(BlackjackHand hand) {
		this.hand = hand;
	}

	@Override
	public String toString() {
		return ""+ hand;
	}
	
	
}
