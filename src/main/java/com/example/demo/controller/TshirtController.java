package com.example.demo.controller;

import com.example.demo.entity.Tshirt;
import com.example.demo.repository.TshirtRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tshirts")
@CrossOrigin(origins = "*")
public class TshirtController {

    private final TshirtRepository repository;

    public TshirtController(TshirtRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Tshirt createTshirt(@RequestBody Tshirt tshirt) {
        return repository.save(tshirt);
    }

    @GetMapping
    public List<Tshirt> getAllTshirts() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Tshirt> getTshirtById(@PathVariable Long id) {
        return repository.findById(id);
    }
}
