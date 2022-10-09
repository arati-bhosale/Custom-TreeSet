package com.treeset.custom.employee;

import java.util.Comparator;

public class EmpNameComparator implements Comparator<Employee> {

	public int compare(Employee n1, Employee n2) {
		
		return n1.name.compareTo(n2.name);
	}

}
