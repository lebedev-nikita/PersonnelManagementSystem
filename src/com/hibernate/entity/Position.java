package com.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="positions")
public class Position 
{
	@Id
	@Column(name="pos_id")
	private int id;
	
	@Column(name="div_id")
	private int divisionId;
	
	@Column(name="pos_name")
	private String name;
	
	@Column(name="responsibilities")
	private String responsibilities;
	
	public Position() {}

	public Position(int divisionId, String name, String responsibilities) {
		this.divisionId = divisionId;
		this.name = name;
		this.responsibilities = responsibilities;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDivisionId() {
		return divisionId;
	}

	public void setDivisionId(int divisionId) {
		this.divisionId = divisionId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getResponsibilities() {
		return responsibilities;
	}

	public void setResponsibilities(String responsibilities) {
		this.responsibilities = responsibilities;
	}

	@Override
	public String toString() {
		return "Position [id=" + id + ", divisionId=" + divisionId + ", name=" + name + ", responsibilities="
				+ responsibilities + "]";
	}
}
