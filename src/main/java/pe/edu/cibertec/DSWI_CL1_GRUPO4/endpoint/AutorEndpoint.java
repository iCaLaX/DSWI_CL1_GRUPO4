package pe.edu.cibertec.DSWI_CL1_GRUPO4.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.DSWI_CL1_GRUPO4.model.Autor;
import pe.edu.cibertec.DSWI_CL1_GRUPO4.service.AutorService;
import pe.edu.cibertec.ws.objects.*;

import java.util.Optional;

@Endpoint
public class AutorEndpoint {
    private static final String NAMESPACE_URI = "http://www.cibertec.edu.pe/ws/objects";

    @Autowired
    private AutorService autorService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAutorRequest")
    @ResponsePayload
    public GetAutorResponse getAutor(@RequestPayload GetAutorRequest request) {
        GetAutorResponse response = new GetAutorResponse();
        Optional<Autor> autor = autorService.findById(request.getId());
        autor.ifPresent(response::setAutor);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "createAutorRequest")
    @ResponsePayload
    public CreateAutorResponse createAutor(@RequestPayload CreateAutorRequest request) {
        Autor autor = new Autor();
        autor.setNomAutor(request.getNomAutor());
        autor.setApeAutor(request.getApeAutor());
        autor.setFechNacAutor(request.getFechNacAutor());

        Autor createdAutor = autorService.save(autor);

        CreateAutorResponse response = new CreateAutorResponse();
        response.setAutor(createdAutor);
        return response;
    }

    // Similar methods for update and delete
}