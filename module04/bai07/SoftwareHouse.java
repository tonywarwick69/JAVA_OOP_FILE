package bai07;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import bai06.PhongHoc;
import bai09.Person;





public class SoftwareHouse {
	private String companyName;
	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}
	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	DecimalFormat formatter = new DecimalFormat("#0.00");
	public ArrayList<Employee> listEmp =new ArrayList<Employee>();
	public boolean addEmp(Employee e) {
		if(listEmp.contains(e)) {
			System.out.println("Thêm thất bại, nhân viên đã tồn tại");
			return false;
			
		} else {
			listEmp.add(e);
			return true;
		}
	}
	public Employee getElement(int i) {
		return listEmp.get(i);
	}
	public int getIndexByMa(int ma) {
		int i=-1;
		Iterator<Employee> itr = listEmp.iterator();
		while(itr.hasNext()) {
			Employee element = itr.next();
			if(element.getPayrollNumber()==ma) {
				i=listEmp.indexOf(element);
			}
		}
		return i;
	}
	public String toString() {
		String s="";
		s+="\nCông ty "+companyName+"\n";
		s+=Programmer.inTieuDe();
		s+=getRequestList(getDSProgrammer());
		s+=Admin.inTieuDe();
		s+=getRequestList(getDSAdmin());
		s+=ProjectLeader.inTieuDe();
		s+=getRequestList(getDSProjectLeader());
		return s;
	}
	public List<Employee> getDSProgrammer(){
		ArrayList<Employee> a = new ArrayList<Employee>();
		for(Employee e : listEmp) {
			if(e instanceof Programmer) {
				a.add(e);
			}
		}
		return a;
		
	}
	public List<Employee> getDSAdmin(){
		List<Employee> a = new ArrayList<Employee>();
		for(Employee e : listEmp) {
			if(e instanceof Admin) {
				a.add(e);
			}
		}
		return a;
		
	}

	public List<Employee> getDSProjectLeader(){
		List<Employee> a = new ArrayList<Employee>();
		for(Employee e : listEmp) {
			if(e instanceof ProjectLeader) {
				a.add(e);
			}
		}
		return a;
		
	}
	public String getRequestList(List<Employee> emps) {
		String s="";
		for(Employee e: emps) {
			s+=e.toString()+"\n";
		}
		return s;
	}
	public double getMonthlySalaryBill() {
		ArrayList<Employee> a = new ArrayList<Employee>();
		double tongtien =0;
		for(Employee e: listEmp) {
			 tongtien = tongtien+e.getBasicMonthSalary();
		}
		return tongtien;
	}
	public String sortHotenGiam() {
		List<Employee> a  =new ArrayList<Employee>();
		Collections.sort(listEmp,new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				return (e2.getName().compareTo(e1.getName())) ;
					
				
			}
		});
		return listEmp.toString();
	}
	public String sortHoTenTang() {
		List<Employee> a  =new ArrayList<Employee>();
		Collections.sort(listEmp,new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				return (e1.getName().compareTo(e2.getName())) ;
					
				
			}
		});
		return listEmp.toString();
	}
	public boolean update(int ssn, Employee e) {
		if(listEmp.set(getIndexByMa(ssn),e)!=null) {
			return true;
		}
		return false;
	}
	public boolean delete(int manv) {
		return listEmp.removeIf(Employee -> Employee.getPayrollNumber()==manv);
	}
	public ArrayList<Employee> search(String ten){
		ArrayList<Employee> a = new ArrayList<Employee>();
		for (Employee e : listEmp) {
			if (e.getName().equals(ten)) {
				a.add(e);
				return a;
			}
		}
		return null;
		
	}


}
