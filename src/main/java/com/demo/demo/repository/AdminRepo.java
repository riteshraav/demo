package com.demo.demo.repository;

import com.demo.demo.model.Admin;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdminRepo extends MongoRepository<Admin, String> {
}
