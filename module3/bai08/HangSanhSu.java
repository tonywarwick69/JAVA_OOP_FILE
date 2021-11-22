package bai08;

import java.util.Date;
import java.text.SimpleDateFormat;

public class HangSanhSu extends HangHoa {
	private String nhaSanXuat;
	private Date ngayNhapKho;
	public String getNhaSanXuat() {
		return nhaSanXuat;
	}
	public void setNhaSanXuat(String nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}
	public Date getNgayNhapKho() {
		return ngayNhapKho;
	}
	public void setNgayNhapKho(Date ngayNhapKho) {
		if (ngayNhapKho.compareTo(new Date())<0) {
			this.ngayNhapKho = ngayNhapKho;
		}
		else {
			this.ngayNhapKho = new Date();
			}
	}
	public HangSanhSu(String maHang, String tenHang, int donGia, int slTon, String nhaSanXuat, Date ngayNhapKho)
	throws Exception {
		super(maHang, tenHang, donGia, slTon);
		this.nhaSanXuat = nhaSanXuat;
		this.ngayNhapKho = ngayNhapKho;
	}
	public HangSanhSu() {
	}
	public static String inTieuDe() {
		String s="";
		s+="\nHang sanh su\n";
		s+=HangHoa.inTieuDe();
		s+=String.format("%-15s|%15s|\n","Nha San Xuat","Ngay Nhap Kho");
		for(int i=0;i<120;i++)
			s+="-";
		s+="\n";
		return s;
	}
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		return super.toString()+ String.format("%-15s|%15s|",getNhaSanXuat(),sdf.format(getNgayNhapKho()));
	}
	
}
