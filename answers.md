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
 