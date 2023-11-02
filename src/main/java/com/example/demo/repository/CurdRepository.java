package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Curd;

public interface CurdRepository extends JpaRepository<Curd, Integer> {

}
