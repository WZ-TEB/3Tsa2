package org.example;

public interface Library {
    String addClient(String firstName, String lastName, String email);
    void removeClient(String clientId);
    void addBook();
    void removeBook();
    void rentBookToClient();
}