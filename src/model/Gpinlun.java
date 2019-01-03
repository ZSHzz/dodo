package model;

import java.io.Serializable;

/**
 *  chat(title,name,content,time,ip);

 * @author user
 *
 */
public class Gpinlun implements Serializable{
	private String status;
	private String name;
	private String content;
	private String time;
	private String ip;
	
	public Gpinlun(String status, String name, String content, String time,
			String ip) {
		super();
		this.status = status;
		this.name = name;
		this.content = content;
		this.time = time;
		this.ip = ip;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	
}
