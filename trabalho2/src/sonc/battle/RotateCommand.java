package sonc.battle;

public class RotateCommand 
extends java.lang.Object
implements ShipCommand{

	private Ship ship;
	private double maxRotation;

	RotateCommand(Ship ship, double maxRotation) {
		// TODO Auto-generated constructor stub
		this.ship =ship;
		this.maxRotation = maxRotation;
	}

	public void execute() {
		// TODO Auto-generated method stub
		return;
		
	}

}
