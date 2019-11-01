package sab;

import java.awt.Color;

import robocode.AdvancedRobot;


import robocode.ScannedRobotEvent;

public class Alan7 extends AdvancedRobot {
	public void run() {
		setBodyColor(Color.black);
		setGunColor(Color.orange);
		setRadarColor(Color.blue);
		setScanColor(Color.green);
		setBulletColor(Color.red);
	
		while (true) {
			ahead(100); 
			setTurnRight(100);
			back(50);
			setTurnGunLeft(360);
			
		}

}
		public void onScannedRobot(ScannedRobotEvent e) {
			fire(3);
		
		}
}
		
