package bai9;

import java.time.LocalDate;
import java.util.Arrays;

import bai10.CD2;

public class KhachHang  {
	private String maKH;
	private String hoTenKH;
	private SoTietKiem[] dsSTK;
	private int soluongsohienco;
	
	@Override
	public String toString() {
		String s="";
		for(int i=0;i<count;i++) {
			s+=dsSTK[i].toString()+"\n";
		
		}
		return "Khách hàng: " + maKH + " - " + hoTenKH + "\n"+s ;
	}
	public KhachHang(String maKH, String hoTenKH, int soluongsohienco) {
		super();
		this.maKH = maKH;
		this.hoTenKH = hoTenKH;
		this.soluongsohienco = soluongsohienco;
	}
	public String getHoTenKH() {
		return hoTenKH;
	}
	public void setHoTenKH(String hoTenKH) {
		this.hoTenKH = hoTenKH;
	}
	public String getMaKH() {
		return maKH;
	}
	public SoTietKiem[] getDsSTK() {
		return dsSTK;
	}
	public int getSoluongsohienco() {
		return soluongsohienco;
	}
	
	private int count=0;
	public void dsSoTietKiem(int n) {
		dsSTK=new SoTietKiem[n];
		count=0;
	}
	public void tangKT() {
		SoTietKiem tam[] = new SoTietKiem[dsSTK.length * 2];
		System.arraycopy(dsSTK, 0, tam, 0, count);
		dsSTK = tam;
	}
	
	public boolean themSTK(SoTietKiem stk) {
		if(count<dsSTK.length)
			dsSTK[count++]=stk;
			return true;
	}
	public int getCount() {
		return count;
	}
	/*
	@Override
	public String toString() {
		String s="";
		for(int i=0;i<count;i++) {
			s+=dsSTK[i].toString()+"\n";
		
		}
		return s;
	}
	*/
	
	
	
	

}
