package tn.esprit.spring;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BlocServiceMockTest {

    @BeforeEach
    void beforeEach() {
        // setup before each test
    }

    @AfterEach
    void afterEach() {
        // cleanup after each test
    }

    @Order(1)
    @RepeatedTest(4)
    void test() {
        // test logic
        Assertions.assertTrue(true);
    }

    @Order(4)
    @Test
    void test2() {
        // test logic
        Assertions.assertTrue(true);
    }

    @Order(2)
    @Test
    void test3() {
        // test logic
        Assertions.assertTrue(true);
    }

    @Order(3)
    @Test
    void test4() {
        // test logic
        Assertions.assertTrue(true);
    }
}
