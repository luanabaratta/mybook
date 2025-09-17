package com.app.mybook.domain.book;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record BookRequestDTO(@NotBlank String title, @NotNull Integer price) {
}
