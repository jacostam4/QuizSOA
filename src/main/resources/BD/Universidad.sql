-- Crear la tabla de Estudiantes
CREATE TABLE Estudiantes (
    ID_Estudiante SERIAL PRIMARY KEY,
    Nombre VARCHAR(100) NOT NULL,
    Apellido VARCHAR(100) NOT NULL,
    Fecha_Nacimiento DATE,
    Direccion VARCHAR(255),
    Telefono VARCHAR(20),
    Email VARCHAR(100) UNIQUE
);

-- Crear la tabla de Profesores
CREATE TABLE Profesores (
    ID_Profesor SERIAL PRIMARY KEY,
    Nombre VARCHAR(100) NOT NULL,
    Apellido VARCHAR(100) NOT NULL,
    Departamento VARCHAR(100),
    Email VARCHAR(100) UNIQUE
);

-- Crear la tabla de Cursos
CREATE TABLE Cursos (
    ID_Curso SERIAL PRIMARY KEY,
    Nombre_Curso VARCHAR(100) NOT NULL,
    Creditos INT,
    ID_Profesor INT,
    FOREIGN KEY (ID_Profesor) REFERENCES Profesores(ID_Profesor)
);

-- Crear la tabla de Inscripciones
CREATE TABLE Inscripciones (
    ID_Inscripcion SERIAL PRIMARY KEY,
    ID_Estudiante INT,
    ID_Curso INT,
    Fecha_Inscripcion DATE,
    FOREIGN KEY (ID_Estudiante) REFERENCES Estudiantes(ID_Estudiante),
    FOREIGN KEY (ID_Curso) REFERENCES Cursos(ID_Curso)
);

-- Crear la tabla de Calificaciones
CREATE TABLE Calificaciones (
    ID_Calificacion SERIAL PRIMARY KEY,
    ID_Inscripcion INT,
    Nota DECIMAL(4, 2),
    Fecha_Registro DATE,
    FOREIGN KEY (ID_Inscripcion) REFERENCES Inscripciones(ID_Inscripcion)
);