package bai10;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CDList {
	private CD[] list;
	private int count=0;
	
	public CDList(int n) {
		list=new CD[n];
		count=0;
	}
	

	public CD[] getList() {
		return list;
	}

	public boolean add(CD cd) {
		if(count< list.length) 
		{
			list[count++]=cd;
			return true;
		}
		return false;
	}
	public int getcount() {
		return count;
	}
	
	public int getsumCD() {
		int s=0;
		for (int i = 0; i < count; i++) {
			s++;
		}
		return s;
	}
	public float getSumGiaThanh() {
		int s=0;
		for (int i = 0; i < count; i++) {
			s+=list[i].getGiathanh();
		}
		return s;
		
	}
	public boolean deleteCD(int maCD) {
		for (int i = 0; i < count; i++) {
			if(list[i].getMaCD()== maCD) {
				for(int j=i;j<count-1;j++)
					list[j]=list[j+1];
				count--;
				return true;
			}
			
		}
		return false;
	}
	public boolean searchCD(int maCD) {
		for(int i = 0; i<count ;i++)
			if(list[i].getMaCD()==maCD)
				return true;
		return false;
	}
	
	public int searchCD2(int maCD) {
		for(int i=0;i<count ;i++)
			if(list[i].getMaCD()==maCD)
				return i;
		return -1;
	}
	public void sortTangTuaCD() {
		for (int i = 0; i < count-1; i++) {
			for (int j = i+1; j < count; j++) {
				if(list[i].getTuaCD().compareTo(list[j].getTuaCD()) > 0)
				{	CD temp=list[i];
					list[i]=list[j];
					list[j]=temp;
				}
					
			}
		}
	}
	public void sortGiamGiaThanh()
	{
		for (int i = 0; i < count-1; i++) 
		{
			for (int j = i+1; j <count; j++) 
			{
				if(list[i].getGiathanh() < (list[j].getGiathanh()))
				{	CD temp=list[i];
					list[i]=list[j];
					list[j]=temp;
				}
					
			}
		}
	}
	public String toString() {
		String s="";
		for (int i = 0; i < count; i++) {
			s+=list[i].toString()+ "\n";
		}
		return s;
	}
	public void nhapDSCD(Scanner sc) {
		CD cd;
		System.out.print("Nhap so luong CD: ");
        int n = sc.nextInt();

        System.out.println("Nhap danh sach CD: ");
        for (int i = 0; i < n; i++) {
            System.out.println("CD thu " + (i + 1) + " la:");
            cd = new CD();
            cd.nhapCD(sc);

            // Them sv vao danh sach
            add(cd);
        }
		
	}
	
}
