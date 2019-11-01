package ipdf;

import robocode.*;

public class robotito17 extends Robot {
	
	@Override
    public void onScannedRobot(ScannedRobotEvent e) {
	fire(3);
	if(e.getEnergy()>20) {
		fire(4);
	}
	}		
		
		
	@Override
	public void run() {
		
		turnGunRight(180);
		turnLeft(getHeading());
		ahead(getBattleFieldHeight() - getX());
		turnLeft(80);
		ahead(getX());
		turnLeft(20);
		ahead(90);
		back(120);
		ahead(20);
		back(220);
		turnLeft(30);
		turnRight(120);
		ahead(getY());
		ahead(90);
		back(30);
		ahead(30);
		back(30);
		ahead(30);
		fire(4);
		while (true) {
			
						ahead(500);
						turnLeft(80);
						turnGunLeft(12);
						ahead(500);
						turnLeft(80);
						turnGunLeft(12);
						ahead(500);
						turnLeft(80);
						turnGunLeft(12);
						ahead(500);
						turnLeft(80);
						back(500);
						fire(3);
    	}
	} 	
}	
    




