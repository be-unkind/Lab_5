package users;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReceiverTest {

    Receiver receiver1 = new Receiver();
    Receiver receiver2 = new Receiver();

    @BeforeEach
    void setUp() {
        receiver2.setStatus("active");
    }

    @Test
    void getStatus() {
        assertEquals("active", receiver2.getStatus());
    }

    @Test
    void getId() {
        assertEquals(1, receiver2.getId() - receiver1.getId());
    }

}