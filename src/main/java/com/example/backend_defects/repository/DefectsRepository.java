package com.example.backend_defects.repository;

import com.example.backend_defects.domain.Defect;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DefectsRepository extends JpaRepository<Defect, Integer> {
}
