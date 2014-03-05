package com.fudan.rserp.util;

public class Message {
	private String message;
	private String url;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Message(String message, String url) {
		super();
		this.message = message;
		this.url = url;
	}
}