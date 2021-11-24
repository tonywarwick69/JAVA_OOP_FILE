package bai04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import bai06.PhongHoc;

public class ListStudent {
	List<Student> listSV;
	public ListStudent() {
		listSV= new ArrayList<Student>();
	}
	public int getSize() {
		return listSV.size();
		
	}
	public Student getElement(int i) {
		return listSV.get(i);
	}
	public int getIndexByID(int ma) {
		int i=-1;
		Iterator<Student> itr = listSV.iterator();
		while (itr.hasNext()) {
			Student element = itr.next();
				if (element.getId()==ma) {
				i= listSV.indexOf(element);
			}
		}
		return i;
	}
	public boolean addStudent(Student sv) {
		if(listSV.contains(sv) && listSV.contains(sv.getId())) {
			return false;
		} else {
			listSV.add(sv);
			return true;
		}
		
	}
	public boolean updateStudent(int ssn, Student sv) {
		if(listSV.set(getIndexByID(ssn),sv)!=null) {
			return true;
			
		}
		return false;
	}
	public boolean deleteStudent(int ma) {
		return listSV.removeIf(Student -> Student.getId()==ma);
	}
	public String toString() {
		String s="";
		s+=Student.inTieuDe();
		s+=getRequestList(getDSStudent());
		return s;
		
	}
	public List<Student> getDSStudent(){
		List<Student> a=new ArrayList<Student>();
		for(Student sv: listSV) {
			if(sv instanceof Student) {
				a.add(sv);
			}
		}
		return a;
	}
	public String getRequestList(List<Student> students) {
		String s="";
		for (Student sv : students) {
			s+=sv.toString()+"\n";
		}
		return s;
	}

}
