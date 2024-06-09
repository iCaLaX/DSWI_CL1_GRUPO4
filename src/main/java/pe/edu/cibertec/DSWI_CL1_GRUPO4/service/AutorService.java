package pe.edu.cibertec.DSWI_CL1_GRUPO4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWI_CL1_GRUPO4.model.Autor;
import pe.edu.cibertec.DSWI_CL1_GRUPO4.repository.AutorRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService {
    @Autowired
    private AutorRepository autorRepository;

    public List<Autor> findAll() {
        return autorRepository.findAll();
    }

    public Optional<Autor> findById(Integer id) {
        return autorRepository.findById(id);
    }

    public Autor save(Autor autor) {
        return autorRepository.save(autor);
    }

    public void deleteById(Integer id) {
        autorRepository.deleteById(id);
    }
}