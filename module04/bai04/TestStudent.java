package bai04;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestStudent {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ListStudent list = new ListStudent();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String birthdaytxt = "13/03/2000";
		LocalDate birthday = LocalDate.parse(birthdaytxt,df);
		Student sv1 = new Student(1,"Dong Duc Khang",birthday);
		Student sv2 = new Student(2,"Luong My Duyen",LocalDate.parse("25/05/1999",df));
		list.addStudent(sv1);
		list.addStudent(sv2);
		System.out.println(list.toString());
	}

}
