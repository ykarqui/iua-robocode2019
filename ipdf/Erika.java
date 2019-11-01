package ipdf;

import robocode.*;
import java.awt.Color;
public class Erika extends Robot{
	
	public void run() {
	setBodyColor (Color.orange);
	setGunColor (Color.yellow);
	setRadarColor (Color.green);
	setBulletColor (Color.magenta);
	setScanColor (Color.red);
	 
	while(true) {
	  ahead(100);
	  turnGunRight(100);
	  back(10);
	  turnGunRight(80);
	 }
	}
public void onScannedRobot(ScannedRobotEvent e) {
	 fire(3);
	}
public void onHitByBullet(HitByBulletEvent e) {
	 turnLeft(160 - e.getBearing());
	}

	}


