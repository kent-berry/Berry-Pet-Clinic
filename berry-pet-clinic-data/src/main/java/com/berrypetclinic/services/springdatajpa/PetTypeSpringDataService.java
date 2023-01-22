package com.berrypetclinic.services.springdatajpa;

import com.berrypetclinic.models.PetType;
import com.berrypetclinic.repositories.PetTypeRepository;
import com.berrypetclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Profile("jpa")
@Transactional
public class PetTypeSpringDataService extends AbstractSpringDataService<PetType, PetTypeRepository> implements PetTypeService {
    public PetTypeSpringDataService(PetTypeRepository repository) {
        super(repository);
    }
}
