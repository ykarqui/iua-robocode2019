package salsi;
import robocode.*;
import java.awt.Color;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * Bumbleblee lo mejor de todo
 */
public class Bumbleblee extends Robot
{
	/**
	 * run: Bumbleblee's default behavior
	 */
	public void run() {   
	
       setBodyColor(Color.blue);
	   setGunColor(Color.white);
	   setRadarColor(Color.yellow);
	   
		turnLeft(getHeading());
	   	//ahead(getBattleFieldHeight()-getY());
	   	//turnLeft(90);  
	  	//ahead(getX()-getBattleFieldWidth()/2);
	   
	   
		while(true) {
		
	    double avance=Math.random()*400+50;
		ahead(avance);
		turnGunRight(360);
		double grados=Math.random()*360;
		turnLeft(grados);
		  
		
			
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {

	      if(e.getDistance()<50&&getEnergy()>50)
			  fire(3);
			  else{
				  fire(2);
				  
			  }
		  }
	      
	
	public void onHitByBullet(HitByBulletEvent e) { 
    	
			int skape=(int)Math.random()*180-10;
			turnLeft(skape);
			ahead(60);
			
		//ESCAPAR GIRANDO AL AZAR.
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		double grados=Math.random()*(180-10)+10;
		turnRight(grados);
	
	
	}
    	//back(30);
	}	


