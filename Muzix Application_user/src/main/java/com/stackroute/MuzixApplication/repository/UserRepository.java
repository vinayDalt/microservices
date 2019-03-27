package com.stackroute.MuzixApplication.repository;

import com.stackroute.MuzixApplication.domain.User;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,Integer> {

//    @Query
//    public User findByName(String name);

}

