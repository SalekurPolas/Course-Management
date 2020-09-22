//package com.project.courseManagement;

//importing library methods
import javax.swing.JOptionPane;

public abstract class Person {
	//declaring variables
	protected String nid;
	protected String status;
	protected String name;
	protected String email;
	protected String password;
	//abstract methods
	abstract void writeFile(String nid);
	abstract void readFile(String nid);
	abstract void changePassword(String nid);
	
	//constructors
	public Person() {
		
	}
	public Person(String nid, String status, String name, String email, String password) {
		this.nid = nid;
		this.status = status;
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	//setter methods
	public void setNid(String nid) {
		this.nid = nid;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	//getter methods
	public String getNid() {
		return nid;
	}
	public String getStatus() {
		return status;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	//getting input for all components
	public void inputNid() {
		this.nid = JOptionPane.showInputDialog(null, "Enter NSU ID: ");
	}
	public void inputStatus() {
		this.status = JOptionPane.showInputDialog(null, "Enter <1> for Student or <2> Teacher: ");
		if(this.status.equals("1")) {
			this.status = "Student";
		}
		else
			this.status = "Teacher";
	}
	public void inputName() {
		this.name = JOptionPane.showInputDialog(null, "Enter Full Name: ");
	}
	public void inputEmail() {
		this.email = JOptionPane.showInputDialog(null, "Enter Your Email: ");
	}
	public void inputPassword() {
		this.password = JOptionPane.showInputDialog(null, "Enter Password: ");
	}
	//setting print for all components
	public void printNid() {
		JOptionPane.showMessageDialog(null, "Your NSU ID: " + nid);
	}
	public void printStatus() {
		JOptionPane.showMessageDialog(null, "Your are a: " + status);
	}
	public void printName() {
		JOptionPane.showMessageDialog(null, "Full Name: " + name);
	}
	public void printEmail() {
		JOptionPane.showMessageDialog(null, "Email Address: " + email);
	}
	public void printPassword() {
		JOptionPane.showMessageDialog(null, "Your Password: " + password);
	}

}
