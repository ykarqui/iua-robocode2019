package sab;


import robocode.Robot;
import robocode.ScannedRobotEvent;

import java .awt.Color;
public class Mark4 extends Robot {
	
			public void run(){
			setBodyColor(Color.orange);
			setGunColor(Color.red);
			setRadarColor(Color.black);
			setBulletColor(Color.red);
			
			while (true) {
				ahead(1202);
				back(220);
				turnGunRight(180);
				back(100);
				turnLeft(270);
				turnGunRight(180);
				ahead(400);
				
				
			}
		}
			public void onScannedRobot(ScannedRobotEvent e) {
				
				fire(3);
			if (e.getEnergy() < 40)
				fire(6);
			}
}

			

		

		
		
	

