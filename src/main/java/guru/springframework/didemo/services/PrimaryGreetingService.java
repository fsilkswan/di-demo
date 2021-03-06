package guru.springframework.didemo.services;

import guru.springframework.didemo.repositories.GreetingRepository;

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