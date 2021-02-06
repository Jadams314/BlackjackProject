package com.skilldistillery.cards;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
	List<Card> cardList = new ArrayList<Card>(52);
	
	
	public Hand() {
		
	}
	public void addCard(Card card) {
		
	}
	public void clear() {
		
	}
	public void getHandValue(Hand card) {
		for (Card hand : cardList) {
			hand.getValue();
		}
	}

	@Override
	public String toString() {
		return "";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cardList == null) ? 0 : cardList.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Hand))
			return false;
		Hand other = (Hand) obj;
		if (cardList == null) {
			if (other.cardList != null)
				return false;
		} else if (!cardList.equals(other.cardList))
			return false;
		return true;
	}
	
}
