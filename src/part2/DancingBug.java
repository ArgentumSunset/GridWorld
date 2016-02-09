package part2;

import info.gridworld.actor.Bug;

public class DancingBug extends Bug {
	private int[] arr;
	private int steps;
	private int arrPos = 0;
	
	public DancingBug(int[] arr) {
		this.steps = 0;
		this.arr = arr;
	}
	
	public void act() {
		if (steps < 5 && canMove()) {
			move();
			steps++;
		} else {
			arrPos++;
			this.setDirection(arr[(arrPos % arr.length)] * 45);
			steps = 0;
		}
	}
}