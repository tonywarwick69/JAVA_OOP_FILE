package bai08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListHangHoa {
	private List<HangHoa> listHangHoa;
	public ListHangHoa() {
		listHangHoa = new ArrayList<HangHoa>();
	}
	public boolean themHangHoa(HangHoa h) {
		if(listHangHoa.contains(h)) {
			return false;
		}
		else {
		listHangHoa.add(h);
		return true;
		}
	}
	public int getIndexByMa(String ma) {
		int i=-1;
		Iterator<HangHoa> itr = listHangHoa.iterator();
		while (itr.hasNext()) {
			HangHoa element = itr.next();
				if (element.getMaHang().equals(ma)) {
				i= listHangHoa.indexOf(element);
			}
		}
		return i;
	}
	public HangHoa getElement(int i) {
		return listHangHoa.get(i);
	}
	public boolean xoaHang(String ma) {
	// if (getIndexByMa(ma)>=0 && getIndexByMa(ma)<listHangHoa.size()) {
	// listHangHoa.remove(getIndexByMa(ma));
	// return true;
	// }
	// else {
	// return false;
	// }
	return listHangHoa.removeIf(HangHoa -> HangHoa.getMaHang().equals(ma));
	}
	public int getSize() {
		return listHangHoa.size();
	}
	public boolean capNhatHang(String ssn, HangHoa h) {
		if (listHangHoa.set(getIndexByMa(ssn), h)!=null) {
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		String s="";
		s+=HangThucPham.inTieuDe();
		s+=getRequestList(getDanhSachHangTP());
		s+=HangDienMay.inTieuDe();
		s+=getRequestList(getDanhSachHangDM());
		s+=HangSanhSu.inTieuDe();
		s+=getRequestList(getDanhSachHangSS());
		return s;
	}
	public List<HangHoa> getDanhSachHangTP(){
		List<HangHoa> a = new ArrayList<HangHoa>();
		for (HangHoa hangHoa : listHangHoa) {
			if (hangHoa instanceof HangThucPham ) {
				a.add(hangHoa);
			}
		}
		return a;
	}
	public List<HangHoa> getDanhSachHangDM(){
		List<HangHoa> a = new ArrayList<HangHoa>();
		for (HangHoa hangHoa : listHangHoa) {
			if (hangHoa instanceof HangDienMay ) {
			a.add(hangHoa);
			}
		}
		return a;
	}
	public List<HangHoa> getDanhSachHangSS(){
		List<HangHoa> a = new ArrayList<HangHoa>();
		for (HangHoa hangHoa : listHangHoa) {
			if (hangHoa instanceof HangSanhSu ) {
				a.add(hangHoa);
			}
		}
		return a;
	}
	public String getRequestList(List<HangHoa> eo) {
		String s="";
		for (HangHoa e : eo) {
			s+=e.toString()+"\n";
		}
		return s;
	}
	public List<HangHoa> searchHanghoa(String ma){
		List<HangHoa> a = new ArrayList<HangHoa>();
		for (HangHoa hangHoa : listHangHoa) {
			if (hangHoa.getMaHang().equals(ma)) {
				a.add(hangHoa);
				return a;
			}
		}
		return null;
		
	}

}
