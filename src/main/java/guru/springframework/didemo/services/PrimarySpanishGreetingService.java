package guru.springframework.didemo.services;

import guru.springframework.didemo.repositories.GreetingRepository;

public class PrimarySpanishGreetingService
    implements GreetingService
{
    private final GreetingRepository greetingRepository;

    public PrimarySpanishGreetingService(final GreetingRepository greetingRepository)
    {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting()
    {
        return greetingRepository.getSpanishGreeting();
    }
}