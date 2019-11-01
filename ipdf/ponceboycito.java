package ipdf;

import java.awt.Color;

import robocode.HitByBulletEvent;
import robocode.HitRobotEvent;
import robocode.HitWallEvent;
import robocode.ScannedRobotEvent;

public class ponceboycito {
public void run() {
		
		setBodyColor(Color.red);
		setBodyColor(Color.blue);
		setBodyColor(Color.red);
		setBodyColor(Color.red);
		setBodyColor(Color.red);

		
		while (true) {
			turnGunRight(5);
		}
	}

	
	private void turnGunRight(double d) {
	// TODO Auto-generated method stub
	
}


	private void setBodyColor(Color red) {
	// TODO Auto-generated method stub
	
}


	public void onScannedRobot(ScannedRobotEvent e) {
		
		if (e.getDistance() < 70 && getEnergy() > 60) {
			fire(3);
		} 
		else {
			fire(2);
		}
		
		scan();
	}

	
	private void scan() {
		// TODO Auto-generated method stub
		
	}


	private void fire(int i) {
		// TODO Auto-generated method stub
		
	}


	private int getEnergy() {
		// TODO Auto-generated method stub
		return 0;
	}


	public void onHitByBullet(HitByBulletEvent e) {
		turnGunRight((90 - (getHeading() - e.getHeading())));

		ahead(40);
		
		scan();
	}

	
	private void ahead(Object dist) {
		// TODO Auto-generated method stub
		
	}


	private double getHeading() {
		// TODO Auto-generated method stub
		return 0;
	}


	public void onHitRobot(HitRobotEvent e) {
		double turnGunAmt =(e.getBearing() + getHeading() - getHeading());

		turnGunRight(turnGunAmt);
		fire(3);
	}
	 public void run11() {
	       setBodyColor(Color.RED);
	     
	   } 
	 public void run111() {
	       setBodyColor(Color.RED);
	    
	   }
	 
		public void onScannedRobot1(ScannedRobotEvent event) {
		fire(2); 
		}
		
		
		
		
		public void onHitWall(HitWallEvent event) {
			turnLeft(180);
			ahead(150);
			back(100);
		}


		private void turnLeft(int i) {
			// TODO Auto-generated method stub
			
		}


		private void back(int i) {
			// TODO Auto-generated method stub
			
		}
}

