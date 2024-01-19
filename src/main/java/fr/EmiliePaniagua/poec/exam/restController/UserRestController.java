package fr.EmiliePaniagua.poec.exam.restController;

import fr.EmiliePaniagua.poec.exam.DTO.UserPostDTO;
import com.fasterxml.jackson.annotation.JsonView;
import fr.EmiliePaniagua.poec.exam.JsonViews.JsonViews;
import fr.EmiliePaniagua.poec.exam.entity.User;
import fr.EmiliePaniagua.poec.exam.repository.UserRepository;
import fr.EmiliePaniagua.poec.exam.service.UserService;
import io.swagger.v3.core.util.Json;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

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
    @JsonView(JsonViews.UserShowView.class)
    public Optional<User> findById(@PathVariable Long id) {
            return this.userService.findById(id);
    }

    /**
     *  @PostMapping
     *     @JsonView(JsonViews.UserShowView.class)
     *     User create(@Valid @RequestBody UserPostDTO userDTO) {
     *         return userService.create(userDTO);
     *     }
     */
    @PostMapping
    @JsonView(JsonViews.UserShowView.class)
    User create(@Valid @RequestBody UserPostDTO userDTO){
        return userService.create(userDTO);
    }

}