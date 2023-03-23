package com.example.backend_defects.service;

import com.example.backend_defects.domain.Defect;
import com.example.backend_defects.repository.DefectsRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PictureService {

    @NonNull
    DefectsRepository defectsRepository;

    public String read(int id) {
        Defect defect = defectsRepository.getOne(id);
        return defect.getPicture();
    }
}
