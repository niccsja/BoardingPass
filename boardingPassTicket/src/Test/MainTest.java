import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;
import java.io.InputStream;
import java.io.ByteArrayInputStream;

public class MainTest {
    Main boardingPass;
    Scanner scanner = new Scanner(System.in);
    @BeforeEach
    void setUp() {
        boardingPass = new Main();
    }
    @org.junit.jupiter.api.Test
    void main() {
    }


    @org.junit.jupiter.api.Test
    void setName() {
        boardingPass.setName("Mark");
        assertEquals("Mark", boardingPass.getName(), "Setter not working");
    }


    @org.junit.jupiter.api.Test
    void setEmail() {
        boardingPass.setEmail("johndoe@gmail.com");
        assertEquals("johndoe@gmail.com", boardingPass.getEmail(), "set email not working correctly");
    }


    @org.junit.jupiter.api.Test
    void setPhoneNumber() {
        boardingPass.setPhoneNumber("301-234-8987");
        assertEquals("301-234-8987", boardingPass.getPhoneNumber(), "set phone number not working correctly");
    }

    @org.junit.jupiter.api.Test
    void setGender() {
        boardingPass.setGender("M");
        assertEquals("M", boardingPass.getGender(), "set geneder not working correctly");
    }


    @org.junit.jupiter.api.Test
    void setAge() {
        boardingPass.setAge("24");
        assertEquals("24", boardingPass.getAge(), "Set age not working correctly");
    }


    @org.junit.jupiter.api.Test
    void setDate() {
        boardingPass.setDate("01/01/2001");
        assertEquals("01/01/2001", boardingPass.getDate(), "set date not working correctly");
    }


    @org.junit.jupiter.api.Test
    void setOrigin() {
        boardingPass.setOrigin("Cambridge, MA");
        assertEquals("Cambridge, MA", boardingPass.getOrigin(), "set origin not working correctly");
    }

    @org.junit.jupiter.api.Test
    void setDestination() {
        boardingPass.setDestination("Atlanta, GA");
        assertEquals("Atlanta, GA", boardingPass.getDestination(), "set destination not working properly");
    }

    @org.junit.jupiter.api.Test
    void setDepartureTime() {
        boardingPass.setDepartureTime("09:15 am");
        assertEquals("09:15 am", boardingPass.getDepartureTime(), "set departure not working correctly");
    }


}