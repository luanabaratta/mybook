package com.app.mybook.domain.user;

public record RegisterDTO(String login, String password, UserRole role) {
}
