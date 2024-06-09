CREATE DATABASE BDEvaluacion;

USE BDEvaluacion;

CREATE TABLE usuario (
    idusuario INT auto_increment NOT NULL,
    nomusuario varchar(100) NULL,
    email varchar(200) NULL,
    password varchar(300) NULL,
    nombres varchar(100) NULL,
    apellidos varchar(100) NULL,
    activo BOOL NULL,
    CONSTRAINT users_pk PRIMARY KEY (idusuario)
);

CREATE TABLE rol (
    idrol INT auto_increment NOT NULL,
    nomrol varchar(300) NULL,
    CONSTRAINT roles_pk PRIMARY KEY (idrol)
);

CREATE TABLE usuario_rol (
    idusuario INT NOT NULL,
    idrol INT NOT NULL,
    CONSTRAINT user_role_pk PRIMARY KEY (idusuario, idrol),
    CONSTRAINT user_role_FK FOREIGN KEY (idusuario) REFERENCES usuario(idusuario),
    CONSTRAINT user_role_FK_1 FOREIGN KEY (idrol) REFERENCES rol(idrol)
);

CREATE TABLE Autor (
    IdAutor INT NOT NULL AUTO_INCREMENT,
    NomAutor VARCHAR(50) NOT NULL,
    ApeAutor VARCHAR(50) NOT NULL,
    FechNacAutor DATE NOT NULL,
    PRIMARY KEY (IdAutor)
);

CREATE TABLE Publicacion (
    IdPublicacion INT NOT NULL AUTO_INCREMENT,
    Titulo VARCHAR(250) NOT NULL,
    Resumen VARCHAR(250) NOT NULL,
    FechPublicacion DATE NOT NULL,
    IdAutor INT NOT NULL,
    PRIMARY KEY (IdPublicacion),
    FOREIGN KEY (IdAutor) REFERENCES Autor(IdAutor)
);

-- Insert 8 records into Autor
INSERT INTO Autor (NomAutor, ApeAutor, FechNacAutor) VALUES 
('Autor1', 'Apellido1', '1970-01-01'),
('Autor2', 'Apellido2', '1971-02-02'),
('Autor3', 'Apellido3', '1972-03-03'),
('Autor4', 'Apellido4', '1973-04-04'),
('Autor5', 'Apellido5', '1974-05-05'),
('Autor6', 'Apellido6', '1975-06-06'),
('Autor7', 'Apellido7', '1976-07-07'),
('Autor8', 'Apellido8', '1977-08-08');

-- Insert 8 records into Publicacion
INSERT INTO Publicacion (Titulo, Resumen, FechPublicacion, IdAutor) VALUES 
('Publicacion1', 'Resumen1', '2001-01-01', 1),
('Publicacion2', 'Resumen2', '2002-02-02', 2),
('Publicacion3', 'Resumen3', '2003-03-03', 3),
('Publicacion4', 'Resumen4', '2004-04-04', 4),
('Publicacion5', 'Resumen5', '2005-05-05', 5),
('Publicacion6', 'Resumen6', '2006-06-06', 6),
('Publicacion7', 'Resumen7', '2007-07-07', 7),
('Publicacion8', 'Resumen8', '2008-08-08', 8);
