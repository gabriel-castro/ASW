package sonc.shared;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.user.client.rpc.IsSerializable;

public class Movie extends java.lang.Object implements IsSerializable {
	public static class Frame extends java.lang.Object  implements IsSerializable {
		private List<Oblong> oblongs;
		public List<Score> scores;

		public Frame(){
			scores = new ArrayList<Score>();
			oblongs = new ArrayList<Oblong>();
		}
		
		public java.util.List<Movie.Oblong>	getOblongs(){
			return oblongs;
		}
		
		public java.util.List<Movie.Score>	getScores(){
			return scores;
		}
	}
	
	public static class Oblong extends java.lang.Object  implements IsSerializable{
		java.lang.String	color ;
		float	heading ;
		int	size ;
		int	x ;
		int	y ;
		
		public Oblong() {}
		public Oblong(int x, int y, float heading, int size, java.lang.String color) {
			this.x = x;
			this.y=y;
			this.heading=heading;
			this.size=size;
			this.color=color;
		}
		
		public java.lang.String getColor(){
			return color;			
		}
		
		public float getHeading() {
			return heading;			
		}
		
		public int	getSize() {
			return size;			
		}
		
		public int	getX() {
			return x;			
		}
		
		public int	getY() {
			return y;			
		}
	}
	
	public static class Score extends java.lang.Object{
		private String name;
		private int points;
		private int status;
		
		public Score() {}
		public Score(String name, int points, int status) {
			//super();
			this.name = name;
			this.points = points;
			this.status = status;
		}

		public java.lang.String	getName(){
			return name;			
		}
		
		public int	getPoints() {
			return points;			
		}
		
		public int	getStatus() {
			return status;			
		}
	}

	private List<Frame> frames;
	Frame frame;
	
	public Movie(){
		frames = new ArrayList<Frame>();
		frame = new Frame();
	}
	
	public void	addOblong(int x, int y, float heading, int size, java.lang.String color){
		try{
			Oblong obl = new Oblong(x, y, heading, size, color);
			frame.oblongs.add(obl);
			frames.add(0,frame);
		}catch(java.lang.IllegalStateException e) {
			System.out.println(e);
		}
	}
	
	public void	addScore(java.lang.String name, int points, int status) {
		try{	
			Score newScore = new Score(name, points, status);
			frame.scores.add(newScore);
			frames.add(0,frame);
		}catch(java.lang.IllegalStateException e) {
			System.out.println(e);
		}
	}
	
	public java.util.List<Movie.Frame>	getFrames(){
		return frames;		
	}
	
	public void	newFrame() {
		frame = new Frame();
		frames.add(0,frame);
	}
}
