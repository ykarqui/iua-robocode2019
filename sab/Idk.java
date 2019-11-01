package sab;

import java.awt.Color;
import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;
import robocode.HitRobotEvent;
import robocode.Rules;


	public class Idk extends AdvancedRobot {
		double ultdis;

	public void run() {
	setBodyColor(Color.black);
	setGunColor(Color.WHITE);
	setRadarColor(Color.gray);
	setBulletColor(Color.white);
  	setMaxVelocity(Rules.MAX_VELOCITY);
  	ultdis = Double.POSITIVE_INFINITY;
  	
  	while(true) {
  		setTurnRight(10000);
  		setMaxVelocity(7);
  		ahead(10000);
  	}
	}

	public void onScannedRobot(ScannedRobotEvent e) {
  	double distancia = e.getDistance();
  	double velocidad= e.getVelocity();
   if (distancia<130 || velocidad==0)
    {fire(3); }
   else
	   if (distancia<300 || velocidad==0)
	   	{ fire(2);}
	   else
	   {fire(1);}
	
      	setTurnRight(getHeading() + e.getBearing() - getGunHeading());
      	setMaxVelocity(7);
      	ahead(e.getDistance());
      	scan();
  	}
  
	public void onHitRobot(HitRobotEvent e){
	if (e.getBearing() > -10 && e.getBearing() < 10){
      		scan();
      	
	}
	}
	
	}
	
	



