package com.example.backend_defects.service;

import com.example.backend_defects.domain.Defect;
import com.example.backend_defects.domain.DefectResponse;

import java.util.List;

public interface DefectService {

    List<DefectResponse> readAll();

    DefectResponse read(int id);

}
