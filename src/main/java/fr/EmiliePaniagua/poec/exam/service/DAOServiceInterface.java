package fr.EmiliePaniagua.poec.exam.service;
import fr.EmiliePaniagua.poec.exam.entity.User;

import java.util.List;
import java.util.Optional;

public interface DAOServiceInterface<T> {

    List<T> findAll();


    Optional<T> findById(Long id);
}