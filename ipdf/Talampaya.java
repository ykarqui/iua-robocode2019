package ipdf;

import robocode.*;
import java.awt.Color;
//import getdistance


public class Talampaya extends Robot {
	
public void run() {
		

		setBodyColor(Color.black);
		setGunColor(Color.black);
		setRadarColor(Color.orange);
		setBulletColor(Color.cyan);
		setScanColor(Color.cyan);

		while (true) {
			ahead(500);
			turnLeft(90);
			
			turnGunLeft(180);
			ahead(500);
			turnLeft(90);
			turnGunLeft(12);
			ahead(500);
			turnGunLeft(90);
			turnLeft(90);
			turnGunLeft(12);
			ahead(500);
			turnLeft(180);
			turnGunRight(360);
			turnGunLeft(360);
		
		}

	}

	@Override
	public void onScannedRobot(ScannedRobotEvent t){
		  double distance = t.getDistance(); 
		  if(distance > 80) 
		    fire(5);
		  else if(distance > 40 )
		    fire(4);
		   else if(distance < 200)
		    fire(1);
		}
	
			
	@Override
	public void onHitByBullet(HitByBulletEvent event) {
		turnLeft(90 - getBearing());
	}
	
	private int getBearing() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void onHitWall(HitWallEvent event) {
		turnRight(90);
		
	}

	public void onHitRobot1(HitRobotEvent event) {
		turnGunLeft(360);
	}

	 public void onHitRobot(HitRobotEvent e){
			if (e.getBearing() >-90 && e.getBearing() <90)
			
			  fire(5);
			if (e.getEnergy() < 15) {
				turnGunRight(360);
				fire (10);
		}
	
	 }

}
