package guru.springframework.jokes.services;

import guru.springframework.jokes.repositories.GreetingRepository;

public class PrimaryGreetingService
    implements GreetingService
{
    private final GreetingRepository greetingRepository;

    public PrimaryGreetingService(final GreetingRepository greetingRepository)
    {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting()
    {
        return greetingRepository.getEnglishGreeting();
    }
}