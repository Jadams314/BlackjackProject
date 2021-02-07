package com.skilldistillery.players;

import com.skilldistillery.blackjack.BlackjackHand;

public class BlackjackPlayer extends Player {
	private BlackjackHand hand;

	public BlackjackPlayer() {
	}

	public BlackjackPlayer(BlackjackHand hand) {
		super();
		this.hand = hand;
	}
	public int getHandValue() {
	int totalValue = hand.getHandValue(this.hand);
		
		return totalValue;
	}
	
	public BlackjackHand getHand() {
		return hand;
	}
	
	public void setHand(BlackjackHand hand) {
		this.hand = hand;
	}


	

	public String toString() {
		return "" + hand;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((hand == null) ? 0 : hand.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof BlackjackPlayer))
			return false;
		BlackjackPlayer other = (BlackjackPlayer) obj;
		if (hand == null) {
			if (other.hand != null)
				return false;
		} else if (!hand.equals(other.hand))
			return false;
		return true;
	}

}
