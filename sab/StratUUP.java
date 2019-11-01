package sab;

import java.awt.Color;

import robocode.AdvancedRobot;
import robocode.HitByBulletEvent;
import robocode.Robocode;
import robocode.Robot;
import robocode.ScannedRobotEvent;

public class StratUUP extends AdvancedRobot {
	
   

	@Override
	public void run() {
		setBodyColor(Color.blue);
		setGunColor(Color.red);
	    setRadarColor(Color.white);
		setBulletColor(Color.yellow);
		
		while(true) {
			setTurnLeft(90);
			setAhead(80);
			back(90);
			setTurnGunLeft(10);
		}
	}
	public void onScannedRobot(ScannedRobotEvent event) {
		turnRight(1);
		if (getEnergy() < 50) {
			setFire(3);	
		}
		else
		{
	     setFire(1);
		}
		scan();

    	}
}


		
		
			


