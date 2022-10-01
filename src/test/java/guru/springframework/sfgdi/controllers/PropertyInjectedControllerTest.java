package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.PropertyGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setUp() {

        propertyInjectedController = new PropertyInjectedController();

        propertyInjectedController.greetingService = new PropertyGreetingService();
    }

    @Test
    void getGreetings() {
        System.out.println(propertyInjectedController.getGreetings());
    }
}