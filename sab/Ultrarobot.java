package sab;

import java.awt.Color;

import robocode.Robot;
import robocode.ScannedRobotEvent;

public class Ultrarobot extends Robot {

	@Override
	public void onScannedRobot(ScannedRobotEvent event) {
		
		if (event.getDistance() >= 300)
		{
		 fire(1);
		}
		else if (event.getDistance() >= 100)
		{                                  
		 fire(2);
		}
		else
		{
		 fire(3);
		}
	}
	
	@Override
	public void run() {
		setBodyColor(Color.orange);
		setGunColor(Color.orange);
		setRadarColor(Color.orange);
		setScanColor(Color.orange);
		setBulletColor(Color.orange);
		while(true) { 
	    turnGunLeft(360);
		turnLeft(90);
		ahead(80);
		
		
		}
	}	
}
