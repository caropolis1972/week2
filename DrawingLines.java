package week2;
/*Write a GraphicsProgram that allows the user to draw lines on the canvas. Pressing the
mouse button sets the starting point for the line. Dragging the mouse moves the other
endpoint around as the drag proceeds. Releasing the mouse fixes the line in its current
position and gets ready to start a new line. For example, suppose that you press the
mouse button somewhere on the screen and then drag it rightward an inch, holding the
button down. What you’d like to see is the following picture:
Horizontal line
If you then move the mouse downward without releasing the button, the displayed line
will track the mouse, so that you might see the following picture:
Inclined line
Because the original point and the mouse position appear to be joined by some elastic
string, this technique is called rubber-banding. Although this program may seem quite
powerful, it is also simple to implement. The entire program requires fewer than 20 lines
of code.
*
*
*  Author: Rosa C. Rodriguez
*  File: DrawingLines.java
*  Week2
*/
import acm.program.GraphicsProgram;
import java.awt.event.*;
import acm.graphics.*;

public class DrawingLines extends GraphicsProgram {
	
	/** Runs the program */
	public void run() {
		addMouseListeners();
	}
	
	/** Called on mouse press to record the starting coordinates */
	public void mousePressed(MouseEvent e) {
		startX = e.getX();
		startY = e.getY();
		currentLine = new GLine(startX, startY, startX, startY);
		add(currentLine);
	}
	
	/** Called on mouse drag to reshape the current rectangle */
	public void mouseDragged(MouseEvent e) {
		currentLine.setEndPoint(e.getX(), e.getY());
	}
	
	/* Private state */
	private GLine currentLine; /* The current rectangle */
	private double startX; /* The initial mouse X position */
	private double startY; /* The initial mouse Y position */
	
}
