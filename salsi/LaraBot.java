package salsi;

import robocode.*;
import java.awt.Color;
//import java.awt.Color;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * LaraBot - a robot by (Lara)
 */
public class LaraBot extends Robot {
	/**
	 * run: LaraBot's default behavior
	 */
	public void run() {
		// Colores establecidos: (Color.red,Color.blue,Color.green); // body,gun,radar
		// La idea es hacer que el robot utilice sus tres partes (body, gun, radar) por
		// separado;
		setBodyColor(Color.pink);
		setGunColor(Color.orange);
		setRadarColor(Color.green);
		turnLeft(getHeading());
		ahead(getBattleFieldHeight() - getY());

		setAdjustGunForRobotTurn(true);
		// Separar las partes;
		while (true) {
			turnLeft(20);
			ahead(116);
			// ahead(100);
			// ahead(200);
			turnGunRight(90);
			back(100);
			turnGunLeft(60);
			turnLeft(30);
			turnGunRight(100);
			ahead(100);
			turnRight(30);

		}
	}

	/**
	 * onScannedRobot:
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// ScannedRobotEvent e;
		// chocarse con la pared/tanque;
		// fire(2);
		// saber velocidad del otro;
		e.getVelocity();
		if (e.getDistance() < 40 && getEnergy() > 40) {
			fire(3);
		} else {
			fire(1);

		}
		e.getEnergy();
		if (e.getEnergy() < 30 && getEnergy() > 30) {
			turnLeft(80);
			ahead(56);
		}

	}

	/**
	 * onHitByBullet: cuando te disparan (by a bullet);
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		int grados = (int) Math.random();
		grados = 150 + 10;
		turnLeft(grados);
		// trata de esquibar una bala girando en grados

	}

	/**
	 * onHitWall: evento desafortunado;
	 */
	public void onHitWall(HitWallEvent e) {
		int sKape2 = (int) Math.random();
		sKape2 = 170 + 10;
		turnLeft(sKape2);

	}
}
