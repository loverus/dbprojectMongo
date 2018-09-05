package com.db.dbproject;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface AdminRepository extends CrudRepository<Admin,String> {
}
