package bai06;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		DanhSachHoaDon ds=new DanhSachHoaDon(3);
		DanhSachHoaDon dv=new DanhSachHoaDon(4);
		ds.addHD(new HoaDonGio("12s",LocalDate.of(2013,9,12), "Lê Võ","B1",20000,12));
		ds.addHD(new HoaDonGio("1d1d1",LocalDate.of(2015,9,12), "Huỳnh Kính","B2",20000,4));
		ds.addHD(new HoaDonGio("12sadw",LocalDate.of(2013,6,1), "Nguyễn Kiều","N6",20000,31));
		dv.addHD(new HoaDonNgay("121dq", LocalDate.of(2013,6,1), "Hoàng Thu","K12",20000,2));
		dv.addHD(new HoaDonNgay("1q", LocalDate.of(2013,6,1), "Triệu Minh","K3",500000,12));
		dv.addHD(new HoaDonNgay("121dq", LocalDate.of(2013,6,1), "Hoàng Thu","K12",20000,2));
		dv.addHD(new HoaDonNgay("3", LocalDate.of(2021,6,1), "Diệu Vy","T60",50000,5));
		System.out.println("Hóa Đơn Theo Giờ:");
		System.out.println(HoaDonGio.getTieuDe());
		System.out.println("----------------------------------------------------------------------------------------------------------------------------");
		System.out.println(ds);
		
		System.out.println("\n");
		System.out.println("Hóa Đơn Theo Ngày:");

		System.out.println(HoaDonNgay.getTieuDe());
		System.out.println("----------------------------------------------------------------------------------------------------------------------------");
		System.out.println(dv);
		System.out.println("Tổng số hóa đơn theo ngày :"+dv.tinhTongSoLuongHDTheoNgay());
		System.out.println("Tổng số hóa đơn theo giờ :"+ds.tinhTongSoLuongHDTheoGio());
		System.out.println("Tổng Thành Tiền:");
		/**
		 * 
		 * + tinhTongThanhTien(thang : int, nam : int) : double
		 * chưa hiểu là yêu cầu tính cái gì@@
		 */
	}

}
