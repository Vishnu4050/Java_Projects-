package com.product.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="products")
public class Procuct {
	@Id
	private long id;
	private String pname;
	private long price;
	
	@CreationTimestamp
	private LocalDate mdate;
	@UpdateTimestamp
	private LocalDate udate;
	

	public Procuct() {}
	
	public Procuct(long id, String pname, long price) {
		super();
		this.id = id;
		this.pname = pname;
		this.price = price;
		
		}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}
	public LocalDate getUdate() {
		return udate;
	}
	
	public void setUdate(LocalDate udate) {
		this.udate = LocalDate.now();
	}

	public LocalDate getMdate() {
		return mdate;
	}

	public void setMdate(LocalDate mdate) {
		this.mdate = LocalDate.now();
	}
	
	
	
	
}
