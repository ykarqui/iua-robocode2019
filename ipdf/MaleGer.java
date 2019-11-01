package ipdf;

import robocode.*;
import java.awt.Color;

public class MaleGer extends Robot {
	
	 public void run() {
		 
		 setBodyColor(Color.red);
			setGunColor(Color.black);
			setRadarColor(Color.blue);
			setBulletColor(Color.white);
			setScanColor(Color.red);
	        
	        while(true){
	            turnGunRight(90);
	        }
	    }
	 
	    public void onScannedRobot(ScannedRobotEvent e) {
	        stop();
	        setAdjustGunForRobotTurn(true);
	        if(e.getDistance() < 150 || e.getVelocity() == 0) 
	            fire(5.-1);
	        else
	            fire(3.-1); 
	        turnRight((getGunHeading()-getHeading())/2); 
	        ahead(100);
	    }
	 
	    public void onHitByBullet(HitByBulletEvent e) {
	        back(10);
	    }
	 
	    public void onHitWall(HitWallEvent e) {
	        back(20);
	    }

}
