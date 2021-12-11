package kethua;

public class TamGiac extends HinhHoc {
	private int a,b,c;

	@Override
	public String toString() {
		return  super.toString()+"a=" + a + ", b=" + b + ", c=" + c  + "]";
	}

	/**
	 * 
	 */
	public TamGiac() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param tenhinh
	 */
	public TamGiac(String tenhinh) {
		super(tenhinh);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param tenhinh
	 * @param a
	 * @param b
	 * @param c
	 */
	public TamGiac(String tenhinh, int a, int b, int c) {
		super(tenhinh);
		this.a = a;
		this.b = b;
		this.c = c;
	}

	/**
	 * @return the a
	 */
	public int getA() {
		return a;
	}

	/**
	 * @param a the a to set
	 */
	public void setA(int a) {
		this.a = a;
	}

	/**
	 * @return the b
	 */
	public int getB() {
		return b;
	}

	/**
	 * @param b the b to set
	 */
	public void setB(int b) {
		this.b = b;
	}

	/**
	 * @return the c
	 */
	public int getC() {
		return c;
	}

	/**
	 * @param c the c to set
	 */
	public void setC(int c) {
		this.c = c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TamGiac tg1 =new TamGiac("Tam giác cân",5,7,7);
		System.out.print(tg1);
	}

}
