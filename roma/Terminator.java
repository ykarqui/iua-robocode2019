package roma;

import robocode.AdvancedRobot;
import robocode.HitRobotEvent;
import robocode.ScannedRobotEvent;
import robocode.BulletMissedEvent;
import robocode.HitByBulletEvent;
import java.awt.*;

public class Terminator extends AdvancedRobot {
   	int impactos = 0;
	int	contador = 0;

	public void run() {
		setBodyColor(Color.black);
		setGunColor(Color.black);
		setRadarColor(Color.black);
		setBulletColor(Color.red);
		setScanColor(Color.black);

		while (true) {
			setTurnRight(10000);
			setMaxVelocity(5);
			ahead(10000);
		}
	}
	
	public void onHitByBullet(HitByBulletEvent event){
		impactos = 0 + 1;
		if(getX() > 750 || getX() < 50 || getY() > 550 || getY() < 50){
			if(impactos >= 5){
				turnRight(270);
				ahead(300);
				impactos = 0;
			}else{
			turnRight(270);
			ahead(200);
			}
		}
	}
	
	public void onBulletMissed(BulletMissedEvent event){
     	contador = contador + 1;
		if(contador >= 3){
		switch(getOthers()){
		case 1: 
		turnRight(90);
		ahead(150);
		break;
		case 2: 
		turnRight(90);
		ahead(150);
		break;
		case 3: 
		turnRight(90);
		ahead(50);
		break;		
		case 4: 
		turnRight(90);
		ahead(50);
		break;
		case 5: 
		turnRight(90);
		ahead(50);
		break;
		case 6: 
		turnRight(90);
		ahead(50);
		break;
		case 7: 
		turnRight(90);
		ahead(50);
		break;
		case 8: 
		turnRight(90);
		ahead(50);
		break;
		case 9: 
		turnRight(90);
		ahead(50);
		break;
		case 10: 
		turnRight(90);
		ahead(50);
		break;
		case 11: 
		turnRight(90);
		ahead(50);
		break;
		case 12: 
		turnRight(90);
		ahead(50);
		break;
		case 13: 
		turnRight(90);
		ahead(30);
		break;
		case 14: 
		turnRight(90);
		ahead(30);
		break;
		case 15: 
		turnRight(90);
		ahead(30);
		break;
		case 16: 
		turnRight(90);
		ahead(30);
		break;
		case 17: 
		turnRight(90);
		ahead(30);
		break;
		case 18: 
		turnRight(90);
		ahead(30);
		break;
		case 19: 
		turnRight(90);
		ahead(30);
		break;
		case 20: 
		turnRight(90);
		ahead(30);
		break;
		default:
		turnRight(90);
		ahead(30);
		break;
		}
		contador = 0;
      }
	}
		
	public void onScannedRobot(ScannedRobotEvent e) { 
			fire(3);
	}
	
	public void onHitRobot(HitRobotEvent e) {
		if (e.getBearing() > -10 && e.getBearing() < 10) {
			fire(3);
		}
		if (e.isMyFault()) {
			turnRight(10);
		}else{
			back(50);
		}
	}
}
