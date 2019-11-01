package salsi;
import robocode.*;
import java.awt.Color;
//import java.awt.Color; 

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * ROBIROBOTS - a robot by (your name here)
 */
public class ROBIROBOTS extends Robot
{
	/**
	 * run: ROBIROBOTS's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here
		setGunColor(Color.red);
		setBodyColor(Color.black);
		setRadarColor(Color.green);
		turnLeft (getHeading());
		ahead (getBattleFieldHeight()-getY());  
	while(true) {
			// Replace the next 4 lines with any behavior you would like;
			ahead(500);
			turnLeft(90);
			turnGunLeft(12);
			ahead(500);
			turnLeft(90);
			turnGunLeft(12);
			ahead(500);
			turnLeft(90);
			turnGunLeft(12);
			ahead(400);
			turnLeft(90);
			turnGunRight(360);
			turnGunLeft(360);
			
			//back(95);
			turnGunRight(140);
	      }  
			
			
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		fire(1);
		
	if (e.getDistance () < 50){
		fire (3);
	 }else{
	    fire (1);
		}	
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like)
		back(10);
		}
	
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		back(10);
		back(20);
		
		
	}	
}
