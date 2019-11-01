package salsi;
import robocode.*;
import java.awt.Color;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * Tomi2856 - a robot by (your name here)
 */
public class Tomi2856 extends Robot
{
	/**
	 * run: Tomi2856's default behaviordf
	 */
	public void run() {

    setColors(Color.blue,Color.white,Color.blue);

      turnLeft(getHeading());
	  ahead(getBattleFieldHeight()-getY());
  

		while(true) {
		double azar=Math.random()*200+100;



			ahead(azar);
			turnGunRight(azar);
			back(azar);
			turnGunRight(360);
            turnLeft(azar);
			turnRight(azar);


		}
	
	}


	public void onScannedRobot(ScannedRobotEvent e) {
	 //el tanque dispara mas cuando esta mas cerca y dispara menos cuando esta mas cerca
         if(e.getDistance()<50)  {

          fire(1);
		  fire(1);
		  fire(1);
		  }else{	
           fire(1);
	if(e.getDistance()<25)  {

         fire(10);


    if(e.getDistance()<10)
	
       fire(3);

         }


     }

 }


	public void onHitByBullet(HitByBulletEvent e) {
	//cuando el recibe daño genera un numero al azar para escapar
		int skape=(int)Math.random()*180+10;
		turnLeft(skape);


         back(50);
        
	}
	
	
	public void onHitWall(HitWallEvent e) {
	
        int skapez=(int)Math.random()*180+10;
		turnLeft(skapez);

        double grados=Math.random()*(180-10)+10;
		turnRight(grados);


        back(50);
	}	
}
