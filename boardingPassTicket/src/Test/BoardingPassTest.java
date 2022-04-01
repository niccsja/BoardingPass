import org.junit.Rule;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;

import static org.junit.jupiter.api.Assertions.*;

import java.io.*;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class BoardingPassTest {

    BoardingPass boardingPassTicket;

    @BeforeEach
    void setUp() throws IOException {
        boardingPassTicket = new BoardingPass();
    }

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Rule
    public ExpectedException thrown = ExpectedException.none();


    @Test
    void setAge() {
        boardingPassTicket.setAge(24);
        assertEquals(24, boardingPassTicket.getAge(), "Set age not working correctly");
    }

    @Test
    void setDate() {
        boardingPassTicket.setDate("01/01/2001");
        assertEquals("01/01/2001", boardingPassTicket.getDate(), "set date not working correctly");
    }

    @Test
    void setDepartureTime() {
        boardingPassTicket.setDepartTime("09:15 am");
        assertEquals("09:15 am", boardingPassTicket.getDepartTime(), "set departure not working correctly");
    }

    @Test
    void setDestination() {
        boardingPassTicket.setDestination("Atlanta, GA");
        assertEquals("Atlanta, GA", boardingPassTicket.getDestination(), "set destination not working properly");
    }

    @Test
    void setEmail() {
        boardingPassTicket.setEmail("johndoe@gmail.com");
        assertEquals("johndoe@gmail.com", boardingPassTicket.getEmail(), "set email not working correctly");
    }

    @Test
    void setEta() {
        boardingPassTicket.setEta(2);
        assertEquals(2, boardingPassTicket.getEta(), "Set eta nor working correctly");
    }

    @Test
    void setFinalPrice() {
        boardingPassTicket.setFinalPrice(204);
        assertEquals(204, boardingPassTicket.getFinalPrice(), "set final price not working correctly");
    }

    @Test
    void setGender() {
        boardingPassTicket.setGender("M");
        assertEquals("M", boardingPassTicket.getGender(), "set gender not working correctly");
    }

    @Test
    void setName() {
        boardingPassTicket.setName("Mark");
        assertEquals("Mark", boardingPassTicket.getName(), "Setter not working");
    }

    @Test
    void setOrigin() {
        boardingPassTicket.setOrigin("Cambridge, MA");
        assertEquals("Cambridge, MA", boardingPassTicket.getOrigin(), "set origin not working correctly");
    }

    @Test
    void setPassNumber() {
        boardingPassTicket.setPassNumber(2080);
        assertEquals(2080, boardingPassTicket.getPassNumber(), "set PassNumber not working correctly");
    }

    @Test
    void setPhoneNumber() {
        boardingPassTicket.setPhoneNumber("301-234-8987");
        assertEquals("301-234-8987", boardingPassTicket.getPhoneNumber(), "set phone number not working correctly");
    }
}