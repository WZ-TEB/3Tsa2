package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryImplTest {

    LibraryImpl testLibrary = new LibraryImpl();

    @BeforeEach
    void setup() {
        LibraryImpl testLibrary = new LibraryImpl();
    }

    @AfterEach
    void tearDown() {
        testLibrary = null;
    }

    @Test
    void addClient() {
        //given
        //when
        //then
    }

    @Test
    void removeClient() {
        //given
        //when
        //then
    }

    @Test
    void addBook() {

    }

    @Test
    void removeBook() {

    }

    @Test
    void rentBookToClient() {

    }
}