package com.universidad.quiz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.universidad.quiz.model.EstudiantesModel;
import com.universidad.quiz.service.EstudiantesService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/estudiante")
public class EstudiantesController {
    private final EstudiantesService estudiantesService;

    public EstudiantesController(EstudiantesService estudiantesService) {
        this.estudiantesService = estudiantesService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<EstudiantesModel>> getAllEstudiantes() {
        return ResponseEntity.ok(estudiantesService.getAllEstudiantes());
    }

    @PostMapping("/crear")
    public ResponseEntity<EstudiantesModel> register(@RequestBody EstudiantesModel estudiantesModel) {
        return ResponseEntity.ok(estudiantesService.register(estudiantesModel));
    }

}
