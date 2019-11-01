package ipdf;

import robocode.*;
import java.awt.Color;

public class boffegp extends Robot {
	
	public void run() {

		setBodyColor(Color.orange);
		setGunColor(Color.blue);
		setRadarColor(Color.yellow);
		setBulletColor(Color.red);
		setScanColor(Color.yellow);

		 
			while (true) {
				ahead(250);
				turnGunLeft(360);
				back(150);
				turnGunRight(360);
		
		}
		
		

	}
	
	public void onHitRobot1(HitRobotEvent e){
		turnLeft(90);
		turnGunRight(120);
		ahead(200);
 }

	@Override
	public void onScannedRobot(ScannedRobotEvent event) {
	fire(9.-1); 
	fire(9.-1); 
	}
	
	@Override
	public void onHitByBullet(HitByBulletEvent event) {
		turnLeft(180);
	}
	
	@Override
	public void onHitWall(HitWallEvent event) {
		turnLeft(180);
		ahead(150);
		back(100);
	}

}
