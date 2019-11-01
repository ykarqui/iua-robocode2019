package salsi;
import robocode.*;
import java.awt.Color;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * Nazi2000 - a robot by (your name here)
 */
public class Optimusprime extends Robot {
	int turnDirection = 1;
	/**
	 * run: Nazi2000's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		// setColors(Color.red,Color.blue,Color.green); // body,gun,radar

		// Robot main loop
		setBodyColor(Color.black);
		setGunColor(Color.red);
		setRadarColor(Color.blue);
		
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			turnRight(5 * turnDirection);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
	    fire(1.5);  
		turnRight(e.getBearing());
		ahead(e.getDistance() + 5);
		scan();
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
      // double grados=Math.random()*(179-10)+10;
	  // ahead(grados);
	  
		turnLeft (e.getBearing());
		

	}   
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		double grados=Math.random()*(179-10)+10;
		turnRight(grados); 
	}	
}
