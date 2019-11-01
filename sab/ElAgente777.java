package sab;

import java.awt.Color;

import robocode.AdvancedRobot;
import robocode.HitWallEvent;
import robocode.ScannedRobotEvent;

public class ElAgente777 extends AdvancedRobot{

	@Override

   
	public void onScannedRobot(ScannedRobotEvent event) {
		fire(4);
		double d=event.getDistance();
		double l1=getBattleFieldWidth()*getBattleFieldWidth();
		double l2=Math.pow(getBattleFieldHeight(),2);
		double h=Math.sqrt(l1+l2);
		double potencia=d*3/h;
		if(d<=h*0.3){
        fire(3.1-potencia);
		}
	}
public void onHitWall(HitWallEvent event){
	ahead(100);
		back(200);
	}
public void onHitRobot(robocode.HitRobotEvent event) {
	ahead(100);
	fire(3);
	
}

	@Override
public void run() {
	setBodyColor(Color.ORANGE);
	setGunColor(Color.cyan);
	setRadarColor(Color.MAGENTA);
	setScanColor(Color.white);
	setBulletColor(Color.GRAY);
	
	
    while(true){
    	turnGunRight(20);
        ahead(300);
    	setTurnRight(3000);
		setMaxVelocity(9);
		ahead(1000); 
		setTurnLeft(1000);
		setMaxVelocity(5);
		ahead(1000); 
    	turnGunLeft(1000);
    }
    
    }
  
    	

}
    

    	
	