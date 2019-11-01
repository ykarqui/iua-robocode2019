package ipdf;

import robocode.*;
import java.awt.Color;

public class OroSix extends Robot {
	

	boolean stopWhenSeeRobot = false; 
	
		
	
public void run() {
		
		setBodyColor(Color.black);
		setGunColor(Color.green);
		setRadarColor(Color.blue);
		setBulletColor(Color.yellow);
		setScanColor(Color.cyan);
		
		turnLeft(getHeading());
		while (true) {
			
			ahead(getBattleFieldHeight()- 150);
			turnGunLeft(450);
            back(50);
            turnGunRight(400);
            ahead(100);
            back(100);
            turnGunLeft(450);
            ahead((getBattleFieldHeight()/2)-300);
    		turnRight(-90);
            
		}
}	
	public void smartFire(double robotDistance) {
		if (robotDistance > 200 || getEnergy() < 15) {
			fire(3.-1);
			fire(3.-1);
		} else if (robotDistance > 50) {
			fire(4.-2);
			fire(4.-2);
		} else {
			fire(8.-3);
			fire(8.-3); 
		}
	}
	
	
	public void onScannedRobot(ScannedRobotEvent e) {
	
		if (stopWhenSeeRobot) {
			
			stop();
			
			smartFire(e.getDistance());
			
			scan();
			
			resume();
		} else {
			smartFire(e.getDistance());
		}
	}
	
	public void onHitRobot(HitRobotEvent event) {
		back(30);
		turnLeft(90);
	}
	
	public void onWin(WinEvent e) {
		for (int i = 0; i < 100; i++) {
			turnRight(30);
			turnLeft(30);
		}
	}

}
