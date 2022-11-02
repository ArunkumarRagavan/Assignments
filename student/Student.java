package org.student;

import org.department.Department;

public class Student extends Department {
	public void stuName() {
		System.out.print("Arunkumar");
	}
	public void stuDept() {
		System.out.println(" "+"Aeronautical");
	}
	public void stuId() {
		System.out.print(" "+"12AE40");
	}
	public static void main(String[] args)
	{
		Student stud=new Student();
		stud.stuName();
		stud.stuId();
		stud.stuDept();
		stud.collegeName();
		stud.deptName();
		stud.collegeCode();
		stud.collegeRank();
	}

}
