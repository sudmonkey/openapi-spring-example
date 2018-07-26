package com.monkeysuds.service.petstore.api;

import com.monkeysuds.service.petstore.model.Error;
import com.monkeysuds.service.petstore.model.Pets;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

/**
 * A delegate to be called by the {@link PetsApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-07-26T21:23:16.657+01:00[Europe/London]")

public interface PetsApiDelegate {

    /**
     * @see PetsApi#createPets
     */
    ResponseEntity<Void> createPets();

    /**
     * @see PetsApi#listPets
     */
    ResponseEntity<Pets> listPets( Integer  limit);

    /**
     * @see PetsApi#showPetById
     */
    ResponseEntity<Pets> showPetById( String  petId);

}
