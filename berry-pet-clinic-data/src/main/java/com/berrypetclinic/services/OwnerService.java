package com.berrypetclinic.services;

import com.berrypetclinic.models.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner> {

    Owner findByLastName(String lastName);

    Owner findByLastNameWithPets(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
