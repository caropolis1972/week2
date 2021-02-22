	
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


import acm.program.GraphicsProgram;

		
	public class RobotFace extends GraphicsProgram {

		public void run() {

			// Creates an object robot face with the dimensions width and height
			double faceWidth = 100;
			double faceHeight = 200;
			GCRobotFace robot = new GCRobotFace(faceWidth, faceHeight);
			
			// Use methods to get size of the canvas and calculate the centered position of the face on the screen.
			// Coordinates x, y
			double x = (getWidth() - faceWidth) / 2;
			double y = (getHeight() - faceHeight) / 2;
			
			// Adds the robot face to the canvas /  Draws it
			add(robot, x, y);
			
		}
	}

	
