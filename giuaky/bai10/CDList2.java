package bai10;

import java.util.ArrayList;
import java.util.Arrays;

public class CDList2 {
	private CD2[] listCD;
	
	@Override
	public String toString() {
		String s="";
		for(int i=0;i<count;i++) {
			s+=listCD[i].toString()+"\n";
		
		}
		return s;
	}
	private int count=0;
	public CDList2(int n) {
		listCD=new CD2[n];
		count=0;
	}
	public CD2[] getListCD() {
		return listCD;
	}
	public boolean add(CD2 cd) {
		if(count<listCD.length)
			listCD[count++]=cd;
			return true;
	}
	public int getCount() {
		return count;
	}
	public float getSum() {
		float s=0;
		for(int i=0;i<count;i++) {
			s+=listCD[i].getGiaThanh();
		}
		return s;
	}
	public boolean deleteCD(int maCD) {
		for(int i=0;i<count;i++)
			if(listCD[i].getMaCD()==maCD) {
				for(int j=i;j<count-1;j++)
					listCD[j]=listCD[j+1];
		count--;
		return true;
			}
	return false;		
	}
	public boolean searchCD(int maCD) {
		for(int i=0;i<count;i++) 
			if(listCD[i].getMaCD()==maCD) 
				return true;
			return false;
	}
	public void sortTangTuaCD() {
		for(int i=0;i<count-1;i++)
			for(int j=i+1;j<count;j++)
				if(listCD[i].getTuaCD().compareTo(listCD[i].getTuaCD())>0) {
					CD2 tg= listCD[i];
					listCD[i]=listCD[j];
					listCD[j]=tg;
				}
	}
	public void sortGiaThanh() {
		for(int i=0;i<count-1;i++)
			for(int j=i+1;j<count;j++)
				if(listCD[i].getGiaThanh()<listCD[i].getGiaThanh()) {
					CD2 tg= listCD[i];
					listCD[i]=listCD[j];
					listCD[j]=tg;
				}
	}
}
