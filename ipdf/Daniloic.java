package ipdf;

import robocode.Robot;

import robocode.ScannedRobotEvent;



public class Daniloic extends Robot {
 
		
		 @Override
		  public void onScannedRobot(ScannedRobotEvent event) {
		  fire(3);
		  }
		@Override
		public void run() {
		turnLeft(getHeading());
		ahead(getBattleFieldHeight()-getY());
		turnRight(90);
		ahead(getBattleFieldHeight()/2);
		turnRight(90);
		ahead(getBattleFieldHeight()/2);
		turnRight(90);
		ahead(getBattleFieldHeight()/2);
		turnRight(90);
		 while(true) {
		 ahead(300);
		 turnRight(200);
		 turnLeft(100);
		 ahead(30);
		 turnRight(90);
		 turnLeft(90);
		}
		}
	}


