package com.banter.repository;

import com.banter.model.Institution;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface InstitutionRepository extends CrudRepository<Institution, String> {

    List<Institution> findAll();
}
