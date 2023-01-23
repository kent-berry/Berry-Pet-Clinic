package com.berrypetclinic.services.springdatajpa;

import com.berrypetclinic.models.Visit;
import com.berrypetclinic.repositories.VisitRepository;
import com.berrypetclinic.services.VisitService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Primary
@Profile("jpa")
@Transactional
public class VisitSpringDataService extends AbstractSpringDataService<Visit, VisitRepository> implements VisitService {
    public VisitSpringDataService(VisitRepository repository) {
        super(repository);
    }
}
