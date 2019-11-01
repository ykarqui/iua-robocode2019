package jfk;

import java.awt.Color;

import robocode.HitByBulletEvent;
import robocode.HitRobotEvent;
import robocode.Robot;
import robocode.RobotDeathEvent;
import robocode.ScannedRobotEvent;
import robocode.WinEvent;

public class T34 extends Robot {
	 
	int scannedX = Integer.MIN_VALUE;
	int scannedY = Integer.MIN_VALUE;
	int empz=0;
	String nombre;
	
	@Override
	public void onWin(WinEvent event) {
		setColors(Color.YELLOW, Color.YELLOW, Color.RED);	
	}

	
	@Override
	public void onHitRobot(HitRobotEvent event) {
		if(event.isMyFault()){
			turnGunLeft(1);
			fire(3);
			turnGunRight(1);
		}
	}
	
	@Override
	public void onRobotDeath(RobotDeathEvent event) {
		if(nombre==event.getName()){
			nombre=null;
		}
	}
	
	@Override
	public void onHitByBullet(HitByBulletEvent event) {
		if(event.getPower()>=1){
		nombre=event.getName();	
		}
		
	}
	
	@Override
	  public void onScannedRobot(ScannedRobotEvent event) {
		if(empz<=5){
			stop();
			empz++;
		}
		if(nombre==null){
			nombre=event.getName();
		}
		if(nombre!=event.getName()){
			return;
		}
		double angle = Math.toRadians((getHeading() + event.getBearing()) % 360);
		scannedX = (int)(getX() + Math.sin(angle) * event.getDistance());
		scannedY = (int)(getY() + Math.cos(angle) * event.getDistance());
		double xdi= scannedX - getX(); 
		double ydi= scannedY - getY();
	
		if(xdi<0){xdi=xdi*-1;}
		if(ydi<0){ydi=ydi*-1;}
		
	int e=0;
	if(xdi<= 75 && ydi<=75){
	e=1;
	}else if(xdi<= 25 && ydi<=25){
		e=2;
	}
	

		if(getEnergy()>3){
			fire(3);
		}else{
			fire(1.5);
		}
		
		
	if(e==0){
			turnRight(getGunHeading()-getHeading());
			turnGunLeft(getGunHeading()-getHeading());
	}
		if(e==2){
			ahead(10);
		}
		if(e==1){
			ahead (20);
		} 
		if(e==0){
			ahead(75);
		}
		e=0;
	  }
	
    public void run() {
    	setColors(Color.RED, Color.RED, Color.YELLOW, Color.RED, Color.RED);
    	double cen= getBattleFieldHeight()/2;
    	double tro= getBattleFieldWidth()/2;
    	if(getY()>cen){
    		turnLeft(getHeading());
    		back(((getBattleFieldHeight()-getY())-cen)*-1);
    		if(getX()>tro){
    			turnLeft(90);
    			ahead(((getBattleFieldWidth()-getX())-tro) *-1);
    		}else{
    			turnRight(90);
    			back(((getBattleFieldWidth()-getX())-tro) *-1);
    		}
    	}else{
    		turnLeft(getHeading());
    		ahead(((getBattleFieldHeight()-getY())-cen));
    		if(getX()>tro){
    			turnLeft(90);
    			ahead(((getBattleFieldWidth()-getX())-tro)*-1);
    		}else{
    			turnRight(90);
        		ahead(((getBattleFieldWidth()-getX())-tro));
    		}
    	}
    	while (true) {
    		turnGunRight(359);
        }
    }

}