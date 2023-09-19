package com.bmsspringbootrestspringdatajpamaven.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bmsspringbootrestspringdatajpamaven.dao.entity.CharacterEntity;

@Repository
public interface CharacterDao extends JpaRepository<CharacterEntity, Integer>{

}
