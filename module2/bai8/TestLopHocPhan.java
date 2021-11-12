package bai8;

import java.util.Scanner;

import bai10.CD2;

public class TestLopHocPhan {
	static Scanner sc=new Scanner(System.in);
	static void nhapThongTin(SinhVien tt) {
		sc.nextLine();
        System.out.println("Nhập mã số sinh viên: ");
        tt.setMaSV(sc.nextLine());
        System.out.println("Nhập họ và tên sinh viên: ");
        tt.setHoTen(sc.nextLine());
     
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stubw
		
		SinhVien[] dsSV=null;
		System.out.println("Nhập số lượng sinh viên");
		int sl=sc.nextInt();
		dsSV=new SinhVien[sl];
		for(int i=0;i<sl;i++) {
			System.out.println("Nhập sinh viên thứ "+(i+1));
			dsSV[i]=new SinhVien();
			nhapThongTin(dsSV[i]);
		}
		
		LopHocPhan lhp=new LopHocPhan("1","DHKTPM16TT","Cô Hà","Thứ 7, tiết 4-6, phòng A1.1", dsSV);
		System.out.println(lhp);
		
		
		
		

	}

}
