package guru.springframework.msscbreweryclient.web.client;

import static org.junit.jupiter.api.Assertions.*;

import guru.springframework.msscbreweryclient.web.model.BeerDto;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BrewaryClientTest {
    @Autowired
    BrewaryClient client;

    @Test
    void getBeerById() {
        BeerDto dto = client.getBeerById(UUID.randomUUID());

        assertNotNull(dto);
    }
}