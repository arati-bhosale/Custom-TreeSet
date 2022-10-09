package com.treeset.custom.employee;
import java.util.Comparator;

public class EmpIdComparator implements Comparator<Employee> {

	
	public int compare(Employee d1, Employee d2) {
		
		if(d1.id==d2.id)
		    return 0;
		else if(d1.id>d2.id)
			return 1;
		else
			return -1;
	}
	
//	public int compare(Employee e1, Employee e2) {
//		
//		if(e1.id ==e2.id)
//			return 0;
//		else if(e1.id>e2.id)
//			return -1;
//		else
//			return 1;
//		
//	}
}
