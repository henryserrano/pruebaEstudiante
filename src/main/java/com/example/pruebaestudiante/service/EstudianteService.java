package com.example.pruebaestudiante.service;


import com.example.pruebaestudiante.exception.EstudianteNotFoundException;
import com.example.pruebaestudiante.model.Estudiante;
import com.example.pruebaestudiante.model.EstudianteDTO;
import com.example.pruebaestudiante.model.EstudianteMapper;
import com.example.pruebaestudiante.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    @Autowired
    private EstudianteMapper estudianteMapper;

    public List<EstudianteDTO> getAllEstudiantes() {
        return estudianteRepository.findAll().stream()
                .map(estudianteMapper::toDto)
                .collect(Collectors.toList());
    }

    public EstudianteDTO getEstudianteById(Long eid) {
        return estudianteRepository.findById(eid)
                .map(estudianteMapper::toDto)
                .orElseThrow(() -> new EstudianteNotFoundException(eid));
    }

    public EstudianteDTO saveEstudiante(EstudianteDTO estudianteDTO) {
        Estudiante estudiante = estudianteMapper.toEntity(estudianteDTO);
        System.out.println(estudiante);
        return estudianteMapper.toDto(estudianteRepository.save(estudiante));
    }

    public void deleteEstudiante(Long eid) {
        if (!estudianteRepository.existsById(eid)) {
            throw new EstudianteNotFoundException(eid);
        }
        estudianteRepository.deleteById(eid);
    }
}
