package bai06;
import java.time.LocalDate;

public class HoaDonGio extends HoaDon{
	private int soGioThue;

	public int getSoGioThue() {
		return soGioThue;
	}

	public void setSoGioThue(int soGioThue) {
		if(soGioThue > 0)
			this.soGioThue = soGioThue;
		else this.soGioThue=0;
	}

	
	public HoaDonGio() {
		this("chưa xác định",LocalDate.now(),"chưa xác định","chưa xác định",0,0);
	}

	public HoaDonGio(String maHoaDon, LocalDate ngayHoaDon, String tenKH, String maPhong, float donGia, int soGioThue) {
		super(maHoaDon, ngayHoaDon, tenKH, maPhong, donGia);
		setSoGioThue(soGioThue);
	}
	
	@Override
	public String toString() {
		return String.format("%s %20s |",super.toString(),soGioThue);
	}
	
	public static String getTieuDe() {
		return String.format("%s %20s |",HoaDon.getTieuDe(),"Giờ Thuê");
	}
	public float getThanhTien() throws Exception {
		if(soGioThue <=24)
			return super.getThanhTien()*soGioThue;
		else if(soGioThue < 30)
			return super.getThanhTien()*24;
		else 
			throw new Exception("Ngoại Lệ");
	}
}
