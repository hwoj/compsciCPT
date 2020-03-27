package com.example.SMCSLearn;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TutorRepository extends CrudRepository<Tutor, Long> {

    List<Tutor> findByLastName(String lastName);

    Tutor findById(long id);
}
