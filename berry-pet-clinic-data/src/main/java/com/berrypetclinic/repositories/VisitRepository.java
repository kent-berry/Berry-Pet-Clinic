package com.berrypetclinic.repositories;

import com.berrypetclinic.models.Visit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitRepository extends JpaRepository<Visit, Long> {
}
