package sab;
import robocode.*;

import static robocode.util.Utils.normalRelativeAngleDegrees;

import java.awt.Color;
public class Stalin extends AdvancedRobot{
	
	String objetivo;
	double giroArma;
	public void run() {
		//TODO LO SEPARADO
		setAdjustGunForRobotTurn(true);
		//COLORES
		setBodyColor(Color.BLACK);
		setGunColor(Color.DARK_GRAY);
		setRadarColor(Color.black);
		setBulletColor(Color.DARK_GRAY);
		int busqueda = 0;
		giroArma=10;
		while(true){
			//MOVIMIENTO 
		setAhead(100);
		setTurnLeft(45);
		//RADAR DE BUSQUEDA
		turnGunRight(giroArma);
		busqueda++;
		if (busqueda > 2) {
			giroArma = -10;
		}
		if (busqueda > 3) {
			giroArma = 20;
		}
		if (busqueda > 6) {
			objetivo = null;
		}
	}
	}
	@Override
		public void onScannedRobot(ScannedRobotEvent event) {
		if (objetivo != null && !event.getName().equals(objetivo)) {
			return;
		}
		if (objetivo == null) {
			objetivo = event.getName();		
		}
		giroArma = normalRelativeAngleDegrees(event.getBearing() + (getHeading() - getRadarHeading()));
		//CUANDO VE A UN ROBOT GIRA EL CA�ON EN SU DIRECCION
			turnGunRight(giroArma);
			//DISPARA SI 3 LA DISTANCIA ES MENOS DE 50 Y SU ENERGIA ES MAYOR DE 20
			if (event.getDistance() < 250) {
				fire(3);
				//AVANZA 100
				ahead(100);
			}
				else
					//SINO DISPARA A 2,5
					fire(2.5);
			//AVANZA 100
		ahead(100);
	}
	@Override
	public void onHitByBullet(HitByBulletEvent event) {
		//CUANDO LE PEGAN UNA BALA SE ALEJA
	setBack(100);
	setTurnLeft(45);
	}
	@Override
	public void onHitRobot(HitRobotEvent event) {
		//SI CHOCA CON UN ROBOT GIRA EL CA�ON A SU DIRECCION
		turnGunRight(getHeading()-getGunHeading()+event.getBearing());
		//DISPARA A 3
		fire(3);
		// Y SE ALEJA
		back(100);
		setTurnRight(45);
	}
}