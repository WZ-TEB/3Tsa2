package org.example;

import java.util.HashMap;

public class LibraryImpl implements Library {

    HashMap<String, Client> clients = new HashMap<>();
    HashMap<String, Book> books = new HashMap<>();
    HashMap<String, String> booksOfClients = new HashMap<>();

    @Override
    public String addClient(String firstName, String lastName, String email) {
        Client client = new Client(firstName, lastName, email);
        clients.put(client.getClientId(), client);
        return client.getClientId();
    }

    @Override
    public void removeClient(String clientId) {
        clients.remove(clientId);
    }

    public void activatePremiumStatus(String clientId) {
        Client client = clients.get(clientId);
        client.setPremiumStatus(true);
    }

    @Override
    public String addBook(String title, String author) {
        Book book = new Book(title, author);
        books.put(book.getBookId(), book);
        return book.getBookId();
    }

    @Override
    public void removeBook(String bookId) {
        books.remove(bookId);
    }

    @Override
    public void rentBookToClient(String clientId, String bookId) {
        booksOfClients.put(bookId, clientId);
    }
}
