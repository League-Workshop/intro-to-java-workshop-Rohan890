package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
public static void main(String[] args) {
Robot CP3o= new Robot();
CP3o.penDown();
CP3o.setSpeed(9000);
CP3o.sparkle();
for(int i = 0; i<180; i++) {
CP3o.move(100);
CP3o.turn(90);			
	}
}
}
