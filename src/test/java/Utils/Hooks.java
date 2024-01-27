package Utils;

import io.cucumber.java.*;

public class Hooks {
    @BeforeAll
    public static void beforeAll() {
    }

    @Before //scenario dan önce çalışır
    public void before() {
        DriverFactory.setDriver();
    }

    @BeforeStep
    public void beforeStep() {
    }

    @AfterStep
    public void afterStep() {
    }

    @After//scenario dan sonra çalışır
    public void after() {
        DriverFactory.quitDriver();
    }

    @AfterAll
    public static void afterAll() {
    }
}