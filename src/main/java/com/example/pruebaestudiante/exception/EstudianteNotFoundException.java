package com.example.pruebaestudiante.exception;

public class EstudianteNotFoundException extends RuntimeException {

    public EstudianteNotFoundException(Long id) {
        super("No se pudo encontrar el estudiante con ID: " + id);
    }

    public EstudianteNotFoundException(String mensaje) {
        super(mensaje);
    }
}
