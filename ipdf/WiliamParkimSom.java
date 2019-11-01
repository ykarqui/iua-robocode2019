package ipdf;


import robocode.Robot;
import robocode.ScannedRobotEvent;

public class WiliamParkimSom extends Robot {
	
	@Override
	public void run() {
	turnLeft(getHeading());
	ahead(getBattleFieldHeight()-getY());
	turnRight(90);
	ahead(getBattleFieldHeight()/2);
	turnRight(90);
	ahead(getBattleFieldHeight()/2);
	turnRight(90);
	ahead(getBattleFieldHeight()/2);
	turnRight(90);
	 while(true) {
	 ahead(500);
	 turnRight(200);
	 turnGunRight(120);
	 turnLeft(100);
	 turnGunLeft(120);
	 ahead(70);
	 turnRight(120);
	 turnLeft(90);
     turnGunLeft(120);
	 } 
}
	 
	public void onScannedRobot(ScannedRobotEvent e) {
	if (e.getEnergy() <20) {
		fire(3);	
		}
	if (e.getDistance()<100) {
		fire(3);
	}
	if (e.getDistance()>100) {
		fire(2);
}
	 } }
	

	

