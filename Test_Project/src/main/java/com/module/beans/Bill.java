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
@Table (name = "bill")
public class Bill {
@Id
@GeneratedValue(strategy =GenerationType.AUTO)
@Column(name = "bill_id")
int id;
@Column
String name;
@ManyToOne
@JoinColumn(name = "BillData",referencedColumnName = "bill_id")
private BillData b_id;
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
public BillData getB_id() {
	return b_id;
}
public void setB_id(BillData b_id) {
	this.b_id = b_id;
}
	
}
