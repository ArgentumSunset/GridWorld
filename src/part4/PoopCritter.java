package part4;

import java.awt.Color;
import java.util.*;

import info.gridworld.actor.*;
import info.gridworld.grid.*; 

public class PoopCritter extends Critter {
	
	private int poopFrequency = 0;
	private int poopCount = 0;
	
	public PoopCritter(int poopFrequency, Color color) {
		this.poopFrequency = poopFrequency;
		setColor((color != Color.BLACK) ? color : new Color(89,48,1));
	}
	
	public void processActors(ArrayList<Actor> actors) {
		if(actors.size() != 0) {
			for(Actor actor : actors) {
				Location loc = actor.getLocation();
				Location locMoveTo = loc.getAdjacentLocation(getLocation().getDirectionToward(loc));
				if(!(actor instanceof Flower) && !(actor instanceof Rock)) {
					if(getGrid().isValid(locMoveTo)) {
						actor.moveTo(locMoveTo);
					}
					else {
						actor.removeSelfFromGrid();
					}
				}
			}
		}
	}
	
	public void makeMove(Location loc) {
		if(poopCount >= poopFrequency) {
			int behind = (getDirection() >= 180) ? getDirection() - 180 : 360 - (180 - getDirection());
			Flower poop = new Flower(getColor());
			poop.putSelfInGrid(getGrid(), getLocation().getAdjacentLocation(behind));
			poopCount = 0;
		}
		else {
			poopCount++;
		}
		
		setDirection(getLocation().getDirectionToward(loc));
		super.makeMove(loc);
	}
	
	
}
