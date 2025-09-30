package org.example;

public class LibraryImpl implements Library {



    @Override
    public void addClient(String firstName, String lastName, String email) {
        Client client = new Client(firstName, lastName, email);

    }

    @Override
    public void removeClient() {

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
