package roma;

import robocode.Robot;
import robocode.ScannedRobotEvent;

public class Traketero extends Robot {
	@Override
	public void onScannedRobot(ScannedRobotEvent event) {
		
		fire(1);
	}

	
@Override
public void run() {
	turnLeft (60)   ;
	turnLeft(90);
	ahead( (50) - getY() );
	back( (30)/2) ;
	turnRight(180);
	ahead (getBattleFieldWidth() - getX() );
	back(getBattleFieldWidth()/2);
	turnLeft(90);
	fire(1);
	while (true) {
		ahead(100);
		turnRight(90);
		fire(1);
		
	
}

}
}