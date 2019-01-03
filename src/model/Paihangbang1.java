package model;

import java.io.IOException;
import java.io.Serializable;
import java.net.UnknownHostException;
import java.util.ArrayList;

import servers.Client;

public class Paihangbang1 implements Serializable {  
	 private String paiming;

	public Paihangbang1(String paiming) {
		super();
		this.paiming = paiming;
	}

	

	public String getPaiming() {
		return paiming;
	}

	public void setPaiming(String paiming) {
		this.paiming = paiming;
	}

	public ArrayList<Paihangbang1> viewData4() throws UnknownHostException, IOException, ClassNotFoundException{
		Client c = new Client();
		 return c.viewData4();
		
	}

	

	
}
