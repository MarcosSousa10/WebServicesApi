package com.SpringBoot.WebServicesApi.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Empresa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nomedaempresa;
	private String endereço;
	
	public Empresa() {
		
	}
	
	public Empresa(String nomedaempresa, String endereço) {
		super();
		this.nomedaempresa = nomedaempresa;
		this.endereço = endereço;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomedaempresa() {
		return nomedaempresa;
	}
	public void setNomedaempresa(String nomedaempresa) {
		this.nomedaempresa = nomedaempresa;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	
	
	
	
}
