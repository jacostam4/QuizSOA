package com.universidad.quiz.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.universidad.quiz.model.EstudiantesModel;

public interface EstudiantesRepository extends JpaRepository<EstudiantesModel, Long> {
    Optional<EstudiantesModel> findByEmail(String email);
}
