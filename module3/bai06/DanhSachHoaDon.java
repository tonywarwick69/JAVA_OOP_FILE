package bai06;

import java.util.Arrays;

public class DanhSachHoaDon {
	private HoaDon[] DSHD;
	private int count;
	
	public DanhSachHoaDon(int n) {
		DSHD = new HoaDon[n];
		count=0;
	}
	public boolean addHD(HoaDon x) {
		if(count<DSHD.length)
		{
			DSHD[count++]=x;
			return true;
		}
		return false;
	}
	public int tinhTongSoLuongHDTheoGio() {
		int sum=0;
		for(int i=0;i<DSHD.length;i++)
		{
			if(DSHD[i] instanceof HoaDonGio)
				sum++;
		}
		return sum;
	}
	public int tinhTongSoLuongHDTheoNgay() {
		int sum=0;
		for(int i=0;i<DSHD.length;i++)
		{
			if(DSHD[i] instanceof HoaDonNgay)
				sum++;
		}
		return sum;
	} 
/**
 * + tinhTongThanhTien(thang : int, nam : int) : double
 * 		chưa hiểu đề yêu cầu tính cái gì@@
 */
	@Override
	public String toString() {
		String s="";
		for(int i=0;i<count;i++)
		{
			s+=DSHD[i].toString()+"\n";
		}
		return s;
	}
	
}
