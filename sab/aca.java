package sab;

import robocode.HitByBulletEvent;
import robocode.HitRobotEvent;
import robocode.Robot;
import robocode.ScannedRobotEvent;
import java.awt.*;

public class aca extends Robot {
	private int Angulo;
	@Override
	public void onScannedRobot(ScannedRobotEvent event) {
		
		double d=event.getDistance();
		double l1=getBattleFieldWidth()*getBattleFieldHeight();
		double l2=Math.pow(getBattleFieldHeight(),2);
		double h=Math.sqrt(l1+l2);
		if(d<=h*0.3){	
		}
		if(event.getDistance()<400){
			fire(Math.min(3 - Math.abs(Angulo), getEnergy() - .1));
		}
		else
		{
			fire(1);
		}
		
	}
@Override
public void onHitByBullet(HitByBulletEvent event) {
	super.onHitByBullet(event);
	turnRight(80);
	back(90);
}
public void onHitRobot(HitRobotEvent event) {
	turnGunRight(getHeading()-getGunHeading()+event.getBearing());
	fire(3);
	
}

	
	
	@Override
	public void run() {
		
		setBodyColor(Color.cyan);
				
		

	while(true){
	    turnLeft(80);
	    ahead(80);
		turnGunLeft(360);

	    
		}
		
	  
	  
	
	
	
	
	
	
	
	}
	
	}

	
	
	
	

