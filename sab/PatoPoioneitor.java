package sab;

import robocode.HitByBulletEvent;
import robocode.HitRobotEvent;
import robocode.HitWallEvent;
import robocode.Robot;
import robocode.ScannedRobotEvent;

import java.awt.Color;


public class PatoPoioneitor extends Robot {
	
	@Override
	
		public void onScannedRobot(ScannedRobotEvent event) {
		fire(2);
		
		scan();
			}
		
	
@Override
public void run() {

	 setBodyColor(Color.yellow);
	 setGunColor(Color.cyan);
	 setRadarColor(Color.green);
	 setBulletColor(Color.red);
	 setScanColor(Color.green);
	 
	 
 
	turnRight(30);
    ahead(200);
    
   
	while (true){
	  ahead(120);
	   turnLeft(145);
			    }
	
	
}
		 

	@Override
	public void onHitByBullet(HitByBulletEvent event) {
	
	
}
	@Override
	
	
	public void onHitWall(HitWallEvent event) {
		turnLeft(20);
		 back(80);
		
	}
		@Override
	
		public void onHitRobot(HitRobotEvent event) {
			ahead(100);
			 fire(2);
			 
			 turnLeft(60);
			 back(50);
		} 
		 
	
}
