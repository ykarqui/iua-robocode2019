package ipdf;

import robocode.*;
import java.awt.Color;

public class robotron extends Robot {
	
	@Override
    public void onScannedRobot(ScannedRobotEvent event) {
    	double L1=getBattleFieldHeight()*getBattleFieldHeight();
    	double L2=getBattleFieldWidth()*getBattleFieldWidth();
    	double h=Math.sqrt(L1+L2);
    	double potencia=event.getDistance()*0.1/h;
    	fire(potencia);
    }
	@Override
    public void run() {
		
		setBodyColor(Color.red);
		setBodyColor(Color.black);
		setBodyColor(Color.red);
		setBodyColor(Color.red);
		setBodyColor(Color.red);
		
    	while(true) {
    		
	    	turnRight(90);
	    	ahead(200);
	    	turnGunRight(120);
	    	turnLeft(90);
	   		turnGunRight(120);
	   		ahead(200);
	   		turnGunRight(120);
	   		turnLeft(90);
    		ahead(150);
	    	ahead(60);
	    	turnRight(30);
	   		ahead(60);
	   		turnRight(30);
	   		ahead(60);
	   		turnRight(30);
    		ahead(60);
	    	}
    	}
    
	@Override
	public void onHitByBullet(HitByBulletEvent event) {
		turnLeft(90 - getBearing());
	}
	
	public void onHitRobot1(HitRobotEvent e) {
		if (e.getBearing() > -10 && e.getBearing() < 10) {
			fire(3);
		}
		if (e.isMyFault()) {
			turnRight(10);
		}


	}	
	public void onScannedRobot1(ScannedRobotEvent event) {
		boolean stopWhenSeeRobot = false;
		if ( stopWhenSeeRobot )  
            Parada ();
            Object e = null;
			smartFire ( e );
            Escanear ();
            Reanudar ();
        }

	private void Reanudar() {
		// TODO Auto-generated method stub
		
	}
	private void Escanear() {
		// TODO Auto-generated method stub
		
	}
	private void Parada() {
		// TODO Auto-generated method stub
		
	}
	private void smartFire(Object e) {
		// TODO Auto-generated method stub
		
	}
	public void onHitByBullet1(HitByBulletEvent event) {
		turnLeft(90 - getBearing());
	}
	
	@Override
	public void onHitWall(HitWallEvent event) {
		turnLeft(250);
		ahead(150);
		back(100);
	}
	@Override
	public void onHitRobot(HitRobotEvent event) {
		if (getBearing() >-90 && getBearing() <90)
			  fire(2);
			if (getEnergy() < 15) {
				turnGunRight(360);
				fire (3);		
	}
}
	private int getBearing() {
		return 0;
	}

}



