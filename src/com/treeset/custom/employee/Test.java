package com.treeset.custom.employee;

import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		
		Employee a1 = new Employee(6,"Arati","Malkapur");
		Employee a2 = new Employee(4,"Sayali","Kolhapur");
		Employee a3 = new Employee(5,"Komal","Pune");
		
		EmpIdComparator ep1 = new EmpIdComparator(); 
		TreeSet ts = new TreeSet(ep1);
		ts.add(a2);
		ts.add(a1);
		ts.add(a3);
		System.out.println(ts);
		
//		EmpNameComparator ep2 = new EmpNameComparator(); 
//		TreeSet ts1 = new TreeSet(ep2);
//		ts1.add(a2);
//		ts1.add(a1);
//		ts1.add(a3);
//		System.out.println(ts1);
//		
//		EmpCityComparator ep3 = new EmpCityComparator(); 
//		TreeSet ts2 = new TreeSet(ep3);
//		ts2.add(a2);
//		ts2.add(a1);
//		ts2.add(a3);
//		System.out.println(ts2);
//		
	}
}
