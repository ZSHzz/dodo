package model;

import java.io.IOException;
import java.io.Serializable;
import java.net.UnknownHostException;
import java.util.ArrayList;

import servers.Client;

public class Paihangbang implements Serializable {

	//private String paiming;
	private String gname;
    private String gprice;
	private String gdownloadtimes;
	

	
	public Paihangbang(String gname, String gdownloadtimes, String gprice) {
		super();
		//this.paiming = paiming;
		this.gname = gname;
		this.gprice = gprice;
		this.gdownloadtimes = gdownloadtimes;
	}
	
	//public String getPaiming() {
		//return paiming;
	//}
	//public void setPaiming(String paiming) {
	//	this.paiming = paiming;
	//}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getGprice() {
		return gprice;
	}
	public void setGprice(String gprice) {
		this.gprice = gprice;
	}
	public String getGdownloadtimes() {
		return gdownloadtimes;
	}
	public void setGdownloadtimes(String gdownloadtimes) {
		this.gdownloadtimes = gdownloadtimes;
	}
	public ArrayList<Paihangbang> viewData() throws UnknownHostException, IOException, ClassNotFoundException{
		Client c = new Client();
		 return c.viewData();
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
  
	
	
}
