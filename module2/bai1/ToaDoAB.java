package bai1;

public class ToaDoAB {
	double xA, yA;  // toa do A
    double xB, yB;  // toa do B
	public ToaDoAB() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ToaDoAB(double xA, double yA, double xB, double yB) {
		super();
		this.xA = xA;
		this.yA = yA;
		this.xB = xB;
		this.yB = yB;
	}
	public double getxA() {
		return xA;
	}
	public void setxA(double xA) {
		this.xA = xA;
	}
	public double getyA() {
		return yA;
	}
	public void setyA(double yA) {
		this.yA = yA;
	}
	public double getxB() {
		return xB;
	}
	public void setxB(double xB) {
		this.xB = xB;
	}
	public double getyB() {
		return yB;
	}
	public void setyB(double yB) {
		this.yB = yB;
	}
	public double dodaiAB() {
		return  Math.sqrt(Math.pow((xB - xA), 2) + Math.pow((yB - yA), 2));
	}
	@Override
	public String toString() {
		return " do dai AB=" + dodaiAB() ;
	}
    

}
