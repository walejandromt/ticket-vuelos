package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.VuelosEntity;

@Repository
public interface VuelosRepository extends JpaRepository<VuelosEntity, Long>, JpaSpecificationExecutor<VuelosEntity> {

}
