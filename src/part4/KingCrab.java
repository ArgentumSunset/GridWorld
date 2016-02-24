package part4;

import java.awt.Color;
import java.util.*;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Location; 

public class KingCrab extends CrabCritter {
	public KingCrab() {
		setColor(Color.PINK);
	}
	
	public void processActors(ArrayList<Actor> actors) {
		if(actors.size() != 0) {
			for(Actor actor : actors) {
				Location loc = actor.getLocation();
				Location locMoveTo = loc.getAdjacentLocation(getLocation().getDirectionToward(loc));
				
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
