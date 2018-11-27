package guru.springframework.jokes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.jokes.services.GreetingService;

@Controller
public class ConstructorInjectedController
{
    private final GreetingService greetingService;

    @Autowired
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") final GreetingService greetingService)
    {
        this.greetingService = greetingService;
    }

    public String sayHello()
    {
        return greetingService.sayGreeting();
    }
}