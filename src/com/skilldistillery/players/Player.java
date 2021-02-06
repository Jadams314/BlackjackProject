package com.skilldistillery.players;

import com.skilldistillery.cards.Hand;

public abstract class Player  {
	private Hand hand;

	
	public Player() {}
		
	
	public Player(Hand hand) {
		super();
		this.hand = hand;
	}

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}


	@Override
	public String toString() {
		return "Player [hand=" + hand + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hand == null) ? 0 : hand.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Player))
			return false;
		Player other = (Player) obj;
		if (hand == null) {
			if (other.hand != null)
				return false;
		} else if (!hand.equals(other.hand))
			return false;
		return true;
	}
	
}
