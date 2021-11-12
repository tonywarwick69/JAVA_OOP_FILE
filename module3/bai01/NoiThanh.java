package bai01;

public class NoiThanh extends ChuyenXe {
	private int sotuyen;
	private double soKM;
	public static String getTieuDe() {
		return String.format("%5s %-25s %10s %10s %10s %10s","Mã số chuyến","Họ tên tài xế","Số xe","Doanh thu","Số tuyến","Số Kilomet đã đi\n");
	}
	
	@Override
	public String toString() {
		return String.format("%5s %-25s %10s %10f %10d %10lf",masochuyen,tentaixe,soxe,doanhthu, sotuyen, soKM);
	}
	public NoiThanh() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NoiThanh(String masochuyen, String tentaixe, double doanhthu, String soxe) {
		super(masochuyen, tentaixe, doanhthu, soxe);
		// TODO Auto-generated constructor stub
	}
	public NoiThanh(String masochuyen, String tentaixe, double doanhthu, String soxe,int sotuyen, double soKM) {
		super();
		this.masochuyen = masochuyen;
		this.tentaixe = tentaixe;
		this.doanhthu = doanhthu;
		this.soxe = soxe;
		this.sotuyen = sotuyen;
		this.soKM = soKM;
	}
	public int getSotuyen() {
		return sotuyen;
	}
	public void setSotuyen(int sotuyen) {
		this.sotuyen = sotuyen;
	}
	public double getSoKM() {
		return soKM;
	}
	public void setSoKM(double soKM) {
		this.soKM = soKM;
	}
	

}
