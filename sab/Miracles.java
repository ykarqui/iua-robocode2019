package sab;


import robocode.Robot;
import robocode.*;
import robocode.ScannedRobotEvent;
import java.awt.Color;

public class Miracles extends Robot {

    int cambio,cambio2=0;
	public void run() {
		setBodyColor(Color.orange);
		setGunColor(Color.orange);
		setRadarColor(Color.yellow);
		setBulletColor(Color.orange);
		setScanColor(Color.yellow);
		turnLeft(getHeading());
		if ((getY())<300 && getY()>100)
			{
				back(getY()/5);
			}
		else{
     			if ((getY())>=300 && getY()<500){
					ahead(getY()/5);
				}
		}
		turnLeft(90);
		if (getX()<400 && getX()>100)
		{
			ahead(getX()/5);
		}
		else {
			if (getX()>399 && getX()<700){
				back(getX()/5);
			}
		}
					
		while (true) {
			while (cambio<13)
			   {
				ahead(20); 
				turnLeft(30);
				turnGunLeft(360);
				cambio=cambio+1;
				cambio2=12;
			   }
			while (cambio2>0)
			   {
				ahead(20); 
				turnRight(30);
				turnGunRight(360);
				cambio2=cambio2-1;
				cambio=0;
	    		}
		  }
	}
		
	public void onHitByBullet(HitByBulletEvent event) {
		
		}
	
	/*public void onHitWall(HitWallEvent event) {
		turnRight(150);
		ahead(150);
	}
		
	public void onHitRobot(HitRobotEvent event) {
			turnGunRight(event.getBearing());
			fire(2.5);		
	}*/
	public void onScannedRobot(ScannedRobotEvent e) {
        if (e.getDistance() > 400 ) {
        	ahead(220);
        	
		}
	    else 
	     {
	    	if (e.getDistance() > 200 || getEnergy() < 15) {
	    	     fire(2);
	        }
	    	else {
		       fire(3);
	        }
	     }
	}
}