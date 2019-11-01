package ipdf;

import java.awt.Color;
import robocode.*;

public class Kayyu extends Robot {
	
	public void run() {

		setBodyColor(Color.blue);
		setGunColor(Color.blue);
		setRadarColor(Color.black);
		setBulletColor(Color.green);
		setScanColor(Color.yellow);

		while (true) {
		ahead(200);
		turnGunRight(120);
		turnLeft(90);
		turnGunRight(120);
		ahead(200);
		turnGunRight(120);
		turnLeft(90);
		ahead(150);
		
		}

	}

	@Override
	public void onScannedRobot(ScannedRobotEvent event) {
	fire(2); 
	}
	
	@Override
	public void onHitByBullet(HitByBulletEvent event) {
		
	}
	
	@Override
	public void onHitWall(HitWallEvent event) {
		turnRight(180);
		
	}

	@Override
	public void onHitRobot(HitRobotEvent event) {
		turnGunLeft(90);
	}


	


}
