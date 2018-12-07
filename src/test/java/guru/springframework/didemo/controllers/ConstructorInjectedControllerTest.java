package guru.springframework.didemo.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import guru.springframework.didemo.controllers.ConstructorInjectedController;
import guru.springframework.didemo.services.GreetingServiceImpl;

public final class ConstructorInjectedControllerTest
{
    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp()
        throws Exception
    {
        constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting()
    {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, constructorInjectedController.sayHello());
    }
}