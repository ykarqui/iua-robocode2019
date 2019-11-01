package ipdf;

import java.awt.Color;
import robocode.*;

public class sabrina extends Robot {

	public void run() {

		setBodyColor(Color.black);
		setGunColor(Color.black);
		setRadarColor(Color.black);
		setBulletColor(Color.black);
		setScanColor(Color.black);

		while (true) {
			getBattleFieldWidth();
			getBattleFieldHeight();
			while (true) {
				ahead(150);
				turnGunLeft(360);
				back(50);
				turnGunRight(360);
				getVelocity();

			}
		}

	}

	public void onHitRobot1(HitRobotEvent e) {
		if (e.getBearing() > -90 && e.getBearing() < 90)

			fire(3);
		if (e.getEnergy() < 15) {
			turnGunRight(360);
			fire(1);
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
		turnLeft(90);
		ahead(getBattleFieldHeight() - 600);
		back(50);
		ahead(50);
	}

	public void onScannedRobot1(ScannedRobotEvent e) {

		fire(3);
		if (e.getEnergy() < 15) {

			fire(2);
		}
	}

	@Override
	public void onHitRobot(HitRobotEvent event) {
		if (getBearing() >-90 && getBearing() <90) {
			fire(2.5);
		}else if(getEnergy() < 15) {
				turnGunRight(360);
				back(55);
				turnLeft (150);		
		}
		
		
	}

	private int getBearing() {

		return 0;
	}

}
