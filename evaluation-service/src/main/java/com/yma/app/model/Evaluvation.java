package com.yma.app.model;

import java.io.Serializable;

/**
 * @author Yoshan
 */
/*
 *This class only for skeleton 
 */
public class Evaluvation implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	
	public Evaluvation() {}
	
		
	public Evaluvation(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}