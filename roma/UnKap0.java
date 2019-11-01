package roma;

import robocode.Robot;
import robocode.ScannedRobotEvent;
import  java.awt.Color;

public class UnKap0 extends Robot {
	@Override
	public void onScannedRobot(ScannedRobotEvent event) 
	{
		
    
	
		 fire(2);
		
	}

	@Override
	public void run() {
		setColors(Color.RED, Color.PINK, Color.ORANGE); 
		ahead(65);
		back(100);
		turnRight(230);
		
		while(true ) {
			ahead(200);
			turnRight(100);
	
		}

	}
}