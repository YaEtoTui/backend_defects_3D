package com.example.backend_defects.service.impl;

import com.example.backend_defects.domain.Defect;
import com.example.backend_defects.domain.DefectResponse;
import com.example.backend_defects.mapper.DefectResponseMapper;
import com.example.backend_defects.repository.DefectsRepository;
import com.example.backend_defects.service.DefectService;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

import static lombok.AccessLevel.PRIVATE;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = PRIVATE, makeFinal = true)
public class DefectServiceImpl implements DefectService {

    private final DefectsRepository defectsRepository;

    DefectResponseMapper defectResponseMapper;

    @Override
    public List<DefectResponse> readAll() {
        List<Defect> defectList = defectsRepository.findAll();
        return defectResponseMapper.createListDefectResponse(defectList);
    }

    @Override
    public DefectResponse read(int id) {
        Defect defect = defectsRepository.getOne(id);
        return defectResponseMapper.createDefectResponse(defect);
    }

}

