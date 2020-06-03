package up201007482;

import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;
import robocode.HitRobotEvent;
import java.awt.Color;

import static robocode.util.Utils.normalRelativeAngleDegrees;

public class SuperSafeBot extends AdvancedRobot {
	double moveAmount;
	
	public void run() {
		setBodyColor(Color.black);
		setGunColor(Color.white);
		setRadarColor(Color.darkGray);
		setBulletColor(Color.green);
		setScanColor(Color.green);
		moveAmount = Math.max(getBattleFieldWidth(), getBattleFieldHeight());
		setTurnRadarRight(360);
		turnLeft(getHeading() % 90);
		ahead(moveAmount);
		turnRight(90);		
		
		while (true) {
			setTurnRadarRight(360);
			ahead(moveAmount);
			turnRight(90);
		}		
	}
	
	public void onHitRobot(HitRobotEvent e) {
		double absoluteBearing = getHeading() + e.getBearing();
		double bearingFromGun = normalRelativeAngleDegrees(absoluteBearing - getGunHeading());
		setTurnGunRight(bearingFromGun);
		fire(3);
		if (bearingFromGun == 0) {
			scan();
		}
		return;
	}

	public void onScannedRobot(ScannedRobotEvent e) {
		if(getVelocity()!=0) {			
			double absoluteBearing = getHeading() + e.getBearing();
			double bearingFromGun = normalRelativeAngleDegrees(absoluteBearing - getGunHeading());
			turnGunRight(bearingFromGun);
			if(e.getDistance()<500) {
				fire(3);
			}
			if (bearingFromGun == 0) {
				scan();
			}
			return;
		}
		return;
	}
}



