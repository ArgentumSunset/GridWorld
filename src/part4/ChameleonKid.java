package part4;

import java.awt.Color;
import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;

public class ChameleonKid extends ChameleonCritter {
	
private static final double DARKENING_FACTOR = 0.05;
	
	public void processActors(ArrayList<Actor> actors) {
		
		int front = getDirection();
		int back = (front >= 180) ? front - 180 : 360 - (180 - front);
		
		if(actors.size() != 0) {
			for(Actor actor : actors) {
			if(actor.getLocation() != getLocation().getAdjacentLocation(front) && actor.getLocation() == getLocation().getAdjacentLocation(back))
				actors.remove(actor);
			}
		}
		
		if (actors.size() == 0) {
			Color c = getColor();
        	int red = (int) (c.getRed() * (1 - DARKENING_FACTOR));
        	int green = (int) (c.getGreen() * (1 - DARKENING_FACTOR));
        	int blue = (int) (c.getBlue() * (1 - DARKENING_FACTOR));

        	setColor(new Color(red, green, blue));
        	return;
		}
		
		
		
		int r = (int) (Math.random() * actors.size());
		
		Actor other = actors.get(r);
		setColor(other.getColor());
	}

	public void makeMove(Location loc) {
		setDirection(getLocation().getDirectionToward(loc));
		super.makeMove(loc);
	}

}
