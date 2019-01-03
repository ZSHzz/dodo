package servers;

import java.io.*;
import java.net.*;
import java.util.ArrayList;




import model.*;

public class Client {
  
    ObjectOutputStream oos ;
    ObjectInputStream ois;   
   final int LOGIN=1001;
   final int REGISTER = 1002 ;
   final int SHOUCANG = 1003; 
   final int SETPRICE=1004 ;
   final int XINXIGUANLI=1005;
   final int VIEW1=1010;
   final int PINLUN=1009;
   final int UPLOAD = 1008;
   final int GONGGAO=1006;
   final int  VIEW=1007;
   final int REASON=1013;
   final int DELETE=1011;
   final int VIEW2=1012;
   final int VIEW3=1014;
   final int VIEW4=1015;
   final int VIEW5=1016;
   final int VIEW6=1017;
   final int VIEW7=1018;
   final int VIEW8=1019;
   final int VIEW9=1020;
   final int VIEW10=1021;
   final int PINJIA=1022;
   final int PINJIA1=1023;
   final int PINJIA2=1024;

  // final int MODIFY=1012;
   Socket s;
   
    public Client() throws UnknownHostException, IOException{
    	Socket s = new Socket("10.51.163.135",3980);
    	oos = new ObjectOutputStream(s.getOutputStream());
    	ois = new ObjectInputStream(s.getInputStream());
    }	
    
    public void loadFile(String uname, File f) throws IOException {
		oos.writeInt(1200);
		oos.flush();
		oos.writeUTF(uname);
		oos.flush();

		int n = ois.readInt();
		if (n == 1) {
			FileOutputStream fos = new FileOutputStream(f);
			
			byte[] buf = new byte[1024];
			int len = 0;
			while ((len = ois.read(buf)) != -1) {
				fos.write(buf, 0, len);
			}

			fos.close();
		}
	}
    
    public void uploadFile(String uname, File f) throws IOException {
		oos.writeInt(UPLOAD);
		oos.flush();
		oos.writeUTF(uname);
		oos.flush();
		FileInputStream fis = new FileInputStream(f);

		byte[] buf = new byte[1024];
		int len = 0;
		while ((len = fis.read(buf)) != -1) {
			oos.write(buf, 0, len);
		}
		s.shutdownOutput();
	}
    public User login (String status, String pw,String id ) throws IOException, ClassNotFoundException{
    	oos.writeInt(LOGIN);
    	oos.flush();
    	oos.writeUTF(status);
    	oos.flush();
    	oos.writeUTF(pw);
    	oos.flush();
    	oos.writeUTF(id);
    	oos.flush();
    	
    	return (User) ois.readObject();	
    }
    public User register(String name ,String pw,String id,String status) throws IOException, ClassNotFoundException{
    	oos.writeInt(REGISTER);
    	oos.flush();
    	oos.writeUTF(name);
    	oos.flush();
    	oos.writeUTF(pw);
    	oos.flush();
    	oos.writeUTF(id);	
    	oos.flush();
    	oos.writeUTF(status);	
    	oos.flush();
    	return (User) ois.readObject();
	
    }
    public  Gameshoucang shoucang(String gname ,String type,String id) throws IOException, ClassNotFoundException{
    	oos.writeInt(SHOUCANG);
    	oos.flush();
    	oos.writeUTF(gname);
    	oos.flush();
    	oos.writeUTF(type);
    	oos.flush();
    	oos.writeUTF(id);
    	oos.flush();
    	
    	return (Gameshoucang) ois.readObject();
    }
    
   public Gameprice setprice(String gprice,String gname) throws IOException, ClassNotFoundException{
	   oos.writeInt(SETPRICE);
   	   oos.flush();
   	   oos.writeUTF(gprice);
	   oos.flush();
	   oos.writeUTF(gname);
	   oos.flush();
	   return (Gameprice) ois.readObject();
   }
@SuppressWarnings("unchecked")
public ArrayList<Paihangbang> viewData() throws IOException, ClassNotFoundException {
     oos.writeInt(1000);	
     oos.flush();
	ArrayList<Paihangbang>gamepaihangbang =(ArrayList<Paihangbang>)ois.readObject();
     return gamepaihangbang;
	
}

@SuppressWarnings("unchecked")
public ArrayList<Paihangbang1> viewData4() throws IOException, ClassNotFoundException {
    oos.writeInt(1100);	
    oos.flush();
	ArrayList<Paihangbang1>gamepaihangbang1 =(ArrayList<Paihangbang1>)ois.readObject();
    return gamepaihangbang1;
	
}
@SuppressWarnings("unchecked")
public  ArrayList<User> viewData1() throws IOException, ClassNotFoundException {
    oos.writeInt(2000);	
    oos.flush();
    ArrayList<User>  user =(ArrayList<User> )ois.readObject();
    return user;
	
}

@SuppressWarnings("unchecked")
public  ArrayList<Game> viewData2() throws IOException, ClassNotFoundException {
    oos.writeInt(3000);	
    oos.flush();
    ArrayList<Game>  game =(ArrayList<Game> )ois.readObject();
    return game;
	
}

@SuppressWarnings("unchecked")
public  ArrayList<User> viewData3() throws IOException, ClassNotFoundException {
    oos.writeInt(4000);	
    oos.flush();
    ArrayList<User>  user =(ArrayList<User> )ois.readObject();
    return user;
	
}
@SuppressWarnings("unchecked")
public ArrayList<Gameshoucang> viewData5() throws IOException, ClassNotFoundException {
    oos.writeInt(4100);	
    oos.flush();
	ArrayList<Gameshoucang>gameshoucang =(ArrayList<Gameshoucang>)ois.readObject();
    return gameshoucang;
	
}


public Gerenxinxi xinxiguanli(String uname,String upw,String ujianjie) throws IOException, ClassNotFoundException{
	   oos.writeInt(XINXIGUANLI);
	   oos.flush();
	   oos.writeUTF(uname);
	   oos.flush();
	   oos.writeUTF(upw);
	   oos.flush();
	   oos.writeUTF(ujianjie);
	   oos.flush();
	 
	   return (Gerenxinxi) ois.readObject();
}
    
//public String view() throws IOException {
	//oos.writeInt(VIEW);
	//oos.flush();
//	return ois.readUTF();
//}

public void send1(User u, String content) throws IOException {
	oos.writeInt(PINLUN);
	oos.flush();
	oos.writeObject(u);
	oos.flush();
	oos.writeUTF(content);
	oos.flush();

}
public void send(User u, String content) throws IOException {
	oos.writeInt(GONGGAO);
	oos.flush();
	oos.writeObject(u);
	oos.flush();
	oos.writeUTF(content);
	oos.flush();
}



public  User delete(String name,String id ,String pw,String status) throws IOException, ClassNotFoundException{
	oos.writeInt(DELETE);
	oos.flush();
	oos.writeUTF(name);
	oos.flush();
	 oos.writeUTF(id);
		oos.flush();
	oos.writeUTF(pw);
	oos.flush();
	oos.writeUTF(status);
	oos.flush();
	

	return (User) ois.readObject();
}

public Dreason reason(String name ,String reason) throws IOException, ClassNotFoundException{
	oos.writeInt(REASON);
	oos.flush();
	oos.writeUTF(name);
	oos.flush();
	oos.writeUTF(reason);
	oos.flush();

	return (Dreason) ois.readObject();

}


public String view() throws IOException {
	oos.writeInt(VIEW);
	oos.flush();
	return ois.readUTF();
}

public String view1() throws IOException {
	oos.writeInt(VIEW1);
	oos.flush();
	return ois.readUTF();
}
public String view2() throws IOException {
	oos.writeInt(VIEW2);
	oos.flush();
	return ois.readUTF();
}
public String view3() throws IOException {
	oos.writeInt(VIEW3);
	oos.flush();
	return ois.readUTF();
}
public String view4() throws IOException {
	oos.writeInt(VIEW4);
	oos.flush();
	return ois.readUTF();
}
public String view5() throws IOException {
	oos.writeInt(VIEW5);
	oos.flush();
	return ois.readUTF();
}
public String view6() throws IOException {
	oos.writeInt(VIEW6);
	oos.flush();
	return ois.readUTF();
}
public String view7() throws IOException {
	oos.writeInt(VIEW7);
	oos.flush();
	return ois.readUTF();
}
public String view8() throws IOException {
	oos.writeInt(VIEW8);
	oos.flush();
	return ois.readUTF();
}
public String view9() throws IOException {
	oos.writeInt(VIEW9);
	oos.flush();
	return ois.readUTF();
}
public String view10() throws IOException {
	oos.writeInt(VIEW10);
	oos.flush();
	return ois.readUTF();
}



public void pinjia(User u, String pinjia) throws IOException {
		oos.writeInt(PINJIA);
		oos.flush();
		oos.writeObject(u);
		oos.flush();
		oos.writeUTF(pinjia);
		oos.flush();
	
}

public void pinjia1(User u, String pinjia) throws IOException {
	oos.writeInt(PINJIA1);
	oos.flush();
	oos.writeObject(u);
	oos.flush();
	oos.writeUTF(pinjia);
	oos.flush();

}
public void pinjia2(User u, String pinjia) throws IOException {
	oos.writeInt(PINJIA2);
	oos.flush();
	oos.writeObject(u);
	oos.flush();
	oos.writeUTF(pinjia);
	oos.flush();

}
}
