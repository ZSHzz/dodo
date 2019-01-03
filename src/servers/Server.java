package servers;


import java.io.*;
import java.net.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;

import model.*;

public class Server  {
	  ObjectInputStream ois;
	  ObjectOutputStream oos ;
	  Socket s ;  
	  
	  final int LOGIN=1001;
	  final int REGISTER = 1002 ;
	  final int SHOUCANG = 1003; 
	  final int SETPRICE = 1004;
	  final int XINXIGUANLI=1005;
	  final int VIEW1 = 1010;
	  final int PINLUN = 1009;
	  final int UPLOAD = 1008;
	  final int GONGGAO= 1006;
	  final int VIEW = 1007;
	  final int REASON=1013;
	  final int DELETE =1011;
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

	//  final int MODIFY=1012;
	  
	  
public Server() throws IOException, ClassNotFoundException, SQLException{
	ServerSocket ss = new ServerSocket(3980);
	while(true){ 
		s= ss.accept();
		ois = new ObjectInputStream(s.getInputStream());
		oos = new ObjectOutputStream(s.getOutputStream());	
		
		int command = ois.readInt();
		
		if(command == LOGIN){
			login();
		}
		if(command == REGISTER){
			register();
		}
		if(command == SHOUCANG){
			shoucang();
			//shoucang4();
			
		}
		//if(command==MODIFY){
		//	testmodify();
		//	testmodify1();
			
		//}
		if(command==DELETE){
			delete();
		}
		if(command == SETPRICE){
			setprice();
			
		}
		if(command == PINJIA){
			pinjia();
		}
		if(command == PINJIA1){
			pinjia1();
		}
		if(command == PINJIA2){
			pinjia2();
		}
		//if(command == VIEW){
		//	view();
			
		//}
		if(command == VIEW){
			view();
		}
		if(command == VIEW1){
			view1();
		}
		if(command == VIEW2){
			view2();
		}
		if(command == VIEW3){
			view3();
		}
		if(command == VIEW4){
			view4();
		}
		if(command == VIEW5){
			view5();
		}
		if(command == VIEW6){
			view6();
		}
		if(command == VIEW7){
			view7();
		}
		if(command == VIEW8){
			view8();
		}
		if(command == VIEW9){
			view9();
		}
		if(command == VIEW10){
			view10();
		}
		
		if(command == UPLOAD){
			uploadFile();
		}
		if(command == PINLUN){
			send1();
			
		}
		if(command == GONGGAO){
			send();
		}
		if(command == REASON){
			reason();
		}
		if(command == 1200){
			loadFile();
		}
		if(command == 1000){
			String sql="select * from gameprice ";
			
			//select count(*) from  tableName where id<10 order by id asc
			
			
			//ResultSet re = DataConnect.getStatment().executeQuery(sql);
			ResultSet rs = DataConnect.getStat().executeQuery(sql);
			ArrayList<Paihangbang> gpaihangbang =new ArrayList<Paihangbang>();
			while(rs.next()){
				gpaihangbang.add(new Paihangbang(rs.getString(1),rs.getString(2),rs.getString(3)));
				
			}
			oos.writeObject(gpaihangbang);

			oos.flush();
		}
		if(command == 4100){
			String sql="select * from shoucang ";
			ResultSet rs = DataConnect.getStat().executeQuery(sql);
			ArrayList<Gameshoucang> gshoucang =new ArrayList<Gameshoucang>();
			while(rs.next()){
				gshoucang.add(new Gameshoucang(rs.getString(1),rs.getString(2),rs.getString(3)));
				
			}
			oos.writeObject(gshoucang);

			oos.flush();
		}
		if(command == 1100){
      String sql="select * from gamepaihangbang1 ";
			
			//select count(*) from  tableName where id<10 order by id asc
			
			
			//ResultSet re = DataConnect.getStatment().executeQuery(sql);
			ResultSet rs = DataConnect.getStat().executeQuery(sql);
			ArrayList<Paihangbang1> gamepaihangbang1 =new ArrayList<Paihangbang1>();
			while(rs.next()){
				gamepaihangbang1.add(new Paihangbang1(rs.getString(1)));
				
			}
			oos.writeObject(gamepaihangbang1);

			oos.flush();
		}
		if(command == XINXIGUANLI){
		    xinxiguanli();	
		
		}
		if(command == 2000){
			String sql="select * from user where status = '用户' ";
			
		
			ResultSet rs = DataConnect.getStat().executeQuery(sql);
			ArrayList<User> user =new ArrayList<User>();
			while(rs.next()){
				user.add(new User(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)));
				
			}
			oos.writeObject(user);

			oos.flush();
		}if(command == 3000){
			String sql="select * from game ";
			
			ResultSet rs = DataConnect.getStat().executeQuery(sql);
			ArrayList<Game> game =new ArrayList<Game>();
			while(rs.next()){
				game.add(new Game(rs.getString(1),rs.getString(2),rs.getString(3)));
				
			}
			oos.writeObject(game);

			oos.flush();
		}
		
		if(command == 4000){
			String sql="select * from user where status = '商家' ";
			
		
			ResultSet rs = DataConnect.getStat().executeQuery(sql);
			ArrayList<User> user =new ArrayList<User>();
			while(rs.next()){
				user.add(new User(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)));
				
			}
			oos.writeObject(user);

			oos.flush();
		}
		
	}
	
	

}



private void reason() throws IOException, ClassNotFoundException {
	    String name = ois.readUTF();
	    String reason =ois.readUTF();
   
	    Dreason u = null;
		String sql = "insert into deleteuser values('" + name + "','" + reason + "')";
	  
	    try{
	      DataConnect.getStat().executeUpdate(sql);
	      oos.writeObject(new Dreason(name,reason));
	      oos.flush();
	     
	    
	    }catch(SQLException e){
	    	// TODO Auto-generated catch block
	    	oos.writeObject(null);
			oos.flush();
	    	
	    }
	}



public void  delete () throws IOException, ClassNotFoundException, SQLException {
	String name=ois.readUTF();
	String id =ois.readUTF();
	User u =null;
	String pw =ois.readUTF();
	String status = ois.readUTF();
	String sql1= "delete from  user where name ='"+name+"'";
	 DataConnect.getStat().executeUpdate(sql1);

			oos.writeObject(u);
			oos.flush();
			
		
        oos.writeObject(new User(status,pw,id,name));
        oos.flush();
       
      
	}




private void uploadFile() throws IOException, SQLException,
ClassNotFoundException {
	// TODO Auto-generated method stub
	String uname = ois.readUTF();
	File f = new File("c:\\dodo\\" + uname + ".jpg");

	FileOutputStream fos = new FileOutputStream(f);



	byte[] buf = new byte[1024];
	int len = 0;
	while ((len = ois.read(buf)) != -1) {
		fos.write(buf);
	}
	fos.close();
	try {
		String sql = "insert into img values('" + uname + "','"
				+ f.getName() + "')";
		DataConnect.getStat().executeUpdate(sql);
	} catch (Exception e) {

	}
}


public void loadFile() throws IOException, SQLException,
ClassNotFoundException {

String uname = ois.readUTF();

String sql = "select * from img where uname='" + uname + "'";
ResultSet rs = DataConnect.getStat().executeQuery(sql);
String fname = "";
if (rs.next()) {
fname = rs.getString(2);
}
if(fname.equals("")){
oos.writeInt(0);
oos.flush();
return;
}
oos.writeInt(1);
oos.flush();

File f = new File("C:\\dodo\\" + fname);
System.out.println(f.getAbsolutePath());
FileInputStream fis = new FileInputStream(f);



byte[] buf = new byte[1024];
int len = 0;
while ((len = fis.read(buf)) != -1) {
	oos.write(buf);
}
s.shutdownOutput();

}





private void xinxiguanli() throws IOException, SQLException, ClassNotFoundException {
	String uname = ois.readUTF();
	String upw = ois.readUTF();
	String ujianjie = ois.readUTF();
	
      
      String sql1="update grenxinxi set upw = '"+upw+"'";
 	 DataConnect.getStat().executeUpdate(sql1);
    
      
      
      
      String sql2="update grenxinxi set ujianjie = '"+ujianjie+"'";
 	 DataConnect.getStat().executeUpdate(sql2);
     
 	 
 	 String sql="update grenxinxi set uname = '"+uname+"'";
	 
    
    try{
        DataConnect.getStat().executeUpdate(sql);
        oos.writeObject(new Gerenxinxi(uname,upw,ujianjie));
        oos.flush();
       
      
      }catch(SQLException e){
      	// TODO Auto-generated catch block
      	oos.writeObject(null);
  		oos.flush();
      	e.printStackTrace();
      }catch(ClassNotFoundException e){
      	// TODO Auto-generated catch block
      	e.printStackTrace();
      	
      }
}





private void setprice() throws IOException, SQLException, ClassNotFoundException {
	String gprice = ois.readUTF();
	String gname = ois.readUTF();
	String sql="update gameprice set gprice='"+gprice+"' where gname='"+gname+"'";
	
       Gameprice u = null;
 
	    try{
	      DataConnect.getStat().executeUpdate(sql);
	      oos.writeObject(new Gameprice(gprice,gname));
	      oos.flush();
	     
	    
	    }catch(SQLException e){
	    	// TODO Auto-generated catch block
	    	oos.writeObject(null);
			oos.flush();
	    	e.printStackTrace();
	    }catch(ClassNotFoundException e){
	    	// TODO Auto-generated catch block
	    	e.printStackTrace();
	    	
	    }
}



public void  login () throws IOException, ClassNotFoundException, SQLException {

	String status = ois.readUTF();
	String pw = ois.readUTF();
	String id = ois.readUTF();
	
	
	User u =null;
	String sql ="select* from user where status ='"+status+"' and pw = '"+pw+"' and id='"+id+"' ";
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	
	if(rs.next())
		u = new User(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
		oos.writeObject(u);
		oos.flush();
		
	}

public void  register () throws IOException, ClassNotFoundException{
    String status = ois.readUTF();
    String name =ois.readUTF();
    String pw =ois.readUTF();
    String id=ois.readUTF();
    User u = null;
	String sql = "insert into user values('" + id + "','" + pw + "','"
	+ name + "','"+ status +"')";
  
    try{
      DataConnect.getStat().executeUpdate(sql);
      oos.writeObject(new User(id,pw,name,status));
      oos.flush();
     
    
    }catch(SQLException e){
    	// TODO Auto-generated catch block
    	oos.writeObject(null);
		oos.flush();
    	
    }}
    
    

public void  shoucang () throws IOException{
    String gname=ois.readUTF();
    String type=ois.readUTF();
    String id=ois.readUTF();
    
	String sql = "insert into shoucang values(' 守望先锋','战斗 ',1)";
	
	 try{
	      DataConnect.getStat().executeUpdate(sql);
	      oos.writeObject(new Gameshoucang(gname,type,id));
	      oos.flush();
	    }catch(SQLException e){
	    	// TODO Auto-generated catch block
	    	oos.writeObject(null);
			oos.flush();
	    	e.printStackTrace();
	    }catch(ClassNotFoundException e){
	    	// TODO Auto-generated catch block
	    	e.printStackTrace();
	    	
	    }
    }
    


public void send1() throws IOException, ClassNotFoundException, SQLException {
	User u = (User) ois.readObject();
	String content = ois.readUTF();

	String sql = "insert into pinlun values('" + u.getStatus() + "','"
			+ u.getName() + "','" + content + "','" + new Date() + "','"
			+ s.getInetAddress() + "')";

	DataConnect.getStat().executeUpdate(sql);

}


public void pinjia1() throws IOException, ClassNotFoundException, SQLException {
	User u = (User) ois.readObject();
	String pinjia = ois.readUTF();
	String sql = "insert into gpinjia values('" +  u.getName() + "','"
	+u.getStatus() + "','"+ pinjia+" ','" + u.getId()+ "')";

	DataConnect.getStat().executeUpdate(sql);

}

public void pinjia2() throws IOException, ClassNotFoundException, SQLException {
	User u = (User) ois.readObject();
	String pinjia = ois.readUTF();
	String sql = "insert into gpinjia values('" +  u.getName() + "','"
	+u.getStatus() + "','"+ pinjia+" ','" + u.getId()+ "')";

	DataConnect.getStat().executeUpdate(sql);

}

public void pinjia() throws IOException, ClassNotFoundException, SQLException {
	User u = (User) ois.readObject();
	String pinjia = ois.readUTF();
	String sql = "insert into gpinjia values('" +  u.getName() + "','"
	+u.getStatus() + "','"+ pinjia+" ','" + u.getId()+ "')";

	DataConnect.getStat().executeUpdate(sql);

}

public void send() throws IOException, ClassNotFoundException, SQLException {
	User u = (User) ois.readObject();
	String content = ois.readUTF();
	String sql = "insert into gonggao values('" + u.getStatus() + "','"
			+ u.getName() + "','" + content + "','" + new Date() + "','"
			+ s.getInetAddress() + "')";

	DataConnect.getStat().executeUpdate(sql);

}

public void view10() throws IOException, SQLException, ClassNotFoundException {
	String sql = "select * from pinlun";
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	String string = "";
	while (rs.next()) {
		string += "[" + rs.getString("status") + "]" + rs.getString("name")
				+ "(" + rs.getString("id") + "):" +"\n"+ rs.getString("content")
				+ "/" + rs.getString("time");
		string += "\n";
	}
	oos.writeUTF(string);
	oos.flush();

}


public void view() throws IOException, SQLException, ClassNotFoundException {
	String sql = "select * from gonggao";
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	String string = "";
	while (rs.next()) {
		string += "\n"+ "    "+rs.getString("content") +"\n"+"         "+  "[" +rs.getString("status")+"]"
				 + rs.getString("name")
			+ "/" + rs.getString("time");
		string += "\n\n\n";
	}
	oos.writeUTF(string);
	oos.flush();
}




public void view1() throws IOException, SQLException, ClassNotFoundException {
	String sql = "select * from grenxinxi";
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	String string = "";
	while (rs.next()) {
		string += rs.getString("uname");
}
	oos.writeUTF(string);
	oos.flush();
}

public void view2() throws IOException, SQLException, ClassNotFoundException {
	String sql = "select * from grenxinxi";
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	String string = "";
	while (rs.next()) {
		string += rs.getString("ujianjie");
}
	oos.writeUTF(string);
	oos.flush();
}

public void view3() throws IOException, SQLException, ClassNotFoundException {
	String sql = "select * from gameprice where gname='极品飞车'";
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	String string = "";
	while (rs.next()) {
		string += rs.getString("gprice");
}
	oos.writeUTF(string);
	oos.flush();
}
public void view4() throws IOException, SQLException, ClassNotFoundException {
	String sql = "select * from gameprice where gname='魔兽世界'";
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	String string = "";
	while (rs.next()) {
		string += rs.getString("gprice");
}
	oos.writeUTF(string);
	oos.flush();
}
public void view5() throws IOException, SQLException, ClassNotFoundException {
	String sql = "select * from gameprice where gname='英雄联盟'";
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	String string = "";
	while (rs.next()) {
		string += rs.getString("gprice");
}
	oos.writeUTF(string);
	oos.flush();
}
public void view6() throws IOException, SQLException, ClassNotFoundException {
	String sql = "select * from gameprice where gname='炉石传说'";
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	String string = "";
	while (rs.next()) {
		string += rs.getString("gprice");
}
	oos.writeUTF(string);
	oos.flush();
}
public void view7() throws IOException, SQLException, ClassNotFoundException {
	String sql = "select * from gameprice where gname='刀剑神域'";
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	String string = "";
	while (rs.next()) {
		string += rs.getString("gprice");
}
	oos.writeUTF(string);
	oos.flush();
}
public void view8() throws IOException, SQLException, ClassNotFoundException {
	String sql = "select * from gameprice where gname='穿越火线'";
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	String string = "";
	while (rs.next()) {
		string += rs.getString("gprice");
}
	oos.writeUTF(string);
	oos.flush();
}
public void view9() throws IOException, SQLException, ClassNotFoundException {
	String sql = "select * from gameprice where gname='守望先锋'";
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	String string = "";
	while (rs.next()) {
		string += rs.getString("gprice");
}
	oos.writeUTF(string);
	oos.flush();
}
public static void main(String[] args) {
	try {
		new Server();
	} catch (IOException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
}                                   
                                        


