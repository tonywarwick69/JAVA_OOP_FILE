package bai7;

public class HinhTron extends ToaDo {
	private ToaDo tam;
	private double bankinh;
	
	public HinhTron() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HinhTron(String ten, float x, float y) {
		super(ten, x, y);
		// TODO Auto-generated constructor stub
	}
	public HinhTron(ToaDo tam, double bankinh) {
		super();
		this.tam = tam;
		this.bankinh = bankinh;
	}
	public ToaDo getTam() {
		return tam;
	}
	public void setTam(ToaDo tam) {
		this.tam = tam;
	}
	public double getBankinh() {
		return bankinh;
	}
	public void setBankinh(double bankinh) {
		this.bankinh = bankinh;
	}
	public double tinhChuVi() {
		return 2*bankinh*Math.PI;
	}
	
	public double tinhDienTich() {
		return Math.PI * Math.pow(bankinh,2);
	}
	@Override
	public String toString() {
		return "HinhTron [tam=" + tam + ", bankinh=" + bankinh + ", Chu vi=" + tinhChuVi() + ", Diện tích="
				+ tinhDienTich() + "]";
	}
}
