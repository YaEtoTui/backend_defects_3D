package com.example.backend_defects.controller;

import com.example.backend_defects.domain.Defect;
import com.example.backend_defects.domain.DefectResponse;
import com.example.backend_defects.service.DefectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class DefectController {

    private  final DefectService defectService;




    @GetMapping(value = "/defects")
    public ResponseEntity<List<DefectResponse>> read() {
        final List<DefectResponse> defects = defectService.readAll();

        return  new ResponseEntity<>(defects, HttpStatus.OK);
    }

    //доделать ниже обработчик
    @GetMapping(value = "/defects/{id}")
    public ResponseEntity<DefectResponse> read(@PathVariable(name = "id") int id) {
        final DefectResponse defect = defectService.read(id);

        return new ResponseEntity<>(defect, HttpStatus.OK);
    }
}
