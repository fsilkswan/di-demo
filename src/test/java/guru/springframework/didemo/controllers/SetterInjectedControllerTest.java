package guru.springframework.didemo.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import guru.springframework.didemo.controllers.SetterInjectedController;
import guru.springframework.didemo.services.GreetingServiceImpl;

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