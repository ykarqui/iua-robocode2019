package ipdf;

import robocode.Robot;
import robocode.ScannedRobotEvent;

public class yoquese1 extends Robot {
	@Override
	public void onScannedRobot(ScannedRobotEvent event) {
		double l1 = getBattleFieldHeight();
		double l2 = getBattleFieldWidth();
		double h = Math.sqrt(l1 + l2);
		double potencia = event.getDistance() * 0.1 / h;
		fire(potencia);
	}

	@Override
	public void run() {
		turnLeft(getHeading());
		ahead(getBattleFieldHeight() - getY());
		turnRight(90);
		ahead(getBattleFieldHeight() / 2);
		turnRight(90);
		ahead(getBattleFieldHeight() / 2);
		turnRight(90);
		ahead(getBattleFieldHeight() / 2);
		turnRight(90);
		while (true) {
			ahead(250);
			turnRight(150);
			turnLeft(150);
			ahead(50);
			turnRight(90);
			turnLeft(90);
		}
	}
}
