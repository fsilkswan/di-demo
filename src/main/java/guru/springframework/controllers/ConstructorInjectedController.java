package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.services.GreetingService;

@Controller
public class ConstructorInjectedController
{
    private final GreetingService greetingService;

    @Autowired
    public ConstructorInjectedController(final GreetingService greetingService)
    {
        this.greetingService = greetingService;
    }

    public String sayHello()
    {
        return greetingService.sayGreeting();
    }
}