package com.example.backend_defects.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import lombok.Value;


@Value
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class DefectResponse {
    public String nameDefect;
    public String description;
    public String reasons;
    public String solutions;
    public String picture;
}
