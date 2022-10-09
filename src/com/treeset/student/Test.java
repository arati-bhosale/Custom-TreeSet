package com.treeset.student;

import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		
		Student s1 = new Student(30,"Shiv");
		Student s2 = new Student(20,"Sham");
		Student s3 = new Student(40,"Ram");
		Student s4 = new Student(10,"OM");
		
		TreeSet ts = new TreeSet();
		ts.add(s2);
		ts.add(s4);
		ts.add(s3);
		ts.add(s1);
		System.out.println(ts);
		
	}
}
