package com.example.pruebaestudiante.configuration;

import com.example.pruebaestudiante.model.EstudianteMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    @Bean
    public EstudianteMapper estudianteMapper() {
        return Mappers.getMapper(EstudianteMapper.class);
    }
}
