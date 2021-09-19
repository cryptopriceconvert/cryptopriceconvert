package com.cryptopriceconverter.sf.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="currency", schema="public")
public class Currency {

	@Id
	@GeneratedValue
	@Column
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private String value;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long Id) {
		id = Id;
	}
	
	
	
}
