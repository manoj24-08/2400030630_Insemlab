package com.example.demo;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api/tourists")
public class TouristController {

    @Autowired
    private TouristService service;

    @PutMapping("/{id}")
    public ResponseEntity<?> updateTourist(
            @PathVariable Long id,
            @RequestBody Tourist tourist,
            @RequestHeader(value = "Token", required = false)
            String token) {

        if (token == null || !token.equals("valid-token")) {
            return ResponseEntity.status(401)
                    .body("Invalid or missing token");
        }

        Tourist updated = service.updateTourist(id, tourist);

        return ResponseEntity.ok(updated);
    }
}