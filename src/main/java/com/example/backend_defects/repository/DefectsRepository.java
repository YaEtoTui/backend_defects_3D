package com.example.backend_defects.repository;

import com.example.backend_defects.beans.Defect;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DefectsRepository extends JpaRepository<Defect, Integer> {
}
