package ipdf;

import robocode.*;
import java.awt.Color;

public class Cooky extends Robot {
	
	public void run() {

		setBodyColor(Color.pink);
		setGunColor(Color.pink);
		setRadarColor(Color.black);
		setBulletColor(Color.black);
		setScanColor(Color.pink);

		while (true) {
			getBattleFieldWidth();
			getBattleFieldHeight();		 
			while (true) {
				ahead(250);
				turnGunLeft(360);
				back(250);
				turnGunRight(360);
		
		}
		}
		

	}
	
	public void onHitRobot1(HitRobotEvent e){
		if (e.getBearing() >-100 && e.getBearing() <90)
		
		  fire(3);
 }

	@Override
	public void onScannedRobot(ScannedRobotEvent event) {
	fire(3); 
	}
	
	@Override
	public void onHitByBullet(HitByBulletEvent event) {
		turnLeft(90 - getBearing());
	}
	
	@Override
	public void onHitWall(HitWallEvent event) {
		turnLeft(90);
		ahead(100);
	}
		@Override
		public void onHitRobot(HitRobotEvent event) {
			turnGunLeft(360);
	}


	private int getBearing() {
		// TODO Auto-generated method stub
		return 0;
	}

}



