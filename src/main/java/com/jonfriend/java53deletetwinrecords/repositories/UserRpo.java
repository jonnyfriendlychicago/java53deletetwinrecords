package com.jonfriend.java53deletetwinrecords.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jonfriend.java53deletetwinrecords.models.UserMdl;

@Repository
public interface UserRpo extends CrudRepository<UserMdl, Long> {
    
    Optional<UserMdl> findByEmail(String email);
// end of rpo   
}