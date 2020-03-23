package com.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="div_pos")
public class EmpPos 
{
	@Column(name="emp_id")
	private int employeeId;
	
	@Column(name="pos_id")
	private int positionId;
	
	@Column(name="start_date")
	private String startDate;
	
	@Column(name="finish_date")
	private String finishDate;
	
	@Column(name="salary")
	private int salary;
	
	public EmpPos() {}

	public EmpPos(int employeeId, int positionId, String startDate, String finishDate, int salary) {
		super();
		this.employeeId = employeeId;
		this.positionId = positionId;
		this.startDate = startDate;
		this.finishDate = finishDate;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getPositionId() {
		return positionId;
	}

	public void setPositionId(int positionId) {
		this.positionId = positionId;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(String finishDate) {
		this.finishDate = finishDate;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "DivPos [employeeId=" + employeeId + ", positionId=" + positionId + ", startDate=" + startDate
				+ ", finishDate=" + finishDate + ", salary=" + salary + "]";
	}
	
	
}
