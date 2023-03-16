package com.example.backend_defects.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DefectsRepository extends JpaRepository<Defect, Integer> {
}
