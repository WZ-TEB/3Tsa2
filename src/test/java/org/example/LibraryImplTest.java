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
        //given  -> tutaj są dane potrzebne do testu
        //when  -> tutaj wywołuje się metodę testowaną
        testLibrary.addClient("testFirstName", "testLastName", "testEmail");
        //then  -> tutaj piszemy asserta, który ma sprawdzić wynik testu przewidywany przez nas
        assertEquals(1, testLibrary.clients.size());
    }

    @Test
    void removeClient() {
        //given
        String testClientId = testLibrary.addClient("testFirstName", "testLastName", "testEmail");
        //when
        testLibrary.removeClient(testClientId);
        //then
        assertEquals(0, testLibrary.clients.size());
    }

    @Test
    void addBook() {
        //given
        //when
        testLibrary.addBook("testTitle", "testAuthor");
        //then
        assertEquals(1, testLibrary.books.size());
    }

    @Test
    void removeBook() {
        //given
        String testBookId = testLibrary.addBook("testTitle", "testAuthor");
        //when
        testLibrary.removeBook(testBookId);
        //then
        assertEquals(0, testLibrary.books.size());
    }

    @Test
    void rentBookToClient() {
        //given
        String testClientId  = testLibrary.addClient("testFirstName", "testLastName", "testEmail");
        String testBookId = testLibrary.addBook("testTitle", "testAuthor");
        //when
        testLibrary.rentBookToClient(testClientId, testBookId);
        //then
        assertEquals(testClientId, testLibrary.booksOfClients.get(testBookId));
    }

    @Test
    void activatePremiumStatus() {
        //given

        //when

        //then

    }
}