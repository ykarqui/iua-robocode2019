package ipdf;

import robocode.*;
import java.awt.Color;

public class Lazzakill extends Robot {
	
	int count = 0; 
	double gunTurnAmt; 
	
	
	public void run() {
		
		setBodyColor(new Color(128, 128, 50));
		setGunColor(new Color(50, 50, 20));
		setRadarColor(new Color(200, 200, 70));
		setScanColor(Color.white);
		setBulletColor(Color.blue);

		
		setAdjustGunForRobotTurn(true); 
		gunTurnAmt = 10; 

		
		//while (true) {
			turnGunLeft (180);
	    	   ahead( getBattleFieldHeight()- getY()  );
	    	   turnRight(90);
	    	   ahead(getX());
			turnGunRight (180);
			ahead(90);
			getGunHeading();
			getY ();
			
			while (true) {
				
		    turnRadarRight(360);
			ahead( getBattleFieldHeight()/2);
			turnGunLeft (180);
			back(100);
			turnGunLeft(90);
			getX();
			ahead( getBattleFieldHeight()/2);
			turnGunLeft (180);
			getY ();
	}
}
			
			
	

	
	public void onScannedRobot(ScannedRobotEvent e) {

				
		count = 0;
		
		if (e.getDistance() > 100) {
			gunTurnAmt = (e.getBearing() + (getHeading() - getRadarHeading()));
			fire(4);
			turnGunRight(gunTurnAmt); 
			turnRight(e.getBearing()); 
		
		}
		}

		
		
	public void onHitRobot(HitRobotEvent e) {
		
		
		turnGunRight(gunTurnAmt);
		fire(3);
		back(50);
	}



}
