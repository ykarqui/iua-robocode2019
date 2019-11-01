package sab;

import java.awt.Color;
import robocode.Robot;
import robocode.ScannedRobotEvent;

public class TheBestJasjas extends Robot 
{
	
		public void onScannedRobot(ScannedRobotEvent event) 
 {
	        
                fire(2.5);
  }

public void run()
{
	//CAMBIAMOS DE COLOR AL TANQUE POR PARTES
	
 setBodyColor(Color.WHITE);//CUERPO
 setGunColor(Color.magenta);//ARMA
 setRadarColor(Color.MAGENTA);//RADAR
 setBulletColor(Color.yellow);//BALA
 setScanColor(Color.YELLOW);//ESCANER
 
	  
	while(true)
	{
	   ahead(100);
	   turnGunLeft(360);//
	   back(150);
	   turnGunLeft(360);//
	   turnLeft(90);
	   turnGunLeft(360);
	   ahead(90);//
	   turnRight(90);
	   turnGunLeft(360);
	   ahead(250);
	   turnGunLeft(360);//
	   turnRight(45);
	   turnGunLeft(360);//
	   ahead(350);
	   turnGunLeft(360);//
       turnLeft(120);
       turnGunLeft(360);//
       ahead(150);
       turnGunLeft(360);//
	}
}
  public void onHitRobotHitRobotEvent()
  {
	  turnRadarLeft(360);;
	  fire(3);
  }
}