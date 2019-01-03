package model;

import java.io.IOException;
import java.io.Serializable;
import java.net.UnknownHostException;
import java.util.ArrayList;

import servers.Client;

public class Game implements Serializable{

	private String gname;
	public Game(String gname, String gtype, String gprice) {
		super();
		this.gname = gname;
		this.gtype = gtype;
		this.gprice = gprice;
	}

	public Game() {
		// TODO Auto-generated constructor stub
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public String getGtype() {
		return gtype;
	}

	public void setGtype(String gtype) {
		this.gtype = gtype;
	}

	public String getGprice() {
		return gprice;
	}

	public void setGprice(String gprice) {
		this.gprice = gprice;
	}

	private String gtype;
	private String gprice;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ArrayList<Game> viewData2() throws UnknownHostException, IOException, ClassNotFoundException{
		Client c = new Client();
		 return c.viewData2();

}
}
