package com.treeset.student;

import java.util.Objects;

public class Student implements Comparable<Student> {

	int roll;
	String name;
	
	public Student() {
		
	}
	public Student(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}
	
	public int hashCode() {
		return Objects.hash(name, roll);
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && roll == other.roll;
	}
	
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
	
//	public int compareTo(Student o) {
//		
//		return this.name.compareTo(o.name);
//	}
	
	public int compareTo(Student s) {
		if(this.roll == s.roll)
			return 0;
		else if(this.roll>s.roll)
			return 1;
		else 
			return -1;
	}
}
