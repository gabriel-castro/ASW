package sonc.battle;

import java.lang.String;

public class Ship extends MovingObject {

	private static int damage;
	private static double maxShipSpeedChange;
	private static double maxShipRotation = Math.PI/4;
	private World world;
	private ShipCommand command;
	private String name;
	private int points;
	private int lastFireRound = Integer.MIN_VALUE;
	private int impactDamage = 0;
	private Ship origin;
	private int size = 4;
	private String color = "blue";
	private static double heading;
	private static double speed;
	private static int maxStatus;
	private double x;
	private int lastRound = 0;
	
	public Ship() {
		super(1000, heading, speed);
		
	}
	
	static double getMaxShipRotation() {
		return maxShipRotation;
	}

	public void addPoints(int points) {
		this.points += points; 
	}
	
	protected void changeSpeed(double delta) {
		speed = speed + delta;
	}

	protected boolean canFire(Munition munition) {
		return false;
	}
	
	public void execute() {
		return;
	}

	public static void setMaxShipRotation(double d) {
		maxShipRotation = d;
	}

	public void setWorld(World world) {
		this.world=world;
	}

	public void setX(double margin) {
		x=margin;
	}

	public void setY(double margin) {
	}

	static void setDamage(int value) {
		damage=value;
	}

	static int getDamage() {
		return damage;
	}

	public int getImpactDamage() {
		this.impactDamage = damage;
		return this.impactDamage;
	}

	public Ship getOrigin() {
		return origin;
	}

	public final int getSize() {
		return size;
	}

	public String getColor() {
		return color;
	}

	protected World getWorld() {
		return world;
	}

	protected java.util.Set<Ship> getOtherShips() {
		java.util.Set<Ship> barcos = world.getShips();
		return barcos;
	}

	public void setHeading(double i) {
		heading = i;
	}

	public double getX() {
		return x;
	}

	public void fire(Bullet bullet) {
		
	}

	protected int getLastFireRound() {
		return lastFireRound;
	}

	public void setLastFireRound(int value) {
		lastFireRound=value;
	}
	
	protected final void rotate(double delta) {
		int currentRound = this.getWorld().getCurrentRound();
		if(currentRound == lastRound) {
			if(delta>maxShipRotation) {
				heading = maxShipRotation;
			}else {
				heading = delta;	
			}
		}
		lastRound = currentRound;
	}

	public int getPoints() {
		return points;
	}
	
	public double distanceTo(MovingObject other) {
		return super.distanceTo(other);
	}

	public String getName() {
		return name;
	}
	
	@Override
	protected void move() {
		double tempX =this.getX();
		double tempY =this.getY();
		double vel = this.getSpeed();
		double dir = this.getHeading();
		
		tempY += vel*Math.cos(dir);
		tempX += vel*Math.sin(dir);
		
		this.setX(tempX);
		this.setY(tempY);
		
		
		return;
	}

	public static void setMaxShipSpeedChange(double maxShipSpeedChange) {
		Ship.maxShipSpeedChange = maxShipSpeedChange;
	}
	
	static double getMaxShipSpeedChange() {
		return maxShipSpeedChange;
	}
	
	static int getMaxStatus() {
		
		return maxStatus;
	}
	
	static void setMaxStatus(int status) {
		maxStatus = status;
	}
	
	
	ShipCommand getCommand() {
		return command;		
	}
}
