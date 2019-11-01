package ipdf;

import robocode.*;
import java.awt.Color;

public class TIGERIII extends Robot {
	
boolean movingForward;
	
	
	public void run() {

		setBodyColor(Color.red);
		setGunColor(Color.black);
		setRadarColor(Color.black);
		setBulletColor(Color.green);
		setScanColor(Color.red);
		
		
		while (true) {
			getBattleFieldWidth();
			getBattleFieldHeight();		 
			while (true) {
				ahead(150);
				turnGunLeft(360);
				back(50);
				turnGunRight(360);
		
		}
				
		
						 
	}
}
	
	

	public void onHitWall(HitWallEvent event) {
		ahead(getBattleFieldHeight()- getX());
		turnRight(90);
		ahead(getBattleFieldHeight()/2);
	   }
	
	public void onScannedRobot(ScannedRobotEvent e)  {
			fire(4.-1);
			fire(4.-1);
	}
	
	
	
	public void onHitRobot(HitRobotEvent event) {
		ahead(getBattleFieldHeight()- getX());
		turnRight(90);
		ahead(getBattleFieldHeight()/2);
	}	

}
