package section2;

import org.jointheleague.graphical.robot.Robot;

public class FlamingNinjaStar {
	
	public static void main(String[] args) {

		int baseSize = 300;		//the size of the black part of the star
		int flameSize = 200;		//the length of the flaming arms
		
		// 1. Make a new robot, and set it's pen down.
	Robot CP3o = new Robot();
	CP3o.penDown();

		// *14. Use the methods setX and setY to move the ninja star into the center of the screen
	CP3o.setX(400);
	CP3o.setY(300);
		
		// *15. Make some adjustments to see what other kinds of shapes you can make.

		// 12. Set the robot speed to 10
   CP3o.setSpeed(9999999);
		// 13. Use a for loop to repeat all of the code below 25 times
for(int i = 0; i<24; i++ ) {
			// 2. Turn the robot 1/8 of a circle
   CP3o.turn(45);
		
			// 3. Move the robot 64 pixels
   CP3o.move(64);
			// 4. Turn the robot 40 degrees to the LEFT. (Negative numbers will turn the robot counter-clockwise.)
   CP3o.turn(-40);
			
			// 5. Move the robot the distance in the variable flameSize
   CP3o.move(flameSize);	
			// 6. Turn the robot 170 degrees
  CP3o.turn(170);
			// 7. Move the robot the distance in the variable flameSize (again)
  CP3o.move(flameSize);
			// 8. Turn the robot 64 degrees to the right
  CP3o.turn(64);
			// 9. Move the robot the distance in the variable baseSize
  CP3o.setPenColor(0,0,0);			
  CP3o.move(baseSize);
  CP3o.setPenColor(255,215,0);
			// 10. Check that your shape is the same as Figure 1. This is one arm of the ninja star.
			
			// 11. Color your ninja star like Figure 2.
			
	}
	}
	private static void setX(int i) {
		// TODO Auto-generated method stub
		
	}

}

