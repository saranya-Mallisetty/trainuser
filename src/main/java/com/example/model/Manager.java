package com.example.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
@Entity
public class Manager {
	@Id
	private Integer managerid;
	private int manageremployeeid;
	@OneToMany
	@JoinTable(joinColumns = @JoinColumn(name="manageremployeeid"),inverseJoinColumns =@JoinColumn(name="employeeid"))
	private List<Employee> employee=new ArrayList<Employee>();
	public Integer getManagerid() {
		return managerid;
	}
	public void setManagerid(Integer managerid) {
		this.managerid = managerid;
	}
	public int getmanageremployeeid() {
		return manageremployeeid;
	}
	public void setmanageremployeeid(int manageremployeeid) {
		this.manageremployeeid = manageremployeeid;
	}
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	

}
