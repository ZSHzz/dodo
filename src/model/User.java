package model;

import java.io.IOException;
import java.io.Serializable;
import java.net.UnknownHostException;
import java.util.ArrayList;

import servers.Client;

public class User implements Serializable{
    

	private String name;
	private String id;
	private String pw;
	private String status;
	public User(String name,String id, String pw, String status) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getStatus() {
		return status;
	}
	public void getStatus(String status) {
		this.status = status;
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}

	
	public ArrayList<User> viewData1() throws UnknownHostException, IOException, ClassNotFoundException{
		Client c = new Client();
		 return c.viewData1();

}
	public ArrayList<User> viewData3() throws UnknownHostException, IOException, ClassNotFoundException{
		Client c = new Client();
		 return c.viewData3();

}


	
	
		

}
