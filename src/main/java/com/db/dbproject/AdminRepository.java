package com.db.dbproject;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import sun.awt.ModalExclude;
@Repository
public interface AdminRepository extends MongoRepository<Admin,Long> {
}
