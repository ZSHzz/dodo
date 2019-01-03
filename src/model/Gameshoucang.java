package model;

import java.io.IOException;
import java.io.Serializable;
import java.net.UnknownHostException;
import java.util.ArrayList;

import servers.Client;




public class Gameshoucang implements Serializable{
    
	private String gname;
	private String type;
	private String id;
	
	public Gameshoucang(String gname, String type, String id) {
		super();
		this.gname = gname;
		this.type = type;
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Gameshoucang(String gname, String type) {
		super();
		this.gname = gname;
		this.type = type;
	}
	public ArrayList<Gameshoucang> viewData5() throws UnknownHostException, IOException, ClassNotFoundException{
		Client c = new Client();
		 return c.viewData5();	
		
	}

	

}
