package ipdf;

import java.awt.Color;

import robocode.*;


public class caro extends Robot {
	
public void run() {
		

		setBodyColor(Color.yellow);
		setGunColor(Color.yellow);
		setRadarColor(Color.white);
		setBulletColor(Color.gray);
		setScanColor(Color.gray);

		
			
                  while(true) {
                	  ahead(500);
          			turnLeft(90);
          			turnGunLeft(15);
          			ahead(500);
          			turnLeft(90);
          			turnGunLeft(15);
          			ahead(500);
          			turnLeft(90);
          			turnGunLeft(15);
          			ahead(500);
          			turnLeft(90);
          			turnGunRight(360);
          			turnGunLeft(360);
          			
          					}
          	}

          	public void onScannedRobot(ScannedRobotEvent e) {
          		
          		fire(5);
          		if (e.getEnergy() <20) {
          			fire(10);	
          		}
          	}
          }


