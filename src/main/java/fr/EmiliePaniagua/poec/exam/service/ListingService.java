package fr.EmiliePaniagua.poec.exam.service;

import fr.EmiliePaniagua.poec.exam.entity.Listing;
import fr.EmiliePaniagua.poec.exam.repository.ListingRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ListingService implements DAOServiceInterface<Listing> {

    private ListingRepository listingRepository;
    @Override
    public List<Listing> findAll() {
        return listingRepository.findAll();
    }

    @Override
    public Optional<Listing> findById(Long id) {
        return listingRepository.findById(id);
    }
}