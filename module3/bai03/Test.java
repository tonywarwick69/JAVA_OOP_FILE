package bai03;

import java.text.DecimalFormat;
import java.time.LocalDate;


public class Test {

	private static int i;
	public static void main(String[] args) {
		GiaoDich[] a=new GiaoDich[3];
		DecimalFormat dt = new DecimalFormat("#,###.00 VNĐ");
		a[0]=new GiaoDichTien("12dasd",LocalDate.of(2012, 12, 12), 10000000,2,300000,"USD");
		a[1]=new GiaoDichTien("1sd",LocalDate.of(2013, 12, 12), 90000000,10,320000,"VN");
		a[2]=new GiaoDichVang("12e1e1",LocalDate.of(2012, 12, 12),6235333,12,"9999999");
		xuatThongTinGiaoDich(a);
		System.out.println("\n");
		tinhTongSoLuongTungLoai(a);
		System.out.println("Trung bình thành tiền của giao dịch tiền là :"+tinhTrungBinhThanhTienGDT(a));
		System.out.println("danh sách các giao dịch trên 1 tỷ:");
		xuatRaGiaoDichTren1Ty(a);
	}
	public static void xuatThongTinGiaoDich(GiaoDich[] a ) {
		for (int i = 0; i < a.length; i++) {
			if(a[i] instanceof GiaoDichVang) {
					System.out.println("Giao Dịch Vàng:\n"+GiaoDichVang.getTieuDe());
					System.out.println(a[i]);
					System.out.println("\n");
			}
			else {
				System.out.println("Giao Dịch Tiền:\n"+GiaoDichTien.getTieuDe());
				System.out.println(a[i]);
				System.out.println("\n");
			}
		}
	}
	public static void tinhTongSoLuongTungLoai(GiaoDich[] a) {
		int sum=0,k=0;
		for(int i=0;i<a.length;i++)
			if(a[i] instanceof GiaoDichVang)
				sum+=a[i].getSoLuong();
			
		System.out.println("số lượng của giao dịch vàng: "+sum);
		for(int i=0;i<a.length;i++)
			if(a[i] instanceof GiaoDichTien)
				k+=a[i].getSoLuong();
		System.out.println("số lượng của giao dịch tiền: "+k);
	}
	public static double tinhTrungBinhThanhTienGDT(GiaoDich[] a) {
		double sum=0;
		int count=0;
		for(int i=0;i<a.length;i++)
			if(a[i] instanceof GiaoDichTien)
			{
				sum+=a[i].getThanhTien();
				count++;
			}
		return (sum/count);
		
	}
	public static void xuatRaGiaoDichTren1Ty(GiaoDich[] a) {
		for(int i=0;i<a.length;i++)
			if(a[i].getThanhTien() >1000000000)
				System.out.println(a[i]);
	}
	
}
