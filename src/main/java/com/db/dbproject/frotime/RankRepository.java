package com.db.dbproject;

import org.springframework.data.mongodb.repository.MongoRepository;

//@Repository
public interface RankRepository extends MongoRepository<RankRepository,Integer> {
}
