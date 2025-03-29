package com.universidad.quiz.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Estudiantes")
@Getter @Setter
public class EstudiantesModel {
    /**
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID_Estudiante;

    private String Nombre;
    private String Apellido;
    private String Direccion;
    private Date Fecha_Nacimiento;
    private String Telefono;
    private String Email;

}
