package ipdf;
import java.awt.Color;

import robocode.HitByBulletEvent;
import robocode.HitRobotEvent;
import robocode.HitWallEvent;
import robocode.Robot;
import robocode.ScannedRobotEvent;

public class Pinky extends Robot {

	public void run() {

		setBodyColor(Color.black);
		setGunColor(Color.white);
		setRadarColor(Color.pink);
		setBulletColor(Color.pink);
		setScanColor(Color.black);

		while (true) {
			getBattleFieldWidth();
			getBattleFieldHeight();		 
			while (true) {
				ahead(160);
				turnGunLeft(360);
				back(60);
				turnGunRight(360);
		
		}
		}
		

	}
	
	public void onHitRobot1(HitRobotEvent e){
		if (e.getBearing() >-90 && e.getBearing() <90)
		
		  fire(4);
		if (e.getEnergy() < 10) {
			turnGunRight(360);
			fire (10);
	}

 }

	@Override
	public void onScannedRobot(ScannedRobotEvent event) {
	fire(2); 
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
		turnLeft(180);
		ahead(150);
		back(100);
	}
	
@Override
	public void onHitRobot(HitRobotEvent event) {
		if (getBearing() >-90 && getBearing() <90)
			  fire(2);
			if (getEnergy() < 15) {
				turnGunRight(360);
				fire (12);
			}
}
}
		
		
		

