package ipdf;

import java.awt.Color;
import robocode.*;


public class Antonio extends Robot {
	
	boolean peek; 
	double moveAmount; 

	public void run() {

		setBodyColor(Color.black);
		setGunColor(Color.black);
		setRadarColor(Color.red);
		setBulletColor(Color.red);
		setScanColor(Color.cyan);


		turnRight(10000);

		setMaxVelocity(5);

		ahead(10000);
	
	}
private void setMaxVelocity(int i) {
		
	}

	public void onHitRobot(HitRobotEvent e) {
	
		if (e.getBearing() > -90 && e.getBearing() < 90) {
			back(100);
		} 
		else {
			ahead(100);
		}
	}


	public void onScannedRobot(ScannedRobotEvent e) {
		fire(2);
		}
		public void onHitRobot1(HitRobotEvent e) {
			if (e.getBearing() > -10 && e.getBearing() < 10) {
				fire(3);
			}
			if (e.isMyFault()) {
				turnRight(10);
			}
		}
}
