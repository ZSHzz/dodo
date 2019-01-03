package model;

import java.io.IOException;
import java.io.Serializable;
import java.net.UnknownHostException;
import java.util.ArrayList;

import servers.Client;

public class Gannouncement implements Serializable {
		private String title;
		private String name;
		private String content;
		private String time;
		private String ip;
		public Gannouncement(String title, String name, String content, String time,
				String ip) {
			super();
			this.title = title;
			this.name = name;
			this.content = content;
			this.time = time;
			this.ip = ip;
		}
		public String getSTitle() {
			return title;
		}
		public void getSTitle(String title) {
			this.title = title;
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
	
	