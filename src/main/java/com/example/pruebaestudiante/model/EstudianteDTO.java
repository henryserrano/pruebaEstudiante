package com.example.pruebaestudiante.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class EstudianteDTO {
    private Long eid;
    private String nombre;
    private String especialidad;
    private String grado;
}
