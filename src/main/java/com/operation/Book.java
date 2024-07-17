package com.operation;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
	public Book(int bid, String bname, int salary) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.salary = salary;
	}
	@Id
	int bid;
	String bname;
	int salary;
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", salary=" + salary + "]";
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

}
