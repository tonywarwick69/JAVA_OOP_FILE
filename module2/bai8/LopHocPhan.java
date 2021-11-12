package bai8;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import bai10.CD2;

public class LopHocPhan extends SinhVien {
	private String maLHP;
	private String tenLHP;
	private String tenGV;
	private String thongTinLopHoc;
	private SinhVien[] dsSV;
	public SinhVien[] getDsSV() {
		return dsSV;
	}
	public void setDsSV(SinhVien[] dsSV) {
		this.dsSV = dsSV;
	}
	private int count=0;
	public LopHocPhan(int n) {
		dsSV=new LopHocPhan[n];
		count=0;
	}
	
	public boolean add(SinhVien sv) {
		if(count<dsSV.length)
			dsSV[count++]=sv;
			return true;
	}
	public int getCount() {
		return count;
	}
	
	public boolean deleteSV(String maSV) {
		for(int i=0;i<count;i++)
			if(dsSV[i].getMaSV()==maSV) {
				for(int j=i;j<count-1;j++)
					dsSV[j]=dsSV[j+1];
		count--;
		return true;
			}
	return false;		
	}
	
	public LopHocPhan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LopHocPhan(String maLHP, String tenLHP, String tenGV, String thongTinLopHoc, SinhVien[] dsSV) {
		super();
		this.maLHP = maLHP;
		this.tenLHP = tenLHP;
		this.tenGV = tenGV;
		this.thongTinLopHoc = thongTinLopHoc;
		this.dsSV = dsSV;
	}
	public String getMaLHP() {
		return maLHP;
	}
	public void setMaLHP(String maLHP) {
		this.maLHP = maLHP;
	}
	public String getTenLHP() {
		return tenLHP;
	}
	public void setTenLHP(String tenLHP) {
		this.tenLHP = tenLHP;
	}
	public String getTenGV() {
		return tenGV;
	}
	public void setTenGV(String tenGV) {
		this.tenGV = tenGV;
	}
	public String getThongTinLopHoc() {
		return thongTinLopHoc;
	}
	public void setThongTinLopHoc(String thongTinLopHoc) {
		this.thongTinLopHoc = thongTinLopHoc;
	}
	
	public int getSoLuongSV() {
		return dsSV.length;
	}
	@Override
	public String toString() {
		return "-Mã LHP:" + maLHP + "\n-Tên LHP:" + tenLHP + "\n-GV giảng dạy:" + tenGV + "\n-Thông tin buổi học:"
				+ thongTinLopHoc + "\nDanh sách sinh viên\n" + Arrays.toString(dsSV) + "\n Tổng số sinh viên: " + getSoLuongSV() ;
	}
	
	

}
