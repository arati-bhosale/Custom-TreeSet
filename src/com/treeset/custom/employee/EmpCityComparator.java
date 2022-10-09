package com.treeset.custom.employee;
import java.util.Comparator;

public class EmpCityComparator implements Comparator<Employee> {

	public int compare(Employee c1, Employee c2) {
		
		return c1.city.compareTo(c2.city);
	}
}
