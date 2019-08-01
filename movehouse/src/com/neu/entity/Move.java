package com.neu.entity;

import java.util.Date;

public class Move {
	private Integer id;
	private String area;
	private String cartype;
	private Date movedate;
	private String contact;
	private String phone;
	private Integer status;
	
	@Override
	public String toString() {
		return "Move [id=" + id + ", area=" + area + ", cartype=" + cartype + ", movedate=" + movedate + ", contact="
				+ contact + ", phone=" + phone + ", status=" + status + "]";
	}
	public Move() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Move(Integer id, String area, String cartype, Date movedate, String contact, String phone, Integer status) {
		super();
		this.id = id;
		this.area = area;
		this.cartype = cartype;
		this.movedate = movedate;
		this.contact = contact;
		this.phone = phone;
		this.status = status;
	}
	public Move(String area, String cartype, Date movedate, String contact, String phone, int status) {
		super();
		this.area = area;
		this.cartype = cartype;
		this.movedate = movedate;
		this.contact = contact;
		this.phone = phone;
		this.status = status;
	}
	public Move(int id, int status) {
		super();
		this.id = id;
		this.status = status;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCartype() {
		return cartype;
	}
	public void setCartype(String cartype) {
		this.cartype = cartype;
	}
	public Date getMovedate() {
		return movedate;
	}
	public void setMovedate(Date movedate) {
		this.movedate = movedate;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
}
