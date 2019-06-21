package com.example.demo.repository;

import com.example.demo.entity.DescendantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DescendantRepository extends JpaRepository<DescendantEntity, Long> {
}
