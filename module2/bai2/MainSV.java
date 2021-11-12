package bai2;

import java.util.Scanner;

public class MainSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhapsv3=new Scanner(System.in);
		SinhVien sv1=new SinhVien(347405,"Dong Duc Khang",6.75,8.5);
		SinhVien sv2=new SinhVien();
		sv2.setDiemLT(7);
		sv2.setDiemTH(8);
		sv2.setHoten("Long");
		sv2.setMasv(177013);
		SinhVien sv3=new SinhVien();
		System.out.println("Nhap ma sinh vien:");
		int masv=nhapsv3.nextInt();
		sv3.setMasv(masv);
		nhapsv3.nextLine();
		System.out.println("Nhap ten sinh vien:");
		String ten;
		ten=nhapsv3.nextLine();
		sv3.setHoten(ten);
		System.out.println("Nhap diem ly thuet:");
		double diemlythuyet=nhapsv3.nextDouble();
		sv3.setDiemLT(diemlythuyet);		
		System.out.println("Nhap diem thuc hanh:");
		double diemthuchanh=nhapsv3.nextDouble();
		sv3.setDiemTH(diemthuchanh);
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
	}

}
