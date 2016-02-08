package part2;

import info.gridworld.actor.Bug;

public class ZBug extends Bug {
	private boolean done;
	private int sideLength;
	
	public ZBug(int length) {
		done = false;
		sideLength = length;
	}
	
	public void act() {
		if(!done) {
			this.setDirection(90);
		}
	}
}
