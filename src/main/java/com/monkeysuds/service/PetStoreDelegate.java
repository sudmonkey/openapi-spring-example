package com.monkeysuds.service;

import com.monkeysuds.service.petstore.api.PetsApiDelegate;
import com.monkeysuds.service.petstore.model.Pets;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PetStoreDelegate implements PetsApiDelegate {
    @Override
    public ResponseEntity<Void> createPets() {
        return null;
    }

    @Override
    public ResponseEntity<Pets> listPets(Integer limit) {
        return null;
    }

    @Override
    public ResponseEntity<Pets> showPetById(String petId) {
        return null;
    }
}
