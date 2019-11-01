package sab;


import robocode.*;

import static robocode.util.Utils.normalRelativeAngleDegrees;
import robocode.HitRobotEvent;
import robocode.ScannedRobotEvent;
import java.awt.Color;

public class Lican extends AdvancedRobot {
	double giro;
	int bandera=5;
	public void run() {
	setAdjustGunForRobotTurn(true);
	setBodyColor(Color.YELLOW);
	setGunColor(Color.DARK_GRAY);
	setRadarColor(Color.black);
	setBulletColor(Color.orange);
	while(true){
	setMaxVelocity(7);
	setTurnLeft(Double.POSITIVE_INFINITY);
	setTurnGunRight(Double.POSITIVE_INFINITY);
	ahead(100000);	
	  }
   }
	public void onScannedRobot(ScannedRobotEvent event) {
		
		giro = normalRelativeAngleDegrees(event.getBearing() + (getHeading() - getRadarHeading()));
		setTurnGunRight(giro);
		setAhead(100000);
		if (event.getDistance() < 250) {
			fire(3);
			setTurnGunRight(Double.POSITIVE_INFINITY);
		}
			else
		{
				if (event.getDistance()>400) {					
				fire(1);
				setTurnGunRight(Double.POSITIVE_INFINITY);
			   }
				else 
			   {
			    fire(2);
			    setTurnGunRight(Double.POSITIVE_INFINITY);
			   }
		}
				
	}
	public void onHitRobot(HitRobotEvent e) {
		giro = normalRelativeAngleDegrees(e.getBearing() + (getHeading() - getRadarHeading()));
		setTurnGunRight(giro);
		setFire(3);
	}
}

