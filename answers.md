# Part 1

## 'Do You Know' Questions

1. The bug never just stays in its old location, but simply keeps moving. However, it never moves out of its prescribed track unless forced to. It just has a constant square pattern.

2. In the direction that its head is pointing.

3. It rotates.

4. Flowers.

5. It rotates forty-five degrees, checks, then rotates another forty-five degrees, and goes forward along this new vector. 

6. It rotates and tests to see if it can move diagonally.

7. No.

8. It grows darker with each step the bug takes away from it, then brightens when the bug steps back onto it.

9. No. It just stops the bug from moving.

10. No. Bugs and flowers are not in the same place; the bug creates a new flower when it passes over the old, and the bug and rock cannot intersect.

## Exercises

1. Degrees | Compass Direction
 		 0 | North
		45 | Northeast
		90 | East
	   135 | Southeast
	   180 | South
	   225 | Southwest
	   270 | West
	   315 | Northwest
	   360 | North

2. You can move to any space on the board. If you move outside the board, the program outputs an error message.

3. I used the setColor() method.

4. The bug disappears. It does not reappear when you move the rock away.


# Part 2

## 'Do You Know' Questions

1. sideLength defines the length of the sides of the square pattern in which BoxBug moves.

2. steps tracks how many steps each BoxBug has moved to make sure it only moves that amount of steps.

3. The turn method only turns the bug 45 degrees, so it must repeat twice to get a 90 degree turn and make a box.

4. The move method can be called in the BoxBug class because the BoxBug class extends from the Bug superclass, and thus each of its methods are inherited from the Bug superclass, including turn.

5. Once a BoxBug object is constructed, its sideLength value is immutable. Thus, the size of its square pattern will never change, because the length of the sides of that square will never change.

6. If there are obstacles (such as rocks) in its path, the BoxBug will change its path. Otherwise, it will not. 

7. The value of steps is zero once the bug turns twice.

## Exercises

1. CircleBug is very similar to BoxBug; what differentiates it is because it only turns once, it moves in a more circular path than Boxbug does. Even though that 'more circular path' is like the textbook definition of an octagon. Whatever.

2. SpiralBug moves in a spiral, exactly as the prophecy foretold.

3. ZBug moves in a Z.

4. DancingBug implements a series of turns and moves a specified amount of spaces, then repeats.

5. Contact the Illuminati, ask them to help.

# Part 3

## Set 3

1. loc1.getRow();

2. False

3. (3, 5)

4. SOUTHEAST

5. You pass in the direction and the starting location, so as the program translates the direction into a transformation on the x and y coordinates (+1y, -1x, etc.), and will then return the tile that has those transformations on the original.

## Set 4

1. Get the count of objects in a grid with the size of getOccupiedLocations(), and get a count of the empty locations in a bounded grid by subtracting this value from the total number of grid spaces.

2. the isValid() method.

3. The implementations would be found in the classes that use this interface. (Such as BoundedGrid and UnboundedGrid);

4. No, because ArrayLists are much more flexible than arrays, and can have adjusted values and different lengths based on the information passed to them.

## Set 5

1. Color, direction, and location

2. Its color and direction are the defaults if no specifics are passed, that is to say: red and north.

3. The Actor class was created as a class because there are default implemented methods for all actors that they need to have, and it wouldn't be feasible to write them all within each of the subclasses. There needs to be a place where each Actor can get each default implemented method. Thus, Actor is a superclass.

4. No, an actor cannot be put into a grid twice without removing itself, and it can't remove itself twice. However, it can be placed in, removed, and then put back in.

5. Call the turn() method twice.

## Set 6

1. It calls the isValid() method to check whether it can move to its intended location.

2. It checks to see whether its neighboring space is either empty or a Flower, in which case it can move there.

3. It invokes isValid() and the get() method to validate its moves according to the grid it's on.

4. It invokes getAdjacentLocation() to get the next move's location.

5. It invokes the getLocation() method to, uh, get its location. I mean, it's not rocket science.

6. It checks whether the location is valid, so isValid() would return false if the location is off the grid. It will remove itself from the grid.

7. You could potentially call getLocation() multiple times, but it's better to store the data in a variable to reduce clutter and make the code nice and dry.

8. Because the flowers inherit the bug's color to make them recognizable.

9. No it doesn't, because placing a flower is a part of the move() method, and it's not moving if it's removed, it just... ends.

10. Flower.putSelfInGrid(gr, loc);

11. 4 times

## Group Questions

### Specify

a. It will move one space forward, then jump over the obstacle.

b. It will move to the edge of the grid, then turn ninety degrees and resume moving.

c. It will turn ninety degrees and resume moving.

d. It will jump on the actor, destroying it.

e. They will jump past one another.

f. I don't think so.

### Design

a. It should extend the Bug class.

b. Not really. No other classes have that kind of functionality.

c. There should be a constructor, the parameters should be

d. The act method and the constructor should be overridden.

e. We should add whether the bug can jump, and we should also add a method to let the bug kill other actors when it moves into their spaces. So, a canJump() method and a kill() method.

f. Put the bug in an obstacle course and let it run wild. See if it performs to our expectations.

### Testing

The jumper did exactly what we wanted it to do and performed flawlessly in all fields.

# Part 4

## Set 7

1. The act() method is implemented.

2. They getActors(), processActors(), getMoveLocations(), selectMoveLocations(), and finally, they makeMove().

3. No, because actually getting the neighbors of the Critter, whether they be Critters or other Actors, needs to be a priority for the Critters. Overriding this in Critter subclasses would be shortsighted.

4. Use the processActors() method. Make an ArrayList of all their neighbors, then process them. Check the location that the Critter would move to, and if that space is occupied, don't move there.

5. To make a Critter move, three methods must be invoked. getMoveLocations() gets the locations that the Critter can move to. selectMoveLocations() selects a location for that selfsame Critter to move to. And, finally, makeMove() moves the Critter. Obviously.

6. Critter is an abstract class, meaning that it will never be instantiated in the Grid. Therefore, it needs no cosntructor.

## Set 8

1. The processActors() method is very different. It processes the Actors in a very different way, so the ChameleonCritter can move differently.

2. Because it doesn't want to rewrite Critter's move() method, and when you use the super keyword, it just gets the method from the superclass.

3. Add the code that makes Bug drop flowers into the Critter makeMove() method, then adjust it for Critter's specific properties.

4. Because it doesn't need to. It only needs to use the getActors() method from the Critter superclass. It doesn't need a new method to be a ChameleonCritter. It doesn't get Actors differently than a regular Critter, so it doesn't need a new getActors() method.

5. Bug

6. The getGrid() method.

## Set 9

1. CrabCritters process Actors in the same way as regular Critters, so it doesn't need a new processActors() method to supplement its new behavior.

2. It gets the location of actors in the front, front-right, and front-left, then processes them and (if they're not rocks) removes them. 

3. It needs to get the locations of the front, front-right, and front-left spaces in the direction it's moving to. It needs to orient its claws.

4. (2, 5), (3, 5), and (4, 5)

5. CrabCritters move right to left randomly, while Critters move randomly in all directions. Critters are jerks. 

6. When it hits another actor, such as a rock or another CrabCritter, that it cannot eat, it turns 90 degrees.

7. If the space it wants to move to contains an actor it can't eat, that space is not validated.


