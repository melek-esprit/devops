package tn.esprit.spring;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BlocServiceTest {

    @BeforeAll
    void before() {
        // setup before all tests
    }

    @AfterAll
    void after() {
        // cleanup after all tests
    }

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
