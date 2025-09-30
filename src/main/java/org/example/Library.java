package org.example;

public interface Library {
    void addClient(String firstName, String lastName, String email);
    void removeClient();
    void addBook();
    void removeBook();
    void rentBookToClient();
}