package bai1;

public class MyPoint {
	private int x;
	private int y;
	public MyPoint() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyPoint(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int[] getXY() {
		int [] xy=new int[2];
		return xy;
	}
	public void setXY(int x,int y) {
		this.x=x;
		this.y=y;
	}
	// Overloading method distance()
	// This version takes two ints as arguments

	public double distance(int x, int y) {
		int xDiff = this.x-x;
		int yDiff = this.y-y;
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);

	}
	// This version takes a MyPoint instance as argument
	public double distance(MyPoint another) {
		int xDiff = this.x-another.x;
		int yDiff=this.y-another.y;
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff); 
	}
	public double distance() {
		return 0;
	}
	

	
}
