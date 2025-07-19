package tn.esprit.spring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@ActiveProfiles("test")
@TestPropertySource(locations = "classpath:application-test.properties")
public class BlocServiceIntegrationTest {

    @Test
    void contextLoads() {
        // This test will verify that the Spring context loads successfully
    }

    @Test
    void testApplicationStarts() {
        // Basic test to ensure application can start
        // This will use the H2 in-memory database
    }
} 