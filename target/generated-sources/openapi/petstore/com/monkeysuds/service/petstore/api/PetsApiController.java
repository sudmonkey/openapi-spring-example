package com.monkeysuds.service.petstore.api;

import com.monkeysuds.service.petstore.model.Error;
import com.monkeysuds.service.petstore.model.Pets;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-07-26T21:23:16.657+01:00[Europe/London]")

@Controller
@RequestMapping("${openapi.swaggerPetstore.base-path:/v1}")
public class PetsApiController implements PetsApi {

    private final PetsApiDelegate delegate;

    public PetsApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) PetsApiDelegate delegate) {
        this.delegate = delegate;
    }

    public ResponseEntity<Void> createPets() {
        return delegate.createPets();
    }

    public ResponseEntity<Pets> listPets(@ApiParam(value = "How many items to return at one time (max 100)")  @RequestParam(value = "limit", required = false) Integer limit) {
        return delegate.listPets(limit);
    }

    public ResponseEntity<Pets> showPetById(@ApiParam(value = "The id of the pet to retrieve",required=true) @PathVariable("petId") String petId) {
        return delegate.showPetById(petId);
    }

}
