package com.example.backend_defects.service;

import com.example.backend_defects.repository.Defect;

import java.util.List;

public interface DefectService {

    List<Defect> readAll();

    Defect read(int id);

}
