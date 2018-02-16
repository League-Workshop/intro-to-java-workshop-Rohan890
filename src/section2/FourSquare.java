package section2;

import java.util.Random;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot CP3o = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
		CP3o.penDown();
		CP3o.setSpeed(20000000);

		// 5. Set the pen width to 5
		CP3o.setPenWidth(20);

		// 6. Use a for loop to repeat steps #7 to #8, four times...
		for(int i = 0; i<4; i++) {

			// 7. Set the pen color to random
			Random random = new Random();
			int r = random.nextInt(256);
			int g = random.nextInt(256);
			int b = random.nextInt(256);
			CP3o.setPenColor(r,g,b);
	
			// 1. Call the drawSquare() method
			drawSquare();
	
			// 8. Turn the robot 90 degrees to the right
CP3o.turn(90);
	}
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		for(int i = 0; i<180; i++) {
			CP3o.move(100);
			CP3o.turn(90);}
		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



