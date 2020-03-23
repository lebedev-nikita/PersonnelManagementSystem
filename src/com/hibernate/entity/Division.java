package com.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="divisions")
public class Division 
{
	@Id
	//@SequenceGenerator(name="division_generator", sequenceName = "divisions_div_id_seq", allocationSize=1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="div_id")
	private int id;
	
	@Column(name="div_name")
	private String name;
	
	@Column(name="head_div_id")
	private int headDivId;
	
	@Column(name="chief_id")
	private int chiefId;
	

	public Division(String name, int headDivId, int chiefId) {
		this.name = name;
		this.headDivId = headDivId;
		this.chiefId = chiefId;
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

	public int getHeadDivId() {
		return headDivId;
	}

	public void setHeadDivId(int headDivId) {
		this.headDivId = headDivId;
	}

	public int getChiefId() {
		return chiefId;
	}

	public void setChiefId(int chiefId) {
		this.chiefId = chiefId;
	}

	@Override
	public String toString() {
		return "Division [id=" + id + ", name=" + name + ", headDivId=" + headDivId + ", chiefId=" + chiefId + "]";
	}
	
	
}
