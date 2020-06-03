package sonc.quad;

import java.util.HashSet;

public class PointQuadtree<T extends HasPoint> extends java.lang.Object {
	private java.util.Set<T> objects = new HashSet<T>();
	private PointQuadtree[] nodes;
	private double topLeftX;
	private double topLeftY;
	private double bottomRightX;
	private double bottomRightY;
	
	public PointQuadtree(double topLeftX, double topLeftY, double bottomRightX, double bottomRightY) {
		nodes[0] = null;
		objects = null;
		this.topLeftX = topLeftX;
		this.topLeftY = topLeftY;
		this.bottomRightX = bottomRightX;
		this.bottomRightY = bottomRightY;
	}

	public void	delete(T point) {
		return;
	}
	
	public T find(T point) {
		return point;
	}
	public java.util.Set<T>	findNear(double x, double y, double radius){
		return objects;		
	}
	
	public java.util.Set<T>	getAll(){
		return objects;		
	}
	
	public void	insert(T point) {
		return;
	}
	
	public void	insertReplace(T point) {
		return;
	}

}
