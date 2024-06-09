package pe.edu.cibertec.DSWI_CL1_GRUPO4.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.DSWI_CL1_GRUPO4.service.ValidacionesService;

import java.util.List;

@RestController
@RequestMapping("/api/validaciones")
public class ValidacionesController {

    @Autowired
    private ValidacionesService validacionesService;

    @GetMapping("/esBisiesto/{año}")
    public boolean esBisiesto(@PathVariable int año) {
        return validacionesService.esBisiesto(año);
    }

    @GetMapping("/aprobar/{nota1}/{nota2}/{nota3}")
    public String determinarAprobacion(@PathVariable double nota1, @PathVariable double nota2, @PathVariable double nota3) {
        return validacionesService.determinarAprobacion(nota1, nota2, nota3);
    }

    @GetMapping("/numerosPerfectos/{limite}")
    public List<Integer> obtenerNumerosPerfectos(@PathVariable int limite) {
        return validacionesService.obtenerNumerosPerfectos(limite);
    }

    @GetMapping("/alcoholemia/{indicador}/{tasa}")
    public String determinarPositivoAlcoholemia(@PathVariable String indicador, @PathVariable double tasa) {
        return validacionesService.determinarPositivoAlcoholemia(indicador, tasa);
    }
}
