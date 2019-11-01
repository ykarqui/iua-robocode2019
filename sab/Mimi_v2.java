package sab;

import static robocode.util.Utils.normalRelativeAngleDegrees;
import robocode.HitWallEvent;
import robocode.HitRobotEvent;
import robocode.Robot;
import robocode.ScannedRobotEvent;

public class Mimi_v2 extends Robot {
	double posicion;
	public void run() {
		turnRight(0-getHeading());
		turnRight(90);
		turnGunLeft(90);
		posicion=getBattleFieldWidth()-getX()-60;
		ahead(posicion);
		turnLeft(90);
		ahead(getBattleFieldHeight()-getY());
		back(getY());
		while(true) {
			posicion=getBattleFieldWidth()-getX()-100;
			ahead(posicion);
			ahead(getBattleFieldHeight());
			turnGunLeft(90);
			turnGunRight(90);
			back(getBattleFieldHeight());
			turnGunRight(90);
			turnGunLeft(90);
		}
	}
	public void onScannedRobot(ScannedRobotEvent e) {
		if (e.getDistance() < 250) {
			fire(3);
		}
			else
		{
				if (e.getDistance()>400) {					
				fire(1);
			   }
				else 
			   {
			    fire(2);
			   }
	}
  }
	public void onHitRobot(HitRobotEvent e) {
		turnRight(90);
		ahead(50);
		turnLeft(90);
	}
}

	
