package com.minifast.login.model;

import jakarta.validation.constraints.NotBlank;

public record FoodRequestDTO(
        @NotBlank String name,
        @NotBlank String descricao,
        @NotBlank String preco
) {
}
