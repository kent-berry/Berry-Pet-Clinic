package com.berrypetclinic.services.springdatajpa;

import com.berrypetclinic.models.Vet;
import com.berrypetclinic.repositories.VetRepository;
import com.berrypetclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Profile("jpa")
@Transactional
public class VetSpringDataService extends AbstractSpringDataService<Vet, VetRepository> implements VetService {
    public VetSpringDataService(VetRepository repository) {
        super(repository);
    }
}
