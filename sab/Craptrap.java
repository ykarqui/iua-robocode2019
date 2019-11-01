package sab;

import java.awt.Color;

import robocode.Robot;
import robocode.ScannedRobotEvent;

public class Craptrap extends Robot {
	
	

	

	@Override
	public void onScannedRobot(ScannedRobotEvent event) {
	
       fire(2);
       
	}

	@Override
	public void run() {
		setBodyColor(Color.YELLOW);
		setGunColor(Color.orange);
		setRadarColor(Color.red);
		setScanColor(Color.GREEN);
		setBulletColor(Color.WHITE);
		
		turnLeft(getHeading());
		
		
		while (true) {
			turnGunRight(360);
			turnLeft(120);
			ahead(80);
			turnLeft(120);
			turnGunLeft(360);
			ahead(80);
			turnRight(120);
			ahead(80);
		}
		
	}
	
	
	
	
	
	
	
	
}
