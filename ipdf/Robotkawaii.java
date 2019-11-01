package ipdf;

import robocode.*;
import java.awt.Color;
import robocode.HitByBulletEvent;
import robocode.HitRobotEvent;
import robocode.HitWallEvent;
import robocode.ScannedRobotEvent;

public class Robotkawaii extends Robot {

			
	
	    public void run1() {
		    	setBodyColor(Color.gray);
		    	setGunColor(Color.red);
		    	setRadarColor(Color.red);
		    	setBulletColor(Color.red);
		    	setScanColor(Color.red);
		        while(true) {
		            turnRight(360);
		            
		        }
	    }
	    	
	    		public void run() {
	    			setBodyColor(Color.gray);
			    	setGunColor(Color.red);
			    	setRadarColor(Color.red);
			    	setBulletColor(Color.red);
			    	setScanColor(Color.red);

	    			while (true) {
	    				ahead(200);
	    				turnGunLeft(360);
	    				turnLeft(50);
	    				turnGunLeft(360);
	    				back(100);
	    				turnGunLeft(360);
	    				
	    			}
	    		
	    		}

	    		
	    		
	    		@Override
	    		public void onScannedRobot(ScannedRobotEvent event) {
	    			fire(5.-1);
	    			fire(5.-1);
	    		}
	    		
	    		@Override
	    		public void onHitByBullet(HitByBulletEvent event) {
	    			ahead(100);
	    			turnRight(90);
	    		}
	    		
	    		@Override
	    		public void onHitWall(HitWallEvent event) {
	    			turnLeft(90); 
	    		}

	    		@Override
	    		public void onHitRobot(HitRobotEvent event) {
	    			
	    		}
}

