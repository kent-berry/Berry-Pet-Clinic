package com.berrypetclinic.services.springdatajpa;


import com.berrypetclinic.models.Owner;
import com.berrypetclinic.repositories.OwnerRepository;
import com.berrypetclinic.services.OwnerService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Primary
@Profile("jpa")
@Transactional
public class OwnerSpringDataService extends AbstractSpringDataService<Owner, OwnerRepository> implements OwnerService {

    public OwnerSpringDataService(OwnerRepository repository) {
        super(repository);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return repository.findByLastName(lastName);
    }

    @Override
    public Owner findByLastNameWithPets(String lastName) {
        return repository.findByLastNameWithPets(lastName);
    }

    @Override
    public List<Owner> findAllByLastNameLike(String lastName) {
        return repository.findAllByLastNameLike(lastName);
    }

}
