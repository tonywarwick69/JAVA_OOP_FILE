package bai08;

import java.time.LocalDate;

public class HangThucPham extends HangHoa {
	protected String nhacungcap;
	protected LocalDate ngaysanxuat;
	protected LocalDate ngayhethan;
	public HangThucPham() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "HangThucPham [nhacungcap=" + nhacungcap + ", ngaysanxuat=" + ngaysanxuat + ", ngayhethan=" + ngayhethan
				+ ", mahang=" + mahang + ", tenhang=" + tenhang + ", dongia=" + dongia + ", soluong=" + soluong + "]";
	}
	public HangThucPham(int mahang, String tenhang, double dongia, int soluong, String nhacungcap,
			LocalDate ngaysanxuat, LocalDate ngayhethan) {
		super(mahang, tenhang, dongia, soluong);
		this.nhacungcap = nhacungcap;
		this.ngaysanxuat = ngaysanxuat;
		this.ngayhethan = ngayhethan;
	}
	public String getNhacungcap() {
		return nhacungcap;
	}
	public void setNhacungcap(String nhacungcap) {
		this.nhacungcap = nhacungcap;
	}
	public LocalDate getNgaysanxuat() {
		return ngaysanxuat;
	}
	public void setNgaysanxuat(LocalDate ngaysanxuat) {
		this.ngaysanxuat = ngaysanxuat;
	}
	public LocalDate getNgayhethan() {
		return ngayhethan;
	}
	public void setNgayhethan(LocalDate ngayhethan) {
		this.ngayhethan = ngayhethan;
	}


}
