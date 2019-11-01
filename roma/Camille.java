package roma;

import robocode.HitByBulletEvent;
import robocode.Robot;
import robocode.ScannedRobotEvent;
import java.awt.Color;

public class Camille extends Robot {
	
	public void run() {
		
		setColors(Color.BLACK,Color.DARK_GRAY,Color.LIGHT_GRAY);
		    
		while (true) { 
		    back(100); 
			turnRight(90);
		}
		}
		public void onScannedRobot(ScannedRobotEvent e) {
			fire(3);
			}
}
