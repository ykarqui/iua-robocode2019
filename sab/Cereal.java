package sab;

import java.awt.Color;

import robocode.HitRobotEvent;
import robocode.Robot;
import robocode.ScannedRobotEvent;

public class Cereal extends Robot {
	@Override
	public void onScannedRobot(ScannedRobotEvent event) {
		fire(3.1);
	}
	 @Override
	public void run(){
	
		 setBodyColor(Color.darkGray);
		 setGunColor(Color.WHITE);
		 setRadarColor(Color.darkGray);	
		 setBulletColor(Color.GREEN);
	     turnLeft(getHeading());
	     ahead(getBattleFieldHeight()-getY()-50);
	     turnLeft(90);	    
	 	while(true) {		
			ahead(  Math.random()*400);
			back(  Math.random()*400);
			turnGunLeft(180);
			turnGunRight(180);
			turnGunLeft(360);
			
			
       }
	 }
	public void onHitRobot (HitRobotEvent e)
	{
		fire(3.1);
		back(Math.random()*100);
		turnRight(90);
		 ahead(getBattleFieldHeight()-getY()-30);	
	}
	
	}