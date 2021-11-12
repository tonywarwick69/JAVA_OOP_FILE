package bai9;

import java.time.LocalDate;
import java.util.Scanner;

import bai8.SinhVien;

public class TestKH_SoTietKiem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SoTietKiem[] dsSTK=new SoTietKiem[0];
		LocalDate ngay1= LocalDate.of(2021, 10, 20);
		LocalDate ngay2=LocalDate.of(2021, 9, 19);
		SoTietKiem stk1=new SoTietKiem("1",ngay1,7500000,6,(float)0.05);
		SoTietKiem stk2=new SoTietKiem("2",ngay2,1500000,12,(float)0.07);
		KhachHang kh=new KhachHang("1","HOàng Long",2);
		kh.dsSoTietKiem(2);
		kh.themSTK(stk1);
		kh.themSTK(stk2);
		System.out.println(kh);
	}

}
