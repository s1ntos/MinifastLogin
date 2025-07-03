package com.minifast.login.controller;

import com.minifast.login.model.Food;
import com.minifast.login.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/foods")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @PostMapping
    public ResponseEntity<Food> salvar(@RequestBody Food food) {
        return ResponseEntity.ok(foodService.salvar(food));
    }

    @GetMapping
    public ResponseEntity<List<Food>> listarTodos() {
        return ResponseEntity.ok(foodService.listar());
    }

    @GetMapping("/buscar")
    public ResponseEntity<List<Food>> buscarPorNome(@RequestBody String nome) {
        return ResponseEntity.ok(foodService.listarPorNome(nome));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Food> buscarPorId(@PathVariable Long id) {
        Food food = foodService.listarPorId(id);
        return food != null ? ResponseEntity.ok(food) : ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Food> atualizar(@PathVariable Long id, @RequestBody Food food) {
        Food atualizado = foodService.atualizar(id, food);
        return atualizado != null ? ResponseEntity.ok(atualizado) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        foodService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
