package ipdf;

import robocode.*;
import robocode.ScannedRobotEvent;

public class Carlabot extends Robot {
	boolean movingForward;

	@Override
    public void onScannedRobot(ScannedRobotEvent event) {
    	double L1=getBattleFieldHeight()*getBattleFieldHeight();
    	double L2=getBattleFieldWidth()*getBattleFieldWidth();
    	double h=Math.sqrt(L1+L2);
    	double potencia=event.getDistance()*0.1/h;
    	fire(potencia);
    	fire(potencia);
    }
	@Override
    public void run() {
		while (true) {
			getBattleFieldWidth();
			getBattleFieldHeight();		 
			while (true) {
				ahead(150);
				turnGunLeft(360);
				back(50);
				turnGunRight(360);
			}
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
	


