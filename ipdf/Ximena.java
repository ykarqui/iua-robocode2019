package ipdf;

import robocode.*;
import java.awt.Color;

public class Ximena extends Robot {
	
	public void run() {
		
		setBodyColor(Color.magenta);
		setGunColor(Color.magenta );
		setRadarColor(Color.magenta);
		setBulletColor(Color.magenta);
		setScanColor(Color.magenta);
			
		        while(true) {
		            turnRight(60); 
		            turnGunLeft(180);
		        	turnRight(60); 
		        	turnGunLeft(-180);
		        }
		    }
		 
		    public void onScannedRobot(ScannedRobotEvent e) {
		    	 fire(5.-2); 
			     fire(5.-2); 
		        stop();      
		        ahead(10000);    
		    }
		 
		    
		    public void onHitRobot(HitRobotEvent e){
		        fire(5.-1); 
		        fire(5.-1); 
		        scan();  
		                 
		    }

}
