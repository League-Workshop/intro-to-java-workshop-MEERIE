package section2;
import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;
public class MyFirstJavaProgram {
	public static void main(String[] args) {
		Robot asphalt8 = new Robot();	
		
	asphalt8.setSpeed(5000);
	asphalt8.penDown();
	asphalt8.move(100);
	asphalt8.turn(90);
	asphalt8.move(100);
	asphalt8.turn(90);
	asphalt8.move(100);
	asphalt8.turn(90);asphalt8.move(100);
	asphalt8.turn(90);

	asphalt8.penUp();
}}
