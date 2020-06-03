package sonc.battle;

class ChangeSpeedCommand extends java.lang.Object implements ShipCommand{
	Ship ship;
	double delta;
	
	ChangeSpeedCommand(Ship ship, double delta){
		this.ship = ship;
		this.delta = delta;
	}
	
	public void execute() {
		return;
	}
}
