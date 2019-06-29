package com.example.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.main.entities.Nacionality;

@Repository
public interface NacionalityRepository extends JpaRepository<Nacionality, Long>{

}