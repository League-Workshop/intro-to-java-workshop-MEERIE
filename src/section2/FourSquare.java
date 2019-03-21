package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot asphalt8 = new Robot("batman");	

	void go() {

		// 4. Make the robot move as fast as possible
		asphalt8.setSpeed(50000);
		// 5. Set the pen width to 5
		asphalt8.setPenWidth(5);
		// 6. Use a for loop to repeat steps #7 to #8, four times...
		for(int i = 0;i<4;i++) {
			// 7. Set the pen color to random
	asphalt8.setRandomPenColor();
			// 1. Call the drawSquare() method
		drawSquare();
			// 8. Turn the robot 90 degrees to the right
		asphalt8.turn(90);
		}	
	}
	
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		/* 3. Fill in the code to draw a square inside the method below. */
		
		asphalt8.penDown();
		asphalt8.move(100);
		asphalt8.turn(90);
		asphalt8.move(100);
		asphalt8.turn(90);
		asphalt8.move(100);
		asphalt8.turn(90);asphalt8.move(100);
		asphalt8.turn(90);

		asphalt8.penUp();
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



