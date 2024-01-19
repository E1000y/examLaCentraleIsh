package fr.EmiliePaniagua.poec.exam.restController;

import fr.EmiliePaniagua.poec.exam.entity.Model;
import fr.EmiliePaniagua.poec.exam.service.ModelService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api/lacentraleish/model")
public class ModelRestController {

    private ModelService modelService;

    @GetMapping
    public List<Model> list() {
return this.modelService.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Model> findById(@PathVariable Long id) {
        return modelService.findById(id);
    }

}