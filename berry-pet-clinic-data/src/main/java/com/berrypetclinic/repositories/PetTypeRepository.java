package com.berrypetclinic.repositories;

import com.berrypetclinic.models.PetType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetTypeRepository extends JpaRepository<PetType, Long> {
}
