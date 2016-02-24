package part4;

import java.awt.Color;
import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location; 

public class QuickCrab extends CrabCritter {
	public QuickCrab () {
		setColor(Color.ORANGE);
		
	}
	public ArrayList<Location> getMoveLocations() {
		 ArrayList<Location> locs = new ArrayList<Location>();

		 addLoc(locs,getDirection() + Location.LEFT);
		 addLoc(locs,getDirection() + Location.RIGHT);

		 if (locs.size() == 0)
		 return super.getMoveLocations();

		 return locs; 
	}
	private void addLoc(ArrayList<Location> locs, int dir) {
		 Grid<Actor> grid = getGrid();
		 Location loc = getLocation();

		 Location tempLoc = loc.getAdjacentLocation(dir);

		 if(grid.isValid(tempLoc) && grid.get(tempLoc) == null)
		 {
		  Location jumpLoc = tempLoc.getAdjacentLocation(dir);
		  if(grid.isValid(jumpLoc) && grid.get(jumpLoc) == null)
		  locs.add(jumpLoc);
		  } 
	}
	
  
}