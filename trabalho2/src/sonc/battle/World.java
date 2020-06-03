package sonc.battle;

import java.util.HashSet;
import java.util.Random;

import sonc.shared.Movie;


public class World extends java.lang.Object{
	private static double collisionDistance=10;
	private static int rounds;
	private static double width;
	private static double height;
	private static double margin;

	private java.util.Set<Ship> ships = new HashSet<Ship>();
	private int currentRound;
	private java.util.Set<MovingObject> movingObjects = new HashSet<MovingObject>();
	
	public World() {
		
	}
	
	void addMovingObject(MovingObject added) {
		// TODO Auto-generated method stub
		movingObjects.add(added);
	}
	
	
	void addShipAtRandom(Ship ship) {
		Random r = new Random();
		double heading = 360 * r.nextDouble();
		double x = getHeight() * r.nextDouble();
		double y = getWidth() * r.nextDouble();
		ship.setX(x);
		ship.setY(y);
		ship.setHeading(heading);
		ships.add(ship);
		movingObjects.add(ship);
	}
	
	void addShipAt(Ship ship, double x, double y, double heading) {
		ship.setX(x);
		ship.setY(y);
		ship.setHeading(heading);
		ships.add(ship);
		movingObjects.add(ship);
	}
	
	
	public Movie battle(java.util.List<Ship> ships) {
		//--start a battle with ships
		return null;
	}
	
	public static double getCollisionDistance() {
		return collisionDistance;		
	}

	public int	getCurrentRound() {
		return currentRound;		
	}
	
	public static double	getHeight() {
		return height;		
	}
	
	public static double	getMargin() {
		return margin;		
	}
	
	java.util.Set<MovingObject> getMovingObjects(){
		return movingObjects;
	}
	
	public static int	getRounds() {
		return rounds;		
	}
	
	public java.util.Set<Ship> getShips(){
		return ships;		
	}
	
	public  static double	getWidth() {
		return width;		
	}
	
	static void	setCollisionDistance(double NewCollisionDistance) {
		collisionDistance = NewCollisionDistance;
	}
	
	void	setCurrentRound(int NewCurrentRound) {
		currentRound = NewCurrentRound;
	}
	
	static void	setHeight(double NewHeight) {
		height = NewHeight;
	}
	
	static void	setMargin(double NewMargin) {
		margin = NewMargin;
	}
	
	static void	setRounds(int NewRounds) {
		rounds = NewRounds;
	}
	
	static void	setWidth(double NewWidth) {
		width = NewWidth;
	}
	
	void	update() {
		return;
	}

}
