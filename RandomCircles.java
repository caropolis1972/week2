package week2;
/*Write a GraphicsProgram that draws a set of ten circles with different sizes, positions,
and colors. Each circle should have a randomly chosen color, a randomly chosen radius
between 5 and 50 pixels, and a randomly chosen position on the canvas, subject to the
condition that the entire circle must fit inside the canvas without extending past the edge.
The following sample run shows one possible outcome:
RandomCircles
On some runs of this program you might not see ten circles. Why?
4.
*
*
*  Author: Rosa C. Rodriguez
*  File: RandomCircles.java
*  Week2
*/
import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.*;

public class RandomCircles extends GraphicsProgram {
	
	/** Runs the program */
	public void run() {
		// Get the screen dimensions in pixels
		double width = getWidth();
		double height = getHeight();
		
		for (int i = 1; i <=10; i++) { 
			
			double radius = rgen.nextDouble(1, 50);
			GOval circle = new GOval(2 * radius, 2 * radius);
			circle.setFilled(true);
			circle.setColor(rgen.nextColor());
			
			// Get random position on X-axis and ensure it doesn't go off the canvas.
			double circleX = rgen.nextDouble(0, width);
			if (circleX > (width - circle.getWidth())) {
				circleX = width - circle.getWidth();
			}
			
			// Get random position on Y-axis and ensure it doesn't go off the canvas.
			double circleY = rgen.nextDouble(0, height);
			if (circleY > (height - circle.getHeight())) {
				circleY = height - circle.getHeight();
			}
			
			add(circle, circleX, circleY);			
		}
	}

/** Random number generator */
	private RandomGenerator rgen = new RandomGenerator();
}
