package com.example.backend_defects.mapper;

import com.example.backend_defects.domain.Defect;
import com.example.backend_defects.domain.DefectResponse;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DefectResponseMapper {
    public DefectResponse createDefectResponse(Defect defect) {
        return new DefectResponse(defect.getNameDefect(), defect.getDescription(), defect.getReasons(), defect.getSolutions(), defect.getPicture());
    }

    public List<DefectResponse> createListDefectResponse(List<Defect> defectList) {
        List<DefectResponse> defectResponseList = defectList.stream().map(this::createDefectResponse).toList();
        return defectResponseList;
    }
}
