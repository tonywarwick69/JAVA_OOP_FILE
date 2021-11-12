package bai10;

import java.text.DecimalFormat;

public class TestCD2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CDList2 cds=new CDList2(10);
		cds.add(new CD2(1,"Havana",10,1000000));
		cds.add(new CD2(1,"Despacito",100,15000000));
		cds.add(new CD2(3,"Seven Nation Army",5,5000000));
		DecimalFormat df = new DecimalFormat("#,##0.00");
		System.out.println(cds);
	
		System.out.println("Tổng tiền="+df.format(cds.getSum()));
		//Sap xep cd
		
		
	}

}
