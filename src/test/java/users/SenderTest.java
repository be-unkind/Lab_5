package users;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SenderTest {

    Sender sender1 = new Sender();
    Sender sender2 = new Sender();

    @BeforeEach
    void setUp() {
        sender2.setStatus("active");
    }

    @Test
    void getStatus() {
        assertEquals("active", sender2.getStatus());
    }

    @Test
    void getId() {
        assertEquals(1, sender2.getId() - sender1.getId());
    }

}