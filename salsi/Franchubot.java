package salsi;
import robocode.*;
import java.awt.Color;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * Franchubot - a robot by (your name here)
 */
public class Franchubot extends Robot  
{ 
	/**
	 * run: Franchubot's default behavior
	 */
	public void run() {
	setBodyColor(Color.black);
		 setGunColor(Color.red);
		 setRadarColor(Color.white);
		while(true) {
		turnLeft(60);
		ahead(40);
		
			// Replace the next 4 lines with any behavior you would like
			double matu=Math.random()*200+100;
			
          
			ahead(100);
			turnGunRight(360);
			back(matu);
			turnGunRight(240);
	}
}
	/**
	 * onScannedRobot: What to do when you see another robot 
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		fire(1);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		int escapar=(int)Math.random()*180+10;
		turnLeft(escapar);
	
		// Replace the next line with any behavior you would like
		
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		back(20);
	}	
}
