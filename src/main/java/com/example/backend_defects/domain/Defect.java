package com.example.backend_defects.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "defects")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Defect {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "text")
    private String text;

    @Column(name = "picture")
    private String picture;

}
