package sab;

import java.awt.Color;

import robocode.Robot;
import robocode.ScannedRobotEvent;
public class IngenieroMaster extends Robot {
	

	public void onScannedRobot(ScannedRobotEvent event) 
{
   event.getDistance();
             
            fire(2.5);
}
 

	public void run()
{
		setBodyColor(Color.BLACK);
		 setGunColor(Color.red);
		 setRadarColor(Color.GRAY);
		 setBulletColor(Color.RED);
		 setScanColor(Color.red);
	while (true){
	ahead(1000);
	turnRadarLeft(360);
	turnRight(200);
	turnGunRight(200);
		}           
}
	public void onScannedRobot1(ScannedRobotEvent e)
	  {
		  
			fire(3);}
	}



