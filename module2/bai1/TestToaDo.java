package bai1;

import java.util.Scanner;

public class TestToaDo {
	public static void main(String[] args) {
	
		ToaDoAB toado1=new ToaDoAB();
	    Scanner scanner = new Scanner(System.in);
	         
	    System.out.println("Nhập tọa độ điểm A: ");
	    System.out.println("Nhập hoành độ điểm A:");
	    double xA = scanner.nextDouble();
	    toado1.setxA(xA);
	    System.out.println("Nhập tung độ điểm A: ");
	    double yA = scanner.nextDouble();
	    toado1.setyA(yA);     
	    System.out.println("Nhập tọa độ điểm B: ");
	    System.out.println("Nhập hoành độ điểm B: ");
	    double xB = scanner.nextDouble();
	    toado1.setxB(xB);
	    System.out.println("Nhập tung độ điểm B: ");
	    double yB = scanner.nextDouble();
	    toado1.setyB(yB);
	    System.out.println("Độ dài đoạn thắng AB = "+toado1);
	    ToaDoAB toado2=new ToaDoAB(7,5,8,6);
	    System.out.println("Độ dài đoạn thắng AB = "+toado2);     
	    
	    
	    
	   
	    
	}

}
