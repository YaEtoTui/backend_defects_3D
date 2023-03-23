package com.example.backend_defects.service;

import com.example.backend_defects.domain.DefectResponse;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DefectService {

    List<DefectResponse> readAll();

    DefectResponse read(int id);

    Resource getFile(int id);

}
