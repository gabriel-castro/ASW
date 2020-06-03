package sonc.quad;

class NodeTrie<T extends HasPoint> extends Trie<T> {
	java.util.Map<Trie.Quadrant,Trie<T>>	tries ;
	
	NodeTrie(double topLeftX, double topLeftY, double bottomRightX, double bottomRightY) {
		super(topLeftX,topLeftY,bottomRightX,bottomRightY);
	}
	
	void	collectAll(java.util.Set<T> points) {
		
	}
	
	void	collectNear(double x, double y, double radius, java.util.Set<T> nodes) {
		
	}
	
	void	delete(T point) {
		
	}
	
	 T	find(T point) {
		return null;		 
	 }
	 
	 Trie<T>	insert(T point){
		point.getX();
		point.getY();
		return null;		 
	 }
	 
	 Trie<T>	insertReplace(T point){
		return null;		 
	 }
	 
	 Trie.Quadrant	quadrantOf(T point) {
		return null;		 
	 }
	 
	 public java.lang.String	toString() {
		return null;		 
	 }

}
