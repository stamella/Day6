package com.capgemini.day6;

import java.util.Objects;

public class Students implements Comparable<Students>{
	private String name;
	private int rollNo;
	private String branch;
	
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Students(String name, int rollNo, String branch) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.branch = branch;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	

	@Override
	public String toString() {
		return "Students [name=" + name + ", rollNo=" + rollNo + ", branch=" + branch + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(rollNo, name,branch);
	}
	@Override
    public int compareTo(Students student) {
		
//        int result = this.name.compareTo(student.name);
		int result = Double.compare(this.rollNo, student.rollNo);
		if(result == 0)
			return this.branch.compareTo(student.branch);
		return result;
	
}
}