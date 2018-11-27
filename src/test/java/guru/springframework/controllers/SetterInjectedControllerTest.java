package guru.springframework.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import guru.springframework.jokes.controllers.SetterInjectedController;
import guru.springframework.jokes.services.GreetingServiceImpl;

public final class SetterInjectedControllerTest
{
    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp()
        throws Exception
    {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting()
    {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, setterInjectedController.sayHello());
    }
}