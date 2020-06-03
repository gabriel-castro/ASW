package sonc.quad;

public abstract class Trie<T extends HasPoint> extends java.lang.Object{
	static enum Quadrant{	NW, NE, SE, SW;	}	
	
	
	protected double	bottomRightX ;
	protected double	bottomRightY ;
	static int	capacity ;
	protected double	topLeftX;
	protected double	topLeftY ;
	
	protected Trie(double bottomRightX, double bottomRightY, double topLeftX, double topLeftY) {
		this.bottomRightX = bottomRightX;
		this.bottomRightY = bottomRightY;
		this.topLeftX = topLeftX;
		this.topLeftY = topLeftY;
	}

	public static int getCapacity() {
		return capacity;		
	}
	
	public static void setCapacity(int NewCapacity) {
		capacity = NewCapacity;
	}
	
	abstract T find(T point);

	abstract Trie<T> insert(T point);
	
	abstract Trie<T> insertReplace(T point);
	
	abstract void collectNear(double x, double y, double radius, java.util.Set<T> points);
	
	abstract void collectAll(java.util.Set<T> points);
	
	abstract void delete(T point);
	
	boolean overlaps(double x, double y, double radius) {
		return false;		
	}
	/*
	public java.lang.String toString(){
		return null;		
	}*/
	
	public static double getDistance(double x1, double y1, double x2, double y2) {
		return 0;		
	}

}
