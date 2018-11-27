package guru.springframework.jokes.services;

import guru.springframework.jokes.repositories.GreetingRepository;

public class PrimaryGermanGreetingService
    implements GreetingService
{
    private final GreetingRepository greetingRepository;

    public PrimaryGermanGreetingService(final GreetingRepository greetingRepository)
    {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting()
    {
        return greetingRepository.getGermanGreeting();
    }
}