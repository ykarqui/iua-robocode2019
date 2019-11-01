package ipdf;

import robocode.*;
import java.awt.Color;

public class Pepovich extends Robot {
	
public void run() {
		

		setBodyColor(Color.green);
		setGunColor(Color.black);
		setRadarColor(Color.blue);
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
	public void onScannedRobot(ScannedRobotEvent event) {
	fire(6.-1); 
	fire(6.-1); 
	}
	
	@Override
	public void onHitByBullet(HitByBulletEvent event) {
		turnLeft(90 - getBearing()-50);
		back(50);
	}
	
	private int getBearing() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void onHitWall(HitWallEvent event) {
		turnRight(180);
		
	}

	public void onHitRobot1(HitRobotEvent event) {
		turnGunLeft(360);
	}

	 public void onHitRobot(HitRobotEvent e){
		 ahead(500);
			turnLeft(180);
		
	
	 }

}
