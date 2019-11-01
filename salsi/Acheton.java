
package salsi;
import robocode.*;
import java.awt.Color;





public class Acheton extends Robot
{


	public void run() {
	   //Cambiar el color del robot...
	   setColors(Color.black,Color.gray,Color.cyan);
	   //turnLeft(getHeading());
	   //ahead(getBattleFieldHeight()-getY());
	   //turnLeft(90);  
	   //ahead(getX()-getBattleFieldWidth()/2);
	   //turnLeft(90);
	   //ahead(250);
	   
	while(true) {					
	        //la base del robot...
			double azar=Math.random()*200+100;		
			turnGunRight(1);
			ahead(azar);
			back(azar);
		    turnRight(500);
		

		
			
		}
	}


	public void onScannedRobot(ScannedRobotEvent e) {
          //cuando un objetivo esta cerca del robot ataka con mas intensidad...
	      if(e.getDistance()<50&&getEnergy()>50)
			  fire(3);
			  else{
				  fire(1);
				  
			  }
		  }
	      
	
	public void onHitByBullet(HitByBulletEvent e) {
		//cuando le pega una bala hace...
    	int skape=(int)Math.random()*180+10;
		turnLeft(skape);
		
	}
	


	public void onHitWall(HitWallEvent e) {
		        //cuando choca con una pared...
		    	int skape2=(int)Math.random()*180+10;
					turnLeft(skape2);
	
    	
	}	
}
