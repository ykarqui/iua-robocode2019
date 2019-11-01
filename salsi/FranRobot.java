package salsi;
import robocode.*;
import java.awt.Color;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * FranRobot - a robot by (mi robot) */
public class FranRobot extends Robot {

	/*
	 * run: FranRobot's default behavior
	 */
	public void run() {
	setBodyColor(Color.red);
	setGunColor(Color.black);  
	setRadarColor(Color.gray);


	turnLeft(getHeading());
	ahead(getBattleFieldHeight()-getY());
	


		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		// setColors(Color.red,Color.blue,Color.green); // body,gun,radar

		// Robot main loop
		while(true) {
			double azar=Math.random()*200+100;
			
			




			// Replace the next 4 lines with any behavior you would like
			ahead(azar);
			turnGunRight(azar);
			back(azar);
			turnGunRight(360); 
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
				if(e.getDistance()<50) {
					fire(3);
					}else{						fire(1); 
					}
		

	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet 
	 */
	public void onHitByBullet(HitByBulletEvent e) {   
		// Replace the next line with any behavior you would like	
		int skape=(int)Math.random()*180+10;
		turnLeft(skape);
		back(60);
		//ESCAPAR GIRANDO AL AZAR
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
	int skapez=(int)Math.random()*180+10;
	turnLeft(skapez);
	double grados=Math.random()*(180-10)+10;
	turnRight(grados);
				
	
		// Replace the next line with any behavior you would like
		back(20);
	}	
}
