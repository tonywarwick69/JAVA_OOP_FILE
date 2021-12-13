package bai10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import bai07.Employee;

public class ContactList {
	ArrayList<Contact> listCon = new ArrayList<Contact>();
	public boolean addContact(Contact c) {
		if(listCon.contains(c)) {
			System.out.println("Thêm thất bại, số điện thoại đã tồn tại");
			return false;
		} else {
			listCon.add(c);
			return true;
		}
	}
	public Contact getElement(int i) {
		return listCon.get(i);
	}
	public int getIndexByPhone(int[] number) {
		int i=-1;
		Iterator<Contact> itr=listCon.iterator();
		while(itr.hasNext()) {
			Contact element = itr.next();
			if(element.getSDT()==number) {
				i=listCon.indexOf(element);
				
			}
			
		}
		return i;
	}
	public String toString() {
		String s="";
		s+=Contact.inTieuDe();
		s+=getRequestList(getContactList());
		return s;
	}
	public List<Contact> getContactList(){
		ArrayList<Contact> a = new ArrayList<Contact>();
		for(Contact c:listCon) {
			if(c instanceof Contact) {
				a.add(c);
			}
		}
		return a;
	}
	public String getRequestList(List<Contact> cons) {
		String s="";
		for(Contact c: cons) {
			s+=c.toString()+"\n";
		}
		return s;
	}
	public ArrayList<Contact> searchAddress(String address){
		ArrayList<Contact> a = new ArrayList<Contact>();
		for (Contact c : listCon) {
			if (c.getAddress().equals(address)) {
				a.add(c);
				return a;
			}
		}
		return null;
	}
	public ArrayList<Contact> searchNumber(int number){
		ArrayList<Contact> a = new ArrayList<Contact>();
		for (Contact c : listCon) {
			for( int element: c.getSDT()) {
				if(number==element) {
					a.add(c);
					return a;
				}
			}
		}
		return null;
	}
}
