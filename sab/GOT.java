package sab;

import robocode.AdvancedRobot;
import robocode.HitRobotEvent;
import robocode.ScannedRobotEvent;
import static robocode.util.Utils.normalRelativeAngleDegrees;

import java.awt.*;

public class GOT extends AdvancedRobot {
	private int Angulo;
	int busqueda = 0,bandera;
	double giroArma;
	String objetivo;

	public void run() {
		setBodyColor(Color.gray);
		setGunColor(Color.black);
		setRadarColor(Color.black);
		setScanColor(Color.black);
		setBulletColor(Color.black);
		objetivo = null;
		setAdjustGunForRobotTurn(true);
		giroArma = 10;
		while (true) {
	// Busqueda
			turnGunRight(giroArma);
			busqueda++;
			if (busqueda > 1) {
				giroArma = -10;
			}
			if (busqueda > 2) {
				giroArma = 20;
			}
			if (busqueda > 4) {
				objetivo = null;
			}
		}
	}
	public void onScannedRobot(ScannedRobotEvent e) {

		if (objetivo != null && !e.getName().equals(objetivo)) {
			return;
		}
		if (objetivo == null) {
			objetivo = e.getName();		
		}
		busqueda = 0;
		if (e.getDistance() > 250) {
			giroArma = normalRelativeAngleDegrees(e.getBearing() + (getHeading() - getRadarHeading()));
			setTurnGunRight(giroArma);
			turnRight(e.getBearing());
			turnRight(37);
			setAhead(e.getDistance() - 100);
			turnLeft(37);
			setTurnRight(e.getBearing());
			return;
		}
	// Disparo		 
		if (e.getDistance() < 330) {
		giroArma = normalRelativeAngleDegrees(e.getBearing() + (getHeading() - getRadarHeading()));
		turnGunRight(giroArma);
		setFire(Math.min(3 - Math.abs(Angulo), getEnergy() - .1));
		setTurnLeft(360);
		setAhead(50);
		scan();
		}
	}
	public void onHitRobot(HitRobotEvent e) {
		objetivo = e.getName();
		giroArma = normalRelativeAngleDegrees(e.getBearing() + (getHeading() - getRadarHeading()));
		setTurnGunRight(giroArma);
		setFire(Math.min(3 - Math.abs(Angulo), getEnergy() - .1));
		turnGunRight(Angulo);
		setTurnLeft(giroArma);
		setBack(130);
	}
}
       
     
       

