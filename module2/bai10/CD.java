package bai10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CD {
	private int maCD;
	private String tuaCD;
	private int sbh;
	private float giathanh;
	public int getMaCD() {
		return maCD;
	}
	public void setMaCD(int ma) {
		if(ma > 0)
			this.maCD = maCD;
		else
			this.maCD=999999;
	}
	public String getTuaCD() {
		return tuaCD;
	}
	public void setTuaCD(String tua) {
		if(!tua.trim().isEmpty())
			this.tuaCD = tuaCD;
		else
			this.tuaCD="chưa xác định";
	}
	public int getSbh() {
		return sbh;
	}
	public void setSbh(int sbh) {
		if(sbh > 0)
			this.sbh = sbh;
		else
			this.sbh=0;
	}
	public float getGiathanh() {
		return giathanh;
	}
	public void setGiathanh(float giathanh) {
		if(giathanh > 0)
			this.giathanh = giathanh;
		else
			this.giathanh=0;
		
	}
	public static String getTieuDe() {
		return String.format("%-10s %-20s %-20s %-20s","Mã CD","Tựa CD","Số Lượng","Giá Thành");
		
	}
	DecimalFormat df = new DecimalFormat("#,##0.00");
	public  String toString() {
		return String.format("%-10s %-20s %-20s %-20s",maCD,tuaCD,sbh,giathanh);
	}
	public CD(int maCD, String tuaCD, int sbh, float giathanh) {
		
		this.maCD = maCD;
		this.tuaCD = tuaCD;
		this.sbh = sbh;
		this.giathanh = giathanh;
	}
	public CD() {
		this(999999,"chưa xác định",0,0);
	}
	public void nhapCD(Scanner sc) {
		System.out.println("Nhập mã CD:");
		maCD=sc.nextInt();
		sc.nextLine();
		System.out.println("Nhập Tựa CD:");
		 tuaCD=sc.nextLine();
		System.out.println("Nhập số bài hát:");
		 sbh=sc.nextInt();
		System.out.println("Nhập giá:");
		 giathanh=sc.nextFloat();
	}
	
	
	

}
