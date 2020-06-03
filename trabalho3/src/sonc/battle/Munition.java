package sonc.battle;

public abstract class Munition extends MovingObject{
	
	private double maxRotation;
	private double maxSpeedChange;
	private Ship origin;
	
	public Munition(int status, double heading, double speed) {
		super(status, heading, speed);
	}
	
	void escape() {
		return;
	}
	
	abstract int fireDelay();
	
	double getMaxRotation() {		
		return maxRotation;
	}

	double getMaxSpeedChange() {
		return maxSpeedChange;
	}
	
	Ship getOrigin() {
		return origin;
	}
	
	void setOrigin(Ship origin) {
		this.origin = origin;
	}


}
