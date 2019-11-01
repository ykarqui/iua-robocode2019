package ipdf;

import java.awt.Color;
import robocode.*;

public class Masahala extends Robot {

	public void run() {

		setBodyColor(Color.blue);
		setGunColor(Color.green);
		setRadarColor(Color.magenta);
		setBulletColor(Color.green);
		setScanColor(Color.blue);

		while (true) {
			getBattleFieldWidth();
			getBattleFieldHeight();		 
			while (true) {
				ahead(150);
				turnGunLeft(360);
				back(50);
				turnGunRight(360);
		
		}
		}
		

	}
	
	public void onHitRobot1(HitRobotEvent e){
		if (e.getBearing() >-90 && e.getBearing() <90)
		
		  fire(3);
		if (e.getEnergy() < 15) {
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
				fire (10);
				
	}
		
		
		 }
	
	




	private int getBearing() {
		return 0;
	}

}
