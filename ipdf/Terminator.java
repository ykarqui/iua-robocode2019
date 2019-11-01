package ipdf;


import robocode.Robocode;
import robocode.ScannedRobotEvent;

import java.awt.Color;

import robocode.*;


public class Terminator extends Robot {
	public void run() {

		setBodyColor(Color.yellow);
		setRadarColor(Color.green);
		setAdjustGunForRobotTurn(false);
		setAdjustRadarForRobotTurn(false);

		while (true) {

			ahead(500);
			turnLeft(90);
			turnGunLeft(8);
			ahead(500);
			turnLeft(60);
			turnGunLeft(12);
			ahead(500);
			turnLeft(90);
			turnGunLeft(12);
			ahead(500);
			turnLeft(90);
			turnGunRight(360);
			turnGunLeft(360);

		}
	}

	public void onScannedRobot(ScannedRobotEvent e) {

		fire(1);
		if (e.getEnergy() < 10) {
			fire(9);
		}
	}

}
