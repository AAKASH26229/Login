package com.login.pack.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.login.pack.Model.*;

public interface Repo extends JpaRepository<User, Long>{
	
	@Query("SELECT u FROM User u WHERE u.username = :name")
    User findByUserName(@Param("name") String userName);

}
