package com.bmsspringbootrestspringdatajpamaven.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bmsspringbootrestspringdatajpamaven.dao.entity.AuthorEntity;

@Repository
public interface AuthorDao extends JpaRepository<AuthorEntity, Integer>{
// here we already have the 5 basic crud methods
// add finder methods(query methods) here if you want to work other that the basic 5 crud methods
	
	
	// we want to fetch authors by their first name
	List<AuthorEntity> findByAuthorFirstName(String firstName);
	
	// instead of finder methods we can also JPQL(Java Persistence Querying Language)
}
