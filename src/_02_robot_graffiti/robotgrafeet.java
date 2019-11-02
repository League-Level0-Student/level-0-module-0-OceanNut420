package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class robotgrafeet extends robotGrayeeti {

	public static void main(String[] args) {
	
		Robot e = new Robot();
		e.penDown();
		e.setSpeed(10000000);
		e.move(114);
		e.turn(90);
		for(int i=0; i<180; i++) {
			e.move(1);
			e.turn(1);
		}
		e.penUp();
		e.move(200);
		
		
		
		
		//eeeeeeee
	}

}
