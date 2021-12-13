package bai10;

import java.util.Arrays;

public class Contact {
	private int[] SDT=new int[10];
	private String name;
	private int age;
	private boolean gender;
	private String address;
	public String convertGender() {
		if(gender==false)
			return "Nữ";
		else if(gender==true)
			return "Nam";
		else
			return "Khác";
	}
	public static String inTieuDe() {
		String s="";
		s+=String.format("|%-30s|%-15s|%15s|%15s|%25s|\n","Phone number","Name ","Age","Gender","Address");
		return s;
	}
	@Override
	public String toString() {
		return String.format("|%-30s|%-15s|%15s|%15s|%25s|\n", Arrays.toString(SDT),name,age,convertGender(),address);
	}
	/**
	 * 
	 */
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param sDT
	 * @param name
	 * @param age
	 * @param gender
	 * @param address
	 */
	public Contact(int[] sDT, String name, int age, boolean gender, String address) {
		super();
		SDT = sDT;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(SDT);
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + age;
		result = prime * result + (gender ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		if (!Arrays.equals(SDT, other.SDT))
			return false;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (age != other.age)
			return false;
		if (gender != other.gender)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	/**
	 * @return the sDT
	 */
	public int[] getSDT() {
		return SDT;
	}
	/**
	 * @param sDT the sDT to set
	 */
	public void setSDT(int[] sDT) {
		SDT = sDT;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the gender
	 */
	public boolean isGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
}
