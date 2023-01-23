package com.berrypetclinic.services.springdatajpa;

import com.berrypetclinic.models.Pet;
import com.berrypetclinic.repositories.PetRepository;
import com.berrypetclinic.services.PetService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Primary
@Profile("jpa")
@Transactional
public class PetSpringDataService extends AbstractSpringDataService<Pet, PetRepository> implements PetService {
    public PetSpringDataService(PetRepository repository) {
        super(repository);
    }
}
