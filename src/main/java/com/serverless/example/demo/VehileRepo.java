package com.serverless.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface VehileRepo extends JpaRepository<Vehicle, Integer> {
}