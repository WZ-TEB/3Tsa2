package org.example;

import java.util.HashMap;

public class LibraryImpl implements Library {

    HashMap<String, Client> clients = new HashMap<>();

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
    public void addBook() {

    }

    @Override
    public void removeBook() {

    }

    @Override
    public void rentBookToClient() {

    }
}
