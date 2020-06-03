package sonc.battle;

public class GuidedMissile extends Munition{
	private static double maxMissileRotation = Math.PI/64;
	private static double initialSpeed = 5;
	private static int damage = 600;
	private static int fireDelay;
	double heading;
	MovingObject target;
	private double maxSpeed;
	private double maxRotation;
	private int impactDamage;
	private int size;
	private String color;
	
	GuidedMissile(double heading, MovingObject target) {
		// TODO Auto-generated constructor stub
		super(600, heading, 5);
		this.heading = heading;
		this.target = target;
		//GuidedMissile.damage=600;
	}
	

	static void setMaxMissileRotation(double maxRotation) {
		// TODO Auto-generated method stub
		maxMissileRotation=maxRotation;
	}
	
	static double getMaxMissileRotation() {
		return  Math.PI/64;
	}


	public static void setDamage(int NewDamage) {
		damage = NewDamage;
	}

	public static void setInitialSpeed(int NewSpeed) {
		initialSpeed = NewSpeed;
	}
	
	public static double getInitialSpeed() {
		return initialSpeed;		
	}

	public static int getDamage() {
		// TODO Auto-generated method stub
		return damage;
	}
	
	static int getFireDelay() {
		return fireDelay;
	}
	
	static void setFireDelay(int NewFireDelay) {
		fireDelay = NewFireDelay;
	}
	
	double getMaxSpeed() {
		return maxSpeed;
	}
	
	double getMaxRotation() {
		return  Math.PI/64;
	}
	
	int getImpactDamage() {
		return damage;
	}
	int fireDelay() {
		return 0;		
	}
	public int getSize() {
		return size;
	}
	public java.lang.String getColor(){
		return color;
	}

	void move() {
		// TODO Auto-generated method stub
		
	}




}
