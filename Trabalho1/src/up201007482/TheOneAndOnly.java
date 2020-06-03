package up201007482;

import robocode.ScannedRobotEvent;
import robocode.HitWallEvent;
import robocode.AdvancedRobot;
import robocode.HitRobotEvent;
import static robocode.util.Utils.normalRelativeAngleDegrees;
import java.awt.Color;


public class TheOneAndOnly extends AdvancedRobot {
	double gunTurnAmt;
	public void run() {		
		this.setBodyColor(new Color(150, 0, 0));
		this.setGunColor(new Color(75,0,0));
		while (true) {
			turnRadarRight(45);
			//setAhead(40000);
			//waitFor(new TurnCompleteCondition(this));
		}
	}

	public void onScannedRobot(ScannedRobotEvent e) {
			double distance = e.getDistance();
			double absoluteBearing = getHeading() + e.getBearing();
			double bearingFromGun = normalRelativeAngleDegrees(absoluteBearing - getGunHeading());
			setTurnGunRight(bearingFromGun);			
			absHeadingRight(getHeading(),e.getBearing());
			if (distance < 100) {
				fire(3);
				return;
			}else if (distance < 200) {
				fire(2);
				return;
			}
			setTurnRight(e.getBearing());
			setAhead(100);
			scan();
			return;
	}

	public void onHitWall(HitWallEvent e){
		turnRight(90);
	}
	public void onHitRobot(HitRobotEvent e){
		turnRight(90);
	}
	public void absHeadingRight(Double a, Double b) {
		double x = a + b;
		if (x > 180) {
			setTurnLeft(360-x);
		}else {
			setTurnRight(x);
		}
	}
	
}
