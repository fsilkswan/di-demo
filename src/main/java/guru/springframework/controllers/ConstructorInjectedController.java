package guru.springframework.controllers;

import guru.springframework.services.GreetingService;

public class ConstructorInjectedController
{
    private final GreetingService greetingService;

    public ConstructorInjectedController(final GreetingService greetingService)
    {
        this.greetingService = greetingService;
    }

    String sayHello()
    {
        return greetingService.sayGreeting();
    }
}