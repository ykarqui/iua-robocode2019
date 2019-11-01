package jfk;

import java.awt.Color;

import robocode.HitByBulletEvent;
import robocode.*;
import robocode.ScannedRobotEvent;
import robocode.WinEvent;



public class TnT extends Robot {
public void run() {
		
	setBodyColor(Color .BLACK);
	setGunColor(Color.RED);
	setScanColor(Color.BLACK);
	setBulletColor(Color.YELLOW);

while(true) {

	turnRight(80);
	ahead(50);
	
	}
}

public void onScannedRobot(ScannedRobotEvent e) {
double angulo = e.getBearing();
	
	stop();
	
	turnGunRight(angulo);
	fire(1);

if(e.getEnergy()>=80) {
	
	stop();
	turnRight(angulo);
	turnGunLeft(angulo);
	fire(2);
		
}
else {
	
	stop();
	turnRight(angulo);
	turnGunLeft(angulo);
	fire(1);
	ahead(2);
	
}
	scan();
	
if(e.getEnergy()>=50) {
	
	stop();
	turnRight(angulo);
	turnGunLeft(angulo);
	fire(3);
	ahead(2);
		
}
	else {
		
	stop();
	turnRight(angulo);
	turnGunLeft(angulo);
	fire(2);
	ahead(2);
}

	scan();
	
}

public void onHitBullet(HitByBulletEvent e) {
	
	back(200);	
}
public void onWin(WinEvent event) {
	
	setColors(Color.WHITE, Color.WHITE, Color.WHITE);
	turnRadarRight(360);
	fire(30);
	
}
public void onHitRobot(HitRobotEvent e) {
	
	if(getEnergy()>12) {
		stop();
		fire(3);
	}
	else {
		back(200);
		turnLeft(90);
		ahead(100);
	}
	}
public void onHitWall(HitWallEvent e) {
	
	back(200);
	ahead(100);
	
}
}
//Benjamin Arrieta Bot Copyrigth :v
