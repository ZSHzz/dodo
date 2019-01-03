package model;

import java.io.Serializable;

public class Gerenxinxi implements Serializable{
   private String uname;
   private String upw;
   private String ujianjie;
   
	public Gerenxinxi(String uname, String upw, String ujianjie) {
	super();
	this.uname = uname;
	this.upw = upw;
	this.ujianjie = ujianjie;
}

	public String getUname() {
	return uname;
}

public void setUname(String uname) {
	this.uname = uname;
}

public String getUpw() {
	return upw;
}

public void setUpw(String upw) {
	this.upw = upw;
}

public String getUjianjie() {
	return ujianjie;
}

public void setUjianjie(String ujianjie) {
	this.ujianjie = ujianjie;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
