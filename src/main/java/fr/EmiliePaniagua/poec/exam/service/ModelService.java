package fr.EmiliePaniagua.poec.exam.service;

import fr.EmiliePaniagua.poec.exam.entity.Model;
import fr.EmiliePaniagua.poec.exam.repository.ModelRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ModelService implements DAOServiceInterface<Model> {
    private ModelRepository modelRepository;
    @Override
    public List<Model> findAll() {
        return modelRepository.findAll();
    }

    @Override
    public Optional<Model> findById(Long id) {
        return modelRepository.findById(id);
    }
}