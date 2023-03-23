package com.example.backend_defects.controller;

import com.example.backend_defects.service.DefectService;
import org.springframework.core.io.Resource;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import static lombok.AccessLevel.PRIVATE;

@RestController
@FieldDefaults(level = PRIVATE, makeFinal = false)
@RequestMapping("/api")
@RequiredArgsConstructor
public class ImageController {

    @NonNull
    DefectService defectService;

//    @GetMapping(value = "/defects/picture/{id}", produces = MediaType.IMAGE_JPEG_VALUE)
//    public ResponseEntity<byte[]> getImageWithMediaType(@PathVariable(name = "id") int id) throws IOException {
//        String path = pictureService.read(id);
//        return new ResponseEntity<>(path.getBytes(), HttpStatus.OK);
//    }

    @GetMapping(value = "/defects/picture/{id}")
    public ResponseEntity<?> read(@PathVariable(name = "id") int id) {
        Resource resource = defectService.getFile(id);
        return ResponseEntity.ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(resource);
    }
}
