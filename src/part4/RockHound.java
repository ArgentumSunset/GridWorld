package part4;

import info.gridworld.actor.*;
import java.awt.Color;
import java.util.*;

public class RockHound extends Critter {
	
	public void processActors(ArrayList<Actor> actors) {
		for(Actor a : actors) {
			if (!(a instanceof Critter)) {
				a.removeSelfFromGrid();
			}
		}
	}
	
}
