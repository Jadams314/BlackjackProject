package com.skilldistillery.blackjack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.skilldistillery.cards.Card;
import com.skilldistillery.cards.Hand;

public class BlackjackHand extends Hand {

	
	List<Card> handList = new ArrayList<Card>();
	
	
	public BlackjackHand() {
		
	}
	public void addCard(Card card) {
		handList.add(card);
	}
	public void clear() {
		
	}
	public int getHandValue(BlackjackHand h) {
		int totalValue = 0;
		for (Card card : handList) {
			totalValue += card.getValue();
		}
	//	System.out.println(totalValue);
		return totalValue;
	}
	public void getPlayersHand() {
		
	}

	@Override
	public String toString() {
	Iterator<Card> it = handList.iterator();
	
	while (it.hasNext()) {
		System.out.println(it.next());
	}
		
		
		return "" + handList;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((handList == null) ? 0 : handList.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof BlackjackHand))
			return false;
		BlackjackHand other = (BlackjackHand) obj;
		if (handList == null) {
			if (other.handList != null)
				return false;
		} else if (!handList.equals(other.handList))
			return false;
		return true;
	}
	
}
