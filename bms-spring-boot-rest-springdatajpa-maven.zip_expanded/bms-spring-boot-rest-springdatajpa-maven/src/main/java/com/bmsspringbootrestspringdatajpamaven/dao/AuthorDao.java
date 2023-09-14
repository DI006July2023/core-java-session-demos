package com.bmsspringbootrestspringdatajpamaven.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bmsspringbootrestspringdatajpamaven.dao.entity.AuthorEntity;

@Repository
public interface AuthorDao extends JpaRepository<AuthorEntity, Integer>{

}
