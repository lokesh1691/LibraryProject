package com.hcl.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.library.model.User;


@Repository("userRepository")
public interface UserRepository extends  JpaRepository<User, Long>{

}
