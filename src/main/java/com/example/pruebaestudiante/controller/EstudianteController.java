package com.example.pruebaestudiante.controller;


import com.example.pruebaestudiante.service.EstudianteService;
import com.example.pruebaestudiante.model.EstudianteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estudiantes")
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    // Obtener todos los estudiantes
    @GetMapping
    public ResponseEntity<List<EstudianteDTO>> getAllEstudiantes() {
        List<EstudianteDTO> estudiantes = estudianteService.getAllEstudiantes();
        return ResponseEntity.ok(estudiantes);
    }

    // Obtener estudiante por ID
    @GetMapping("/{eid}")
    public ResponseEntity<EstudianteDTO> getEstudianteById(@PathVariable Long eid) {
        EstudianteDTO estudiante = estudianteService.getEstudianteById(eid);
        return ResponseEntity.ok(estudiante);
    }

    // Crear un nuevo estudiante
    @PostMapping
    public ResponseEntity<EstudianteDTO> createEstudiante(@RequestBody EstudianteDTO estudianteDTO) {
        EstudianteDTO nuevoEstudiante = estudianteService.saveEstudiante(estudianteDTO);
        return new ResponseEntity<>(nuevoEstudiante, HttpStatus.CREATED);
    }

    // Actualizar estudiante existente
    @PutMapping("/{eid}")
    public ResponseEntity<EstudianteDTO> updateEstudiante(
            @PathVariable Long eid,
            @RequestBody EstudianteDTO estudianteDTO) {
        // Asegurar que el ID del estudiante actualizado sea el correcto
        estudianteDTO.setEid(eid);
        EstudianteDTO estudianteActualizado = estudianteService.saveEstudiante(estudianteDTO);
        return ResponseEntity.ok(estudianteActualizado);
    }

    // Eliminar estudiante por ID
    @DeleteMapping("/{eid}")
    public ResponseEntity<Void> deleteEstudiante(@PathVariable Long eid) {
        estudianteService.deleteEstudiante(eid);
        return ResponseEntity.noContent().build();
    }
}
