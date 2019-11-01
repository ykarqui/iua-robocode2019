package sab;

import robocode.HitRobotEvent;
import robocode.Robot;
import robocode.ScannedRobotEvent;
import java.awt.Color;
public class Yogurt extends Robot {

	@Override
	public void onScannedRobot(ScannedRobotEvent event) {
		
		double d =event.getDistance();
		double l1=getBattleFieldWidth()*getBattleFieldHeight();
		double l2= Math.pow(getBattleFieldHeight(),getBattleFieldWidth());
		double h=Math.sqrt(l1+l2);
		double potencia =d*3/h;
		if( d<=h*0.3 ){
		fire(3.1-potencia);
	}
	}
	
	@Override
	public void run() {
		setBodyColor(Color.PINK);
		setGunColor(Color.MAGENTA); 
		setRadarColor(Color.WHITE);
		setBulletColor(Color.BLACK);
		
		turnLeft(getHeading());
		ahead(getBattleFieldHeight()-getY()-20);
		back(getY()/2);
		turnLeft(90);
		ahead(getX());
		back(getBattleFieldWidth()/2);
		turnRight(180);
	
		while(true) {
			
			
			//turn = girar left= izquierda
			turnRight(180);
			turnLeft(180);
			// ahead para adelante 
			ahead(200);
			// turn = girar gun =arma lefft = izquierda 
			turnGunLeft(180);
			turnGunLeft(180);
			// atraS
			back(100);
			// turn=girar gun = arma right =derecha
			turnGunRight(180);
			turnGunRight(180);
			back(100);
			
	}
}

	public void onHitRobot   (HitRobotEvent e)
	{
	 
		fire(3.1);
		back(100);
		turnRight(90);
		 ahead(getBattleFieldHeight()-getY()-20);

	
	}
}

