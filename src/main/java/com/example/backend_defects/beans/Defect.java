package com.example.backend_defects.beans;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "defects")
@Data
public class Defect {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "text")
    private String text;

    @Column(name = "picture")
    private String picture;

}
