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
			for(int i = 0; i < sideLength; i++){
				move();
			}
			this.turn();
			this.turn();
			this.turn();
			for(int i = 0; i < sideLength; i++){
				move();
			}
			this.turn();
			this.turn();
			this.turn();
			this.turn();
			this.turn();
			for(int i = 0; i < sideLength; i++){
				move();
			}
			done = true;
		}
	}
	
}
