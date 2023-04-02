package com.example.backend_defects.service.impl;

import com.example.backend_defects.domain.Defect;
import com.example.backend_defects.domain.DefectResponse;
import com.example.backend_defects.mapper.DefectResponseMapper;
import com.example.backend_defects.repository.DefectsRepository;
import com.example.backend_defects.service.DefectService;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.experimental.FieldDefaults;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
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
        Defect defect = defectsRepository.findById(id).get();
        return defectResponseMapper.createDefectResponse(defect);
    }

    @Override
    @SneakyThrows
    public Resource getFile(int id) {

        Defect defect = defectsRepository.findById(id).get();

        Path filePath = Paths.get(defect.getPicture()).normalize();

        return new UrlResource(filePath.toUri());
    }
}

