package bai3;

public class TamGiac {
	private double a;
	private double b;
	private double c;

	@Override
	public String toString() {
		return "TamGiac [a=" + a + ", b=" + b + ", c=" + c + ", p()=" + p() + ", dientich()=" + dientich() + "]";
	}
	public TamGiac() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TamGiac(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	public  double p() {
		return ((a+b+c)/2);
	}

	public  double dientich() {
		return Math.sqrt(p()*(p()-a)*(p()-b)*(p()-c));
	}

}
