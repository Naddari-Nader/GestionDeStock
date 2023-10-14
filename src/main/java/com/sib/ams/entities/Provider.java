package com.sib.ams.entities;

import java.io.Serializable;

public class Provider implements Serializable{
	
	private String name ;
	private String adress ;
	private String email ;
	
	public String getName() {
		return name;
	}
	public Provider(String name, String adress, String email) {
		super();
		this.name = name;
		this.adress = adress;
		this.email = email;
	}
	public Provider() {
		super();
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
