package org.example;

public interface Library {
    String addClient(String firstName, String lastName, String email);
    void removeClient(String clientId);
    String addBook(String title, String author);
    void removeBook(String bookId);
    void rentBookToClient(String clientId, String bookId);
}