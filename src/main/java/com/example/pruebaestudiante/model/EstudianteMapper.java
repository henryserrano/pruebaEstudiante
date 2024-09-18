package com.example.pruebaestudiante.model;


import org.mapstruct.Mapper;

@Mapper
public interface EstudianteMapper {

    EstudianteDTO toDto(Estudiante estudiante);
    Estudiante toEntity(EstudianteDTO estudianteDTO);
}
