package ipdf;

import robocode.*;
import static robocode.util.Utils.normalRelativeAngleDegrees;

import java.awt.Color;
public class Isaias723 extends Robot {
	int others; 
	static int corner = 0; 
	boolean stopWhenSeeRobot = false; 
	
		private static final boolean HitByBulletEvent = false;
		int dist =  50 ;
		int count = 0; 
			
			double gunTurnAmt; 
			String trackName;
	
public void run() {
		
		setBodyColor(Color.black);
		setGunColor(Color.blue);
		setRadarColor(Color.white);
		setScanColor(Color.yellow);

		
		while (true) {
			
			turnRight(10000);
			
			
			
			ahead(1000);
			
		}
	}

	

public void goCorner() {
	
	
	
	turnRight(normalRelativeAngleDegrees(corner - getHeading()));
	
	

	ahead(5000);
	
	turnLeft(90);

	ahead(5000);
	
	turnGunLeft(90);
}



public void onScannedRobot(ScannedRobotEvent e) {

	if (stopWhenSeeRobot) {
		
		stop();
		
		smartFire(e.getDistance());
		
		scan();
		
		resume();
	} else {
		smartFire(e.getDistance());
		double angulo = e.getBearing();
		
		turnRight(angulo);
		
		fire(1);
		
		ahead(10);
	}
}


public void smartFire(double robotDistance) {
	if (robotDistance > 200 || getEnergy() < 15) {
		fire(1);
	} else if (robotDistance > 50) {
		fire(2);
	} else {
		fire(3);
	}
}



public void onHitRobot(HitRobotEvent event) {
	ahead(getBattleFieldHeight()- getX());
	turnRight(90);
	ahead(getBattleFieldHeight()/2);
}	

public void onHitWall(HitWallEvent event) {
	
	
   }

public void onDeath(DeathEvent e) {
	
	if (others == 0) {
		return;
	}
}
	public void onHitByBullet(HitByBulletEvent e) {
		
		turnRight(180);
		
		ahead(20);
	
	}	



public static boolean isHitbybulletevent() {
	return HitByBulletEvent;
	
}
}




	
	
