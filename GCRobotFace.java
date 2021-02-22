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
*   File: GCRobotFace.java
*   Author: Rosa C. Rodriguez
*   This class contains a constructor to draw a robot face
*/

import acm.graphics.*;
import java.awt.*;

	public class GCRobotFace extends GCompound {

	/* Constructor */
		public GCRobotFace(double width, double height) {
			head = new GRect(HEAD_WIDTH * width, HEAD_HEIGHT * height);
			head.setFilled(true);
			head.setFillColor(Color.GRAY);
			
			leftEye = new GOval(EYE_RADIUS * width, EYE_RADIUS * height);
			rightEye = new GOval(EYE_RADIUS * width, EYE_RADIUS * height);				
			
			leftEye.setFilled(true);
			leftEye.setFillColor(Color.YELLOW);
			
			rightEye.setFilled(true);
			rightEye.setFillColor(Color.YELLOW);
			
			mouth = new GRect(MOUTH_WIDTH * width, MOUTH_HEIGHT * height);
			mouth.setFilled(true);
			mouth.setFillColor(Color.WHITE);
			
			add(head, 0, 0);
			add(leftEye, 0.25 * width - EYE_RADIUS * width / 2,
				0.25 * height - EYE_RADIUS * height / 2);
			add(rightEye, 0.75 * width - EYE_RADIUS * width / 2,
				0.25 * height - EYE_RADIUS * height / 2);
			add(mouth, 0.50 * width - MOUTH_WIDTH * width / 2,
				0.75 * height - MOUTH_HEIGHT * height / 2);
		}
	

	/* Constants specifying feature size as a fraction of the head size */
		private static final double HEAD_WIDTH = 0.95;
		private static final double HEAD_HEIGHT = 1.0;
		private static final double EYE_RADIUS = 0.15;
		private static final double MOUTH_WIDTH = 0.30;
		private static final double MOUTH_HEIGHT = 0.03;

	/* Instance variables */
		private GRect head;
		private GOval leftEye, rightEye;
		private GRect mouth;
	}	


