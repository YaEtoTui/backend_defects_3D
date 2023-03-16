package com.example.backend_defects.service;

import com.example.backend_defects.repository.Defect;
import com.example.backend_defects.repository.DefectsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Primary
public class DefectServiceImpl implements DefectService {

    private final DefectsRepository defectsRepository;

    @Override
    public List<Defect> readAll() {
        return defectsRepository.findAll();
    }

    @Override
    public Defect read(int id) {
        return defectsRepository.getOne(id);
    }

}

