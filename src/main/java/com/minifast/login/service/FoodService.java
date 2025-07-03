package com.minifast.login.service;


import com.minifast.login.model.Food;
import com.minifast.login.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;

    public Food salvar(Food food) {
        return foodRepository.save(food);
    }

    public List<Food> listar() {
        return foodRepository.findAll();
    }

    public List<Food> listarPorNome(String nome) {
        return foodRepository.findByNomeContainingIgnoreCase(nome);
    }

    public Food listarPorId(Long id) {
        return foodRepository.findById(id).orElse(null);
    }

    public Food atualizar(Long id, Food foodAtualizado) {
        Optional<Food> optional = foodRepository.findById(id);
        if (optional.isPresent()) {
            Food existente = optional.get();
            existente.setNome(foodAtualizado.getNome());
            existente.setPreco(foodAtualizado.getPreco());
            existente.setDescricao(foodAtualizado.getDescricao());
            return foodRepository.save(existente);
        }
        return null;
    }

    public void deletar(Long id) {
        foodRepository.deleteById(id);
    }
}
