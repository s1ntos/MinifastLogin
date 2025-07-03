package com.minifast.login.repository;

import com.minifast.login.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoodRepository extends JpaRepository<Food, Long> {
    List<Food> findByNomeContainingIgnoreCase(String nome);

    List<Food> findByid(Long id);
}
