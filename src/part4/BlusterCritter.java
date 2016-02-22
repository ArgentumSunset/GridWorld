package part4;

import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.awt.Color;
import java.util.*;

public class BlusterCritter extends Critter {
	int c;
	
	private static final double DARKENING_FACTOR = 0.5;
	
	public BlusterCritter(Color color, int courage) {
		int c = courage;
		setColor(color);
	}
	
	public ArrayList<Actor> getActors() {
		ArrayList<Actor> actors = new ArrayList<Actor>();
		for(int dir = 0; dir < 360; dir += 45) {
		actors.addAll( getGrid().getNeighbors(getLocation().getAdjacentLocation(dir)));
		}
		return actors;
	}
	
	public void processActors(ArrayList<Actor> actors) {
		super.processActors(actors);
		if(actors.size() < c)
			brighten();
		else
			darken();
	}
	
	 private void brighten(){
	    	Color c = getColor();
	        int red = (int) ((c.getRed() + 2) * (1 + DARKENING_FACTOR));
	        int green = (int) ((c.getGreen() + 2) * (1 + DARKENING_FACTOR));
	        int blue = (int) ((c.getBlue() + 2) * (1 + DARKENING_FACTOR));
	        if(red > 255)
	        	red = 255;
	        if(green > 255)
	        	green = 255;
	        if(blue > 255)
	        	blue = 255;
	        setColor(new Color(red, green, blue));
	    }
	 
	    private void darken(){
	    	Color c = getColor();
	        int red = (int) (c.getRed() * (1 - DARKENING_FACTOR));
	        int green = (int) (c.getGreen() * (1 - DARKENING_FACTOR));
	        int blue = (int) (c.getBlue() * (1 - DARKENING_FACTOR));

	        setColor(new Color(red, green, blue));
	    }
}
