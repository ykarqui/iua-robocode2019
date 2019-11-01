package ipdf;

import robocode.*;




public class lubot extends Robot {
	@Override
	 public void onScannedRobot(robocode.ScannedRobotEvent event) {
			fire(3);
		}
	
	@Override
	public void run() {
		turnLeft(getHeading());
		ahead(getBattleFieldHeight()-getY());
		turnLeft(90);
		ahead(getX());
		turnLeft(90);
		ahead(getBattleFieldHeight()/2);
		turnLeft(90);
		ahead(getBattleFieldWidth()/2);
	    turnLeft(90);

  while(true) {
	
	turnLeft(Math.random()*5);
	
	ahead(getBattleFieldHeight()-getY());
	
	ahead(getX());
	turnLeft(90);
	ahead(getBattleFieldHeight()/2);
	turnLeft(90);
	ahead(getBattleFieldWidth());
    turnRight(90);
    ahead(getX());
    turnLeft(110);
  }
  }
  public void onHitRobot(HitRobotEvent e) {
		if (e.getBearing() > -10 && e.getBearing() < 10) {
			back(50);
			turnGunLeft(230);
			fire(8);
			ahead(30);
			
		}
		
		else {
		fire(2.5);
		
		
		}
		 
	
	}
	
  }


			
			
	



