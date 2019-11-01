package salsi;
import robocode.*;
import java.awt.Color;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * Termineitor - a robot by (your name here)
 */
public class Termineitor extends Robot
{
	/**
	 * run: Termineitor's default behavior
	 */
	public void run() {
	
		setBodyColor (Color.blue);
		setGunColor (Color.red);
		setRadarColor (Color.black);
		
		turnLeft (getHeading());
		ahead (getBattleFieldHeight()-getY());
		
		// Robot main loop
		while(true) {
		
			double azar = Math.random ()*200+100;
			
			ahead(azar);
			turnGunRight(azar);
			back(azar);
			turnGunRight(azar);
			turnRight (azar);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		if (e.getDistance ()<50 && getEnergy ()>50) {
				fire (3); }
			else {
				fire (1);
			}
			
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet 
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		int escape = (int) Math.random  ()* 180 -10;
		turnLeft (escape);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		double grados = Math.random ()*(180-10)+10;
		turnRight (grados);
	}	
}
