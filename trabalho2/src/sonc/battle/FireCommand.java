package sonc.battle;

class FireCommand 
extends java.lang.Object
implements ShipCommand{
	World world;
	Ship ship;
	Munition munition;
	
	public FireCommand(World world, Ship ship, Munition munition) {
		// TODO Auto-generated constructor stub
		this.world = world;
		this.ship = ship;
		this.munition = munition;
	}

	public void execute() {
		// TODO Auto-generated method stub
		return;
		
	}

}
