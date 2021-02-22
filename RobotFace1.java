package week2;
/*2. Drawing a face
This program draws a robot-looking face.
This simple face consists of four parts—a head, two eyes, and a mouth—which are
arranged as follows:
• The head. The head is a big rectangle whose dimensions are given by the named
constants HEAD_WIDTH and HEAD_HEIGHT. The interior of the head is gray, although it
should be framed in black.
• The eyes. The eyes should be circles whose radius in pixels is given by the named
constant EYE_RADIUS. The centers of the eyes should be set horizontally a quarter of
the width of the head in from either edge, and one quarter of the distance down from
the top of the head. The eyes are yellow.
• The mouth. The mouth should be centered with respect to the head in the x-dimension
and one quarter of the distance up from the bottom of the head in the y-dimension.
The dimensions of the mouth are given by the named constants MOUTH_WIDTH and
MOUTH_HEIGHT. The mouth is white.
Finally, the robot face should be centered in the graphics window.
*
*
*  Author: Rosa C. Rodriguez
*  File: RobotFace.java
*  Week2
*/
import java.awt.Color;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class RobotFace1 extends GraphicsProgram {
	/* Instance variables */
	private GRect head;
	private GOval leftEye, rightEye;
	private GRect mouth;
	/* Head dimensions */
	double widthHead = 100;
	double heightHead = 200;
	
	/* Constants specifying feature size as a fraction of the head size */
	private static final double HEAD_WIDTH = 0.95;
	private static final double HEAD_HEIGHT = 1.0;
	private static final double EYE_RADIUS = 0.15;
	private static final double MOUTH_WIDTH = 0.30;
	private static final double MOUTH_HEIGHT = 0.03;	
	
	public void run(){
		
		
		head = new GRect(HEAD_WIDTH * widthHead, HEAD_HEIGHT * heightHead);
		head.setFilled(true);
		head.setFillColor(Color.GRAY);
		
		leftEye = new GOval(EYE_RADIUS * widthHead, EYE_RADIUS * heightHead);
		rightEye = new GOval(EYE_RADIUS * widthHead, EYE_RADIUS * heightHead);				
		
		leftEye.setFilled(true);
		leftEye.setFillColor(Color.YELLOW);
		
		rightEye.setFilled(true);
		rightEye.setFillColor(Color.YELLOW);
		
		mouth = new GRect(MOUTH_WIDTH * widthHead, MOUTH_HEIGHT * heightHead);
		mouth.setFilled(true);
		mouth.setFillColor(Color.WHITE);
		addHead();
		addLeftEye();
		addRightEye();
		addMouth();
	}
	public void addHead() {
		double x = (getWidth() - (HEAD_WIDTH * widthHead)) / 2;
		double y = (getHeight() - (HEAD_HEIGHT * heightHead)) /2;
		add(head, x, y);
	}	

	public void addLeftEye() {
		double x = ((getWidth() - (HEAD_WIDTH * widthHead)) / 2) + ((0.25 * widthHead) - ((EYE_RADIUS * widthHead) / 2));				
		double y = ((getHeight() - (HEAD_HEIGHT * heightHead)) /2) + ((0.25 * heightHead) - ((EYE_RADIUS * heightHead) / 2));	
		add(leftEye, x, y);	
	}

	public void addRightEye() {
		double x = ((getWidth() - (HEAD_WIDTH * widthHead)) / 2) + ((0.75 * widthHead) - ((EYE_RADIUS * widthHead) / 2));				
		double y = ((getHeight() - (HEAD_HEIGHT * heightHead)) /2) + ((0.25 * heightHead) - ((EYE_RADIUS * heightHead) / 2));
		add(rightEye, x, y);
	}

	public void addMouth() {
		double x = ((getWidth() - (HEAD_WIDTH * widthHead)) / 2) + (0.50 * widthHead - MOUTH_WIDTH * widthHead / 2);
		double y = ((getHeight() - (HEAD_HEIGHT * heightHead)) /2) + (0.75 * heightHead - MOUTH_HEIGHT * heightHead / 2);
		add(mouth, x, y);
	}
}