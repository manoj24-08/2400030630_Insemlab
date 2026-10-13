package com.example.demo;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class TouristService {

    @Autowired
    private TouristRepository repository;

    public Tourist updateTourist(Long id, Tourist tourist) {

        Tourist existing = repository.findById(id)
                .orElseThrow(() ->
                    new RuntimeException("Tourist not found"));

        existing.setName(tourist.getName());
        existing.setDestination(tourist.getDestination());
        existing.setContact(tourist.getContact());

        return repository.save(existing);
    }
}