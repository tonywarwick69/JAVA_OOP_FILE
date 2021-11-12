package bai11;

import bai11.CongNhan;

public class DanhSachCongNhan {
	CongNhan cn=new CongNhan();
	CongNhan[] listCN;
	@Override
	public String toString() {
		String s="";
		for(int i=0;i<count;i++) {
			s+=listCN[i].toString()+"\n";
		
		}
		return s;
	}
	private int count=0;
	public DanhSachCongNhan(int n) {
		listCN=new CongNhan[n];
		count=0;
	}
	//Trả về danh sách
	public CongNhan[] getListCD() {
		return listCN;
	}
	//thêm công nhân
	public boolean add(CongNhan cn) {
		if(count<listCN.length)
			listCN[count++]=cn;
			return true;
	}
	//Số lương công nhân trong danh sách
	public int getCount() {
		return count;
	}
	
	//•	Phương thức xóa công nhân khi biết mã.
	public boolean deleteCN(String TenX) {
		for(int i=0;i<count;i++)
			if(listCN[i].getmTen().equals(TenX)) {
				for(int j=i;j<count-1;j++)
					listCN[j]=listCN[j+1];
		count--;
		return true;
			}
	return false;		
	}
	//tìm kiếm công nhân theo tên
	public boolean searchCN(String TenX) {
		for(int i=0;i<count;i++) 
			if(listCN[i].getmTen().equals(TenX)) 
				return true;
			return false;
	}
	//sort công nhân theo Họ tăng dần A-Z
	public void sortTangHo() {
		for(int i=0;i<count-1;i++)
			for(int j=i+1;j<count;j++)
				if(listCN[i].getmHo().compareTo(listCN[i].getmHo())>0) {
					CongNhan tg= listCN[i];
					listCN[i]=listCN[j];
					listCN[j]=tg;
				}
	}
	//•	Phương thức sắp xếp công nhân theo số sản phẩm giảm dần.
	public void sortGiamSoSP()
	{
		for (int i = 0; i < count-1; i++) 
		{
			for (int j = i+1; j <count; j++) 
			{
				if(listCN[i].getMsoSP() < (listCN[j].getMsoSP()))
				{	CongNhan temp=listCN[i];
					listCN[i]=listCN[j];
					listCN[j]=temp;
				}
					
			}
		}
	}
	//•	Phương thức lấy danh sách công nhân làm trên 200 sản phẩm.
	public void getCN200(){
		for (int i = 0; i < count; i++) {
			if(listCN[i].getMsoSP()>200)
				System.out.println( listCN[i]);
		}
		
	}
	
	

}
