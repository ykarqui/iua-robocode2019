package sab;

import java.awt.Color;
import robocode.ScannedRobotEvent;
import robocode.AdvancedRobot;
import robocode.Event;
import robocode.HitByBulletEvent;
import robocode.HitRobotEvent;
import robocode.HitWallEvent;
import robocode.Robot;
//Robot de prueba
//get battlefield height(alto),width(ancho). get x,y(coordenadas). get heading(hacia donde ve)


public class BbHitlerJudio extends AdvancedRobot {
	
	
	public void run(){
		setAdjustGunForRobotTurn(true);
		setBodyColor(Color.magenta);
		setGunColor(Color.pink);
		setRadarColor(Color.black);
		setBulletColor(Color.black);
		
		/*turnLeft(getHeading());
		ahead(getBattleFieldHeight()-getY());
		turnRight(90);
		ahead(getBattleFieldWidth()-getX());
		back(getX()/2);
		turnLeft(90);
		back(getY()/2);
		if(getGunHeading()<90)
		{
		turnGunRight(360);
		}*/
		while(true){
			
			setAhead(15);
			setTurnLeft(10);
			turnGunLeft(10);
			
		}
		
			
			
		}
		
	

	public void onHitWall(HitWallEvent e){
		
	}
	public void onHitRobot(HitRobotEvent e){
		
		turnGunRight(180);
	}
	public void onScannedRobot(ScannedRobotEvent e){
		turnRight(1);
		if(e.getDistance()<500)
		{
			setFire(3);
		}
		else
		{
			setFire(1);
		}
		scan();
		}
	public void onHitByBullet(HitByBulletEvent e){
	back(200);
	}
}
