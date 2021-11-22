package bai09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import bai09.Person;
import bai09.Customer;
import bai09.Student;
import bai09.Employee;

public class Management {
	private List<Person> listPerson;
	public Management() {
		listPerson = new ArrayList<Person>();
	}
	public boolean addPerson(Person p) {
		if(listPerson.contains(p)) {
			return false;
		}
		else {
			listPerson.add(p);
		return true;
		}
	}
	public int getIndexByTen(String ten) {
		int i=-1;
		Iterator<Person> itr = listPerson.iterator();
		while (itr.hasNext()) {
			Person element = itr.next();
				if (element.getHoten().equals(ten)) {
				i= listPerson.indexOf(element);
			}
		}
		return i;
	}
	public Person getElement(int i) {
		return listPerson.get(i);
	}
	public boolean deletePerson(String ten) {
	
	return listPerson.removeIf(Person -> Person.getHoten().equals(ten));
	}
	public int getSize() {
		return listPerson.size();
	}
	public boolean updatelistPerson(String ssn, Person p) {
		if (listPerson.set(getIndexByTen(ssn), p)!=null) {
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		String s="";
		s+=Student.inTieuDe();
		s+=getRequestList(getDanhSachStudent());
		s+=Employee.inTieuDe();
		s+=getRequestList(getDanhSachEmployee());
		s+=Customer.inTieuDe();
		s+=getRequestList(getDanhSachCustomer());
		return s;
	}
	public List<Person> getDanhSachStudent(){
		List<Person> a = new ArrayList<Person>();
		for (Person person : listPerson) {
			if (person instanceof Student ) {
				a.add(person);
			}
		}
		return a;
	}
	public List<Person> getDanhSachEmployee(){
		List<Person> a = new ArrayList<Person>();
		for (Person person : listPerson) {
			if (person instanceof Employee ) {
			a.add(person);
			}
		}
		return a;
	}
	public List<Person> getDanhSachCustomer(){
		List<Person> a = new ArrayList<Person>();
		for (Person person : listPerson) {
			if (person instanceof Customer ) {
				a.add(person);
			}
		}
		return a;
	}
	public String getRequestList(List<Person> persons) {
		String s="";
		for (Person p : persons) {
			s+=p.toString()+"\n";
		}
		return s;
	}
	public List<Person> searchPerson(String ten){
		List<Person> a = new ArrayList<Person>();
		for (Person person : listPerson) {
			if (person.getHoten().equals(ten)) {
				a.add(person);
				return a;
			}
		}
		return null;
		
	}

}
