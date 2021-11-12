package bai01;

public class ChuyenXe {
	protected String masochuyen;
	protected String tentaixe;
	protected double doanhthu;
	protected String soxe;
	public static String getTieuDe() {
		return String.format("%5s %-25s %10s %10.2f","Mã số chuyến","Họ tên tài xế","Số xe","Doanh thu\n" );
	}
	@Override
	public String toString() {
		return String.format("%5s %-25s %10s %10.2f",masochuyen,tentaixe,soxe,doanhthu );
	}
	public ChuyenXe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMasochuyen() {
		return masochuyen;
	}
	public void setMasochuyen(String masochuyen) {
		this.masochuyen = masochuyen;
	}
	public String getTentaixe() {
		return tentaixe;
	}
	public void setTentaixe(String tentaixe) {
		this.tentaixe = tentaixe;
	}
	public double getDoanhthu() {
		return doanhthu;
	}
	public void setDoanhthu(double doanhthu) {
		this.doanhthu = doanhthu;
	}
	public String getSoxe() {
		return soxe;
	}
	public void setSoxe(String soxe) {
		this.soxe = soxe;
	}
	public ChuyenXe(String masochuyen, String tentaixe, double doanhthu, String soxe) {
		super();
		this.masochuyen = masochuyen;
		this.tentaixe = tentaixe;
		this.doanhthu = doanhthu;
		this.soxe = soxe;
	}
	
}
