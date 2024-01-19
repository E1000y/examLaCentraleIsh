package fr.EmiliePaniagua.poec.exam.restController;

import com.fasterxml.jackson.annotation.JsonView;
import fr.EmiliePaniagua.poec.exam.JsonViews.JsonViews;
import fr.EmiliePaniagua.poec.exam.entity.Listing;
import fr.EmiliePaniagua.poec.exam.service.ListingService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api/lacentraleish/listing")
public class ListingRestController {

    private ListingService listingService;

    @GetMapping
    @JsonView(JsonViews.ListingListView.class)
    public List<Listing> list() {
        return this.listingService.findAll();
    }

    @GetMapping(path = "/{id}")
    @JsonView(JsonViews.ListingListView.class)
    public Optional<Listing> findById(@PathVariable Long id){
        return listingService.findById(id);

    }

    /**
     * create post listing
     */

}