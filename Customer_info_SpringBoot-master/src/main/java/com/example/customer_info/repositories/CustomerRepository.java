package com.example.customer_info.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.customer_info.model.Customer;

public interface CustomerRepository  extends MongoRepository<Customer, String>{
	Customer findBy_id(ObjectId _id);
	
}
