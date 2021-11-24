package bai06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import bai09.Customer;
import bai09.Employee;
import bai09.Person;
import bai09.Student;

public class ListPhongHoc {
	public ArrayList<PhongHoc> listphong;
	
	public ListPhongHoc() {
		listphong = new ArrayList<PhongHoc>();
	}
	public boolean addPhong(PhongHoc p) {
		if(listphong.contains(p)) {
			return false;
		} else {
			listphong.add(p);
			return true;
		}
	}
	public int getIndexByMa(String maphong) {
		int i=-1;
		Iterator<PhongHoc> itr = listphong.iterator();
		while (itr.hasNext()) {
			PhongHoc element = itr.next();
				if (element.getMaphong().equals(maphong)) {
				i= listphong.indexOf(element);
			}
		}
		return i;
	}
	public PhongHoc getElement(int i) {
		return listphong.get(i);
	}
	public int getSize() {
		return listphong.size();
	}
	public boolean updatePhong(String ssn, PhongHoc p) {
		if(listphong.set(getIndexByMa(ssn),p)!=null) {
			return true;
		}
		return false;
	}
	public boolean deletePhong(String maphong) {
		return listphong.removeIf(PhongHoc -> PhongHoc.getMaphong().equals(maphong));
	}
	

	@Override
	public String toString() {
		String s="";
		s+=PhongLyThuyet.inTieuDe();
		s+=getRequestList(getDSPhongLyThuyet());
		s+=PhongMayTinh.inTieuDe();
		s+=getRequestList(getDSPhongMayTinh());
		s+=PhongThiNghiem.inTieuDe();
		s+=getRequestList(getDSPhongThiNghiem());
		return s;
	}
	public List<PhongHoc> getDSPhongLyThuyet(){
		List<PhongHoc> a = new ArrayList<PhongHoc>();
		for (PhongHoc phong : listphong) {
			if (phong instanceof PhongLyThuyet ) {
				a.add(phong);
			}
		}
		return a;
	}
	public List<PhongHoc> getDSPhongMayTinh(){
		List<PhongHoc> a = new ArrayList<PhongHoc>();
		for (PhongHoc phong : listphong) {
			if (phong instanceof PhongMayTinh ) {
				a.add(phong);
			}
		}
		return a;
	}
	public List<PhongHoc> getDSPhongThiNghiem(){
		List<PhongHoc> a = new ArrayList<PhongHoc>();
		for (PhongHoc phong : listphong) {
			if (phong instanceof PhongThiNghiem ) {
				a.add(phong);
			}
		}
		return a;
	}
	public String getRequestList(List<PhongHoc> phongs) {
		String s="";
		for (PhongHoc p : phongs) {
			s+=p.toString()+"\n";
		}
		return s;
	}
	public List<PhongHoc> searchPhong(String ma){
		List<PhongHoc> a = new ArrayList<PhongHoc>();
		for(PhongHoc p: listphong) {
			if(p.getMaphong().equals(ma)) {
				a.add(p);
				return a;
			}
		}
		System.out.println("Không tìm thấy phòng");
		return null;
	}

	public String sortTangDayNha(){
		List<PhongHoc> a = new ArrayList<PhongHoc>();
		Collections.sort(listphong, new Comparator<PhongHoc>() {
            @Override
            public int compare(PhongHoc p1, PhongHoc p2) {
                return (p1.getMaphong().compareTo(p2.getMaphong()));
                // Muốn đảo danh sách các bạn đối thành
                //return (sv2.hoTen.compareTo(sv1.hoTen));
            }
        });
		return listphong.toString();
		
	}
	public String sortGiamDienTich(){
		List<PhongHoc> a = new ArrayList<PhongHoc>();
		Collections.sort(listphong, new Comparator<PhongHoc>() {
            @Override
            public int compare(PhongHoc p1, PhongHoc p2) {
               if(p1.getDientich()<p2.getDientich()) {
            	   return 1;
               } else {
            	   if(p1.getDientich()==p2.getDientich()) {
            		   return 0;
            	   } else {
            		   return -1;
            	   }
               }
            }
        });
		return listphong.toString();
		
	}
	
	
	

}
