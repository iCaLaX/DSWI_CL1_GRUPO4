package pe.edu.cibertec.DSWI_CL1_GRUPO4.model;

import java.util.*;
import jakarta.persistence.*;
import lombok.*;

@Entity
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAutor;

    @Column(nullable = false, length = 50)
    private String nomAutor;

    @Column(nullable = false, length = 50)
    private String apeAutor;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechNacAutor;

    public Integer getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Integer idAutor) {
        this.idAutor = idAutor;
    }

    public String getNomAutor() {
        return nomAutor;
    }

    public void setNomAutor(String nomAutor) {
        this.nomAutor = nomAutor;
    }

    public String getApeAutor() {
        return apeAutor;
    }

    public void setApeAutor(String apeAutor) {
        this.apeAutor = apeAutor;
    }

    public Date getFechNacAutor() {
        return fechNacAutor;
    }

    public void setFechNacAutor(Date fechNacAutor) {
        this.fechNacAutor = fechNacAutor;
    }
}
