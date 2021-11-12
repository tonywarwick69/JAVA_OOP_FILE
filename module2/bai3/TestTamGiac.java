package bai3;

import java.util.Scanner;

public class TestTamGiac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TamGiac tg1=new TamGiac();
		Scanner nhap=new Scanner(System.in);
		System.out.println("Nhập cạnh a:");
		double a=nhap.nextDouble();
		tg1.setA(a);
		System.out.println("Nhập cạnh b:");
		double b=nhap.nextDouble();
		tg1.setB(b);
		System.out.println("Nhập cạnh c:");
		double c=nhap.nextDouble();
		tg1.setC(c);
		System.out.println(tg1);
		if(tg1.getA()==tg1.getB()&&tg1.getB()==tg1.getC()&&tg1.getC()==tg1.getA())
		{
			System.out.println("Tam giác là tam giác đều do có 3 cạnh bằng nhau");
		} else if(tg1.getA()==tg1.getB()||tg1.getB()==tg1.getC()||tg1.getC()==tg1.getA())
		{
			System.out.println("Tam giác là tam giác cân do có 2 cạnh bằng nhau");
		} else if(tg1.getA()!=tg1.getB()&&tg1.getB()!=tg1.getC()&&tg1.getC()!=tg1.getA())
		{
			System.out.println("Tam giác là tam giác thường");
		} else {
			System.out.println("Đây không phải tam giác");
		}
		

	}

}
