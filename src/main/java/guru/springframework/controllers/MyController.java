package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.services.GreetingService;

@Controller
public class MyController
{
    private final GreetingService greetingService;

    @Autowired
    public MyController(final GreetingService greetingService)
    {
        this.greetingService = greetingService;
    }

    public String hello()
    {
        System.out.println("Hello!!!");

        return greetingService.sayGreeting();
    }
}