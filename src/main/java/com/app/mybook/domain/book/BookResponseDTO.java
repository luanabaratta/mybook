package com.app.mybook.domain.book;

public record BookResponseDTO (String id, String title, Integer price){
    public BookResponseDTO(Book book) {
        this(book.getId(), book.getTitle(), book.getPrice());
    }
}
