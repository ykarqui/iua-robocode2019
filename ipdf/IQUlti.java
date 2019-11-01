package ipdf;

import java.awt.Color;
import robocode.*;

public class IQUlti extends Robot {

	boolean stopWhenSeeRobot = false; 
	
		
			double gunTurnAmt; 
			String trackName;
			
	public void run() {

		setBodyColor(Color.gray);
		setGunColor(Color.white);
		setRadarColor(Color.blue);
		setBulletColor(Color.green);
		setScanColor(Color.red);
           
		turnLeft(getHeading());

		
		int gunIncrement = 3;


			while (true) {
				
				for (int i = 0; i < 30; i++) {
					turnGunLeft(gunIncrement);
					ahead(getBattleFieldHeight()- 150);
					turnGunLeft(450);
	                back(50);
	                turnGunRight(400);
	                ahead(100);
	                back(100);
	                turnGunLeft(450);
	                ahead(100);
	                back(100);
	                turnGunLeft(380);
	                back(getBattleFieldHeight()- 150);
	                turnGunRight(460);
	                ahead(50);
	                turnGunLeft(450);
	                back(50);
	                turnGunRight(400);
	                back(50);
	                turnGunLeft(450);
					
				}
				gunIncrement *= -1;
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

		
		public void smartFire(double robotDistance) {
			if (robotDistance > 200 || getEnergy() < 15) {
				fire(3-1);
				fire(3-1);
			} else if (robotDistance > 50) {
				fire(4-2);
				fire(4-2);
			} else {
				fire(5-3);
				fire(5-3);
			}
		}
		
		
		
		public void onHitRobot(HitRobotEvent event) {
			turnLeft(90);
			ahead(100);
		}	
		
		public void onHitWall(HitWallEvent event) {
			
			
		   }
}
	

