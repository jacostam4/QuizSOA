package com.universidad.quiz.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.universidad.quiz.model.EstudiantesModel;
import com.universidad.quiz.repository.EstudiantesRepository;

@Service
public class EstudiantesService {
    private final EstudiantesRepository estudiantesRepository;

    public EstudiantesService(EstudiantesRepository estudiantesRepository) {
        this.estudiantesRepository = estudiantesRepository;
    }

    public EstudiantesModel register(EstudiantesModel estudiante) {
        return estudiantesRepository.save(estudiante);
    }

    public Optional<EstudiantesModel> findByEmail(String email) {
        return estudiantesRepository.findByEmail(email);
    }

    public List<EstudiantesModel> getAllEstudiantes() {
        return estudiantesRepository.findAll();
    }
}
