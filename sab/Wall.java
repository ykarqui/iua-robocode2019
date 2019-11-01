package sab;

import java.awt.Color;

import robocode.HitByBulletEvent;
import robocode.Robot;
import robocode.ScannedRobotEvent;

public class Wall extends Robot {
	int seguirobot=1;
	@Override

	public void onScannedRobot(ScannedRobotEvent event)
	{
		
		
			//DIsparo
			if (event.getBearing()>=0 & event.getDistance()<100){
				seguirobot=1;
				//(getHeading()-getGunHeading()+event.getBearing());
			}
			else{
				
				seguirobot=-1;		
			}
			fire(3);
			turnRight(event.getBearing());
			ahead(40);
			
			
			 
	}
	
	
   public void onHitBullet(HitByBulletEvent event) {
	back(40);
	turnLeft(30);//no funca
}
   

		//CUERPO
		public void run(){
			setBodyColor(Color.orange);
		    setGunColor(Color.gray);
		    setRadarColor(Color.black);
			setScanColor(Color.yellow);
			setBulletColor(Color.black);
		
			while(true){
		    back(getHeading());
			back(getY());
			turnRight(70);
			back(40);
			turnGunLeft(360);
			turnLeft(30);
			ahead(30);
			turnRight(60);
			
			
			}
}
}

