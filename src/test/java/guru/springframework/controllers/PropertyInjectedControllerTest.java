package guru.springframework.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import guru.springframework.services.GreetingServiceImpl;

public final class PropertyInjectedControllerTest
{
    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp()
        throws Exception
    {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting()
    {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, propertyInjectedController.sayHello());
    }
}