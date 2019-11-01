package sab;

import java.awt.Color;

import robocode.AdvancedRobot;
import robocode.HitRobotEvent;
import robocode.HitWallEvent;
import robocode.HitByBulletEvent;
import robocode.ScannedRobotEvent;
import static robocode.util.Utils.normalRelativeAngleDegrees;


public class ByeByeSaba extends AdvancedRobot {
	double giroCanon=0;
	
	public void run() {
		setBodyColor(Color.CYAN);
		setGunColor(Color.CYAN);
		setRadarColor(Color.lightGray);
		setBulletColor(Color.cyan);
		setScanColor(Color.yellow);
		
		setTurnLeft(getHeading()+180);
		//ahead(getBattleFieldHeight()-getY());
		//back(50);
		//turnLeft(180);
		//turnGunLeft(90);
		double a= Math.random();
		while(true){
			setMaxVelocity(5);
			setAhead(1900*a);
			turnGunLeft(360);
			
		}
	}
		
	public void onScannedRobot(ScannedRobotEvent e){
		if (e.getDistance() > 400){
			setAhead(300);
		}
		giroCanon = normalRelativeAngleDegrees(e.getBearing() + (getHeading() - getRadarHeading()));
		turnGunLeft(giroCanon);
		if (e.getDistance() > 200 || getEnergy() < 15) {
		     setFire(2);
		 }
		else {
		     setFire(3);
		 }
	}
	
	public void onHitWall(HitWallEvent event){
		
			turnRight(160);
		}
		
	public void onHitByBullet(HitByBulletEvent event) {
		}
	
	public void onHitRobot(HitRobotEvent e){
		turnGunRight(getHeading()-getGunHeading()+e.getBearing());
		fire(3);
		scan();
	}
	
}