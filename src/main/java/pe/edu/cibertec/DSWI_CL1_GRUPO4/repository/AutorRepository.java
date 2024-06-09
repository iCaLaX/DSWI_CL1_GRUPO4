package pe.edu.cibertec.DSWI_CL1_GRUPO4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.DSWI_CL1_GRUPO4.model.Autor;

public interface AutorRepository extends JpaRepository<Autor, Integer> {
}