package fr.EmiliePaniagua.poec.exam.restController;


import com.fasterxml.jackson.annotation.JsonView;
import fr.EmiliePaniagua.poec.exam.entity.Brand;
import fr.EmiliePaniagua.poec.exam.service.BrandService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api/lacentraleish/brand")
public class BrandRestController {

    private BrandService brandService;

    @GetMapping
    public List<Brand> list() {
        return this.brandService.findAll();
    }

    @GetMapping(path = "/{id}")
   // @JsonView(JsonViews.BrandShowView.class)
    public Optional<Brand> findById(@PathVariable Long id){
        return this.brandService.findById(id);
    }

}