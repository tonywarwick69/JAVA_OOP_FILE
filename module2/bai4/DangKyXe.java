package bai4;



public class DangKyXe {
	private String chuxe;
	private String loaixe;
	private int xylanh;
	private double trigia;
	
	public DangKyXe() {
		super();
		// TODO Auto-generated constructor stub
		
	}
	public DangKyXe(String chuxe, String loaixe, int xylanh, double trigia) {
		
		this.chuxe = chuxe;
		this.loaixe = loaixe;
		this.xylanh = xylanh;
		this.trigia = trigia;
	}
	public String getChuxe() {
		return chuxe;
	}
	public void setChuxe(String chuxe) throws Exception {
		if(chuxe!=null)
			this.chuxe = chuxe;
		else
			throw new Exception("Khong duoc de trong ten chu xe");
	}
	public String getLoaixe() {
		return loaixe;
	}
	public void setLoaixe(String loaixe) throws Exception {
		if(loaixe!=null)
			this.loaixe = loaixe;
		else
			throw new Exception("Khong duoc de trong loai xe");
	}
	public int getXylanh() {
		return xylanh;
	}
	public void setXylanh(int xylanh)throws Exception {
		if(xylanh>0) {
			this.xylanh = xylanh;
		} else {
			throw new Exception("Dung tich xe phai lon hon 0");
		}
		
	}
	public double getTrigia() {
		return trigia;
	}
	public void setTrigia(double trigia)throws Exception {
		if(trigia>0)
			this.trigia = trigia;
		else 
			throw new Exception("Tri gia cua xe phai lon hon 0");
	}
	public double thueNop() {
		if(xylanh<100)
			return trigia*0.01; 
		else if(xylanh>=100 && xylanh<=200)
			return trigia*0.03;
		else
			return trigia*0.05;
	}
	@Override
	public String toString() {
		return String.format("%-20s %-20s %s %18s %20s", chuxe,loaixe,xylanh,trigia,thueNop());
	}
	

}
