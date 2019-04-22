package com.example.customer_info.model;


import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Customer {
	@Id
	public ObjectId _id;
	
	public String name;
	public String phone_number;
	public String address;
	
	public Customer() {}
	
	public Customer( ObjectId _id,String name, String phone_number, String address)
	{
		this._id = _id;
		this.name = name;
		this.phone_number = phone_number;
		this.address = address;
	}

	public String get_id() {
		return _id.toHexString();
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	 
}

