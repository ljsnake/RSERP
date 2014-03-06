package com.fudan.rserp.config.model;

public class TbErpContractor implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private String address;
	private String contact;
	private String phone;
	
	public TbErpContractor() {
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}