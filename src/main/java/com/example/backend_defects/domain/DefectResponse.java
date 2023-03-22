package com.example.backend_defects.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Value;


@Value
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class DefectResponse {

    public Integer id;

    public String text;

    public String picture;
}
