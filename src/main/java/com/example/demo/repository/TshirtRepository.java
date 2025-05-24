package com.example.demo.repository;

import com.example.demo.entity.Tshirt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TshirtRepository extends JpaRepository<Tshirt, Long> {
}
