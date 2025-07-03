package com.minifast.login.model;

public record FoodResponseDTO(String id, String name, String preco) {
    public FoodResponseDTO(Food food) {
        this(food.getId().toString(), food.getNome(), food.getPreco());
    }
}
