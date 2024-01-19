package fr.EmiliePaniagua.poec.exam.restController;


import com.fasterxml.jackson.annotation.JsonView;
import fr.EmiliePaniagua.poec.exam.JsonViews.JsonViews;
import fr.EmiliePaniagua.poec.exam.entity.User;
import fr.EmiliePaniagua.poec.exam.repository.UserRepository;
import fr.EmiliePaniagua.poec.exam.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api/lacentraleish/user")
public class UserRestController {

    private UserService userService;

    @GetMapping
    @JsonView(JsonViews.UserShowView.class)
    public List<User> list() {
        return this.userService.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<User> findById(@PathVariable Long id) {
            return this.userService.findById(id);


    }
}