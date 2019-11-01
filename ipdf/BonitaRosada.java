package ipdf;

import robocode.Robot;
import robocode.HitByBulletEvent;
import robocode.HitWallEvent;
import robocode.ScannedRobotEvent;
import robocode.WinEvent;

import java.awt.Color;

public class BonitaRosada extends Robot {

	public void run() {

		setBodyColor(Color.pink);
		setBodyColor(Color.magenta);
		setBodyColor(Color.pink);
		setBodyColor(Color.magenta);
		setBodyColor(Color.pink);

		while (true) {
			ahead(200);
			turnLeft(180);
			back(100);
			turnGunLeft(720);

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
		turnLeft(180);
	}

	public void onWin(WinEvent e) {
		for (int i = 0; i < 100; i++) {
			turnRight(30);
			turnLeft(30);
		}
	}
}
