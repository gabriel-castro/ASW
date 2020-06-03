package up201007482;

import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;
import robocode.HitRobotEvent;
import java.awt.Color;

public class SafeBot extends AdvancedRobot { 
	boolean peek; // Don't turn if there's a robot there
	double moveAmount; // How much to move
	int safe;
	
	public void run() {
		// Set colors
		setBodyColor(Color.red);
		setGunColor(Color.black);
		setRadarColor(Color.darkGray);
		setBulletColor(Color.green);
		setScanColor(Color.green);
		moveAmount = Math.max(getBattleFieldWidth(), getBattleFieldHeight());
		
		peek = false;

		turnLeft(getHeading() % 90);
		ahead(moveAmount);
		// Turn the gun to turn right 90 degrees.
		peek = true;
		turnGunRight(90);
		turnRight(90);
		
		safe = 0;		
		
		while (true) {
			
			if(getOthers()>=safe){		
				// Look before we turn when ahead() completes.
				peek = true;
				// Move up the wall
				ahead(moveAmount);
				// Don't look now
				peek = false;
				// Turn to the next wall
				turnRight(90);
			}
			else{
				
			}
		}
		
		
		
		
	}
	
	public void onHitRobot(HitRobotEvent e) {
		if(getOthers()>=safe){
			// If he's in front of us, set back up a bit.
			if (e.getBearing() > -90 && e.getBearing() < 90) {
				back(100);
			} // else he's in back of us, so set ahead a bit.
			else {
				ahead(100);
			}
		}
		else{
			
		}
	}

	/**
	 * onScannedRobot:  Fire!
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		if(getOthers()>=safe){
			double distance = e.getDistance();
			if (distance < 100) {
				fire(3);
			}else if (distance < 250) {
				fire(3);
			}
			else if(distance < 500)
				fire(3);
			
			if (peek) {
				scan();
			}
		}
		else{
			
		}
	}	

}
