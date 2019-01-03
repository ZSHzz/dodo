package model;

import java.io.Serializable;

public class Dreason implements  Serializable{
	
	 private String name;
	 private String reason;
	public Dreason(String name, String reason) {
		super();
		this.name = name;
		this.reason = reason;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
