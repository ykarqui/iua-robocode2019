package sab;

import java.awt.Color;

import robocode.AdvancedRobot;
import robocode.HitByBulletEvent;
import robocode.HitRobotEvent;
import robocode.HitWallEvent;
import robocode.ScannedRobotEvent;

public class AitorTilla extends AdvancedRobot {
		public void run() {
			setBodyColor(Color.orange);
			setGunColor(Color.yellow);
			setRadarColor(Color.orange);
			setBulletColor(Color.yellow);
			setScanColor(Color.yellow);
			while(true){
				setTurnLeft(999999999);ahead(999999999);setTurnRight(999999999);ahead(999999999);
			}
			}
public void onScannedRobot (ScannedRobotEvent event) {
	setTurnRight(event.getBearing());
	if(event.getDistance() < 120)
	fire(3);
}
public void onHitWall (HitWallEvent event) {
stop();
back(250);
resume();
	
}
public void onHitRobot (HitRobotEvent event) {
	fire(3);
	stop();
	ahead(100);
	resume();
}
public void onHitBullet (HitByBulletEvent event) {
	setTurnRight(999999);ahead(999999);setTurnLeft(999999999);ahead(999999999);
}
}


