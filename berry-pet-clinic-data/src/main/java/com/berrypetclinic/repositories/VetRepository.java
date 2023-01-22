package com.berrypetclinic.repositories;

import com.berrypetclinic.models.Vet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VetRepository extends JpaRepository<Vet, Long> {
}
