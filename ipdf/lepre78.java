package ipdf;


import robocode.Robot;
import robocode.ScannedRobotEvent;

import java.awt.Color;
public class lepre78 extends Robot {

	public void run() {
		
		setBodyColor(Color.black);
        setGunColor(Color.red);
        setRadarColor(Color.red);
        setAdjustGunForRobotTurn(false);
        setAdjustRadarForRobotTurn(false);
      
		while(true) {
			
			ahead(500);
			turnLeft(90);
			turnGunLeft(12);
			ahead(500);
			turnLeft(90);
			turnGunLeft(12);
			ahead(500);
			turnLeft(90);
			turnGunLeft(12);
			ahead(500);
			turnLeft(90);
			turnGunRight(360);
			turnGunLeft(360);
			
					}
	}

	
	public void onScannedRobot(ScannedRobotEvent e) {
		
		fire(3);
		if (e.getEnergy() <20) {
						fire(9);	
		}
	}
}	
		

		
	
	
	

