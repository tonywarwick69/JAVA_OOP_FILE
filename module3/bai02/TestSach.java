package bai02;


import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Scanner;
public class TestSach {

	public static void main(String[] args) throws Exception {
		
		DecimalFormat dt = new DecimalFormat("#,###.00 VNĐ");
		Sach[] a = new Sach[2];
		a[0]= new SachGiaoKhoa("1",LocalDate.of(2012,1,2), 9000000, 10,"kim đồng", "cũ");
		a[1]=new SachThamKhao("2",LocalDate.of(2012,1,2), 120000000, 3, "kim đồng", 12);
		xuatThongTinSach(a);
		System.out.println("nhập nhà xuất bản tìm SGK :");
		Scanner nhap=new Scanner(System.in);
		String b=nhap.nextLine();
		for(int i=0;i<a.length;i++)
			if(a[i].getNhaXuatBan().equalsIgnoreCase(b))
				System.out.println(a[i]);
		xuatTienCaoNhat(a);
	}
	
	public static void xuatThongTinSach(Sach[] a) {
		for (int i = 0; i < a.length; i++) {
			if(a[i] instanceof SachThamKhao) {
					System.out.println("Sach Tham Khảo :\n"+SachThamKhao.getTieuDe());
					System.out.println(a[i]);
			}
			else {
				System.out.println("Sách Giáo Khoa:\n"+SachGiaoKhoa.getTieuDe());
				System.out.println(a[i]);
			}
		}
	}
	public static void xuatTienCaoNhat(Sach[] a) {
		DecimalFormat df=new DecimalFormat("###,###.00 VNĐ");

		double max=a[0].getThanhTien();
		for(int i=0;i<a.length;i++)
			if(a[i].getThanhTien() > max)
				max=a[i].getThanhTien();
		System.out.println("thành tiền cao nhất: "+df.format(max));
	}
	
}
