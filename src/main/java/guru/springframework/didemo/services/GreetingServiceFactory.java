package guru.springframework.didemo.services;

import static guru.springframework.didemo.config.GreetingConfig.LANG_DE;
import static guru.springframework.didemo.config.GreetingConfig.LANG_EN;
import static guru.springframework.didemo.config.GreetingConfig.LANG_ES;

import guru.springframework.didemo.repositories.GreetingRepository;

public class GreetingServiceFactory
{
    private final GreetingRepository greetingRepository;

    public GreetingServiceFactory(final GreetingRepository greetingRepository)
    {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(final String lang)
    {
        switch (lang)
        {
            case LANG_DE:
                return new PrimaryGermanGreetingService(greetingRepository);

            case LANG_ES:
                return new PrimarySpanishGreetingService(greetingRepository);

            case LANG_EN:
            default:
                return new PrimaryGreetingService(greetingRepository);
        }
    }
}