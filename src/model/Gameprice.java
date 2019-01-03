package model;

import java.io.Serializable;

public class Gameprice implements Serializable{
     
	 private String gprice;
	 private String gname;


	public String getGname() {
		return gname;
	}


	public void setGname(String gname) {
		this.gname = gname;
	}


	public Gameprice(String gprice, String gname) {
		super();
		this.gprice = gprice;
		
	}
	
	
	public Gameprice(String gprice) {
		super();
		this.gprice = gprice;
	}
	public String getGprice() {
		return gprice;
	}
	public void setGprice(String gprice) {
		this.gprice = gprice;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


}
