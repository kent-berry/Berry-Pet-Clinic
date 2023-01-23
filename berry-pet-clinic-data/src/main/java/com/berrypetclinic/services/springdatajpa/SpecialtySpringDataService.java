package com.berrypetclinic.services.springdatajpa;

import com.berrypetclinic.models.Specialty;
import com.berrypetclinic.repositories.SpecialtyRepository;
import com.berrypetclinic.services.SpecialtyService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Primary
@Profile("jpa")
@Transactional
public class SpecialtySpringDataService extends AbstractSpringDataService<Specialty, SpecialtyRepository> implements SpecialtyService {
    public SpecialtySpringDataService(SpecialtyRepository repository) {
        super(repository);
    }
}
