package pe.edu.cibertec.DSWI_CL1_GRUPO4.service;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ValidacionesService {

    public boolean esBisiesto(int año) {
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public String determinarAprobacion(double nota1, double nota2, double nota3) {
        double promedio = (nota1 + nota2 + nota3) / 3;
        if (promedio >= 70) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }

    public boolean esNumeroPerfecto(int numero) {
        int suma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        return suma == numero;
    }

    public List<Integer> obtenerNumerosPerfectos(int limite) {
        List<Integer> numerosPerfectos = new ArrayList<>();
        for (int i = 1; i <= limite; i++) {
            if (esNumeroPerfecto(i)) {
                numerosPerfectos.add(i);
            }
        }
        return numerosPerfectos;
    }

    public String determinarPositivoAlcoholemia(String indicador, double tasa) {
        double tasaMaxima;
        switch (indicador) {
            case "C":
                tasaMaxima = 0.3;
                break;
            case "A":
                tasaMaxima = 0.3;
                break;
            case "T":
                tasaMaxima = 0.5;
                break;
            case "M":
                tasaMaxima = 0.3;
                break;
            default:
                throw new IllegalArgumentException("Indicador de vehículo no válido");
        }
        if (tasa > tasaMaxima) {
            return "Positivo";
        } else {
            return "Negativo";
        }
    }
}
