package guru.springframework.controllers;

import guru.springframework.services.GreetingService;

public class SetterInjectedController
{
    private GreetingService greetingService;

    public void setGreetingService(final GreetingService greetingService)
    {
        this.greetingService = greetingService;
    }

    String sayHello()
    {
        return greetingService.sayGreeting();
    }
}