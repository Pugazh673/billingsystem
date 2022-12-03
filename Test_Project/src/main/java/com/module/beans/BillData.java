package com.module.beans;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class BillData {
	@Id
	@GeneratedValue(strategy =GenerationType.TABLE )
	@Column(name = "b_id")
	private int id;
	@Column
	private String name;
	@ManyToOne
	@JoinColumn(name = "BillData_b_id",referencedColumnName = "b_id")
	private Bill BillData_b_id;
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
	public Bill getData_bill_id() {
		return BillData_b_id;
	}
	public void setData_bill_id(Bill data_bill_id) {
		BillData_b_id= data_bill_id;
	}
	
	
		}               

