package com.example.backend_defects.beans;

import java.util.List;
import java.util.Optional;

public interface DefectService {

    List<Defect> readAll();

    Defect read(int id);

}
