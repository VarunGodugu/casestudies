package com.student;

public class Student implements StudentInt {

	@Override
	public void readStudInfo() {
		// TODO Auto-generated method stub
		System.out.println("accepting the details of the student");
	}

	@Override
	public void calcTotal() {
		// TODO Auto-generated method stub
		System.out.println("the total marks");
	}

	@Override
	public void printStudInfo() {
		// TODO Auto-generated method stub
		System.out.println("printing the student details");
	}

}
