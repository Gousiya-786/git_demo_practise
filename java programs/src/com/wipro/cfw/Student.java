package com.wipro.cfw;

public class Student implements Comparable{

	private Character st;
	private String stname ;
	public Character getSt() {
		return st;
	}
	public void setStid(Character stid) {
		this.st = stid;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	
	
	public Student(Character st, String stname) {
		super();
		this.st = st;
		this.stname = stname;
	}
	
	@Override
	public String toString()
	{
		return st + " " + stname;
	}
	
	@Override
	public int compareTo(Object o) {
		
		Student s = (Student)o;
		return this.getSt().compareTo(s.getSt());
	}
	 
	
	
	
}
