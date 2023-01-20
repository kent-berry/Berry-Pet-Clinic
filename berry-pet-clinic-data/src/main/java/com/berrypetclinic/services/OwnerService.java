package com.berrypetclinic.services;

import com.berrypetclinic.models.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner>{

    Owner findByLastName(String lastName);
}
