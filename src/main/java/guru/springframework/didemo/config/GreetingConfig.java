package guru.springframework.didemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import guru.springframework.didemo.repositories.GreetingRepository;
import guru.springframework.didemo.services.GreetingService;
import guru.springframework.didemo.services.GreetingServiceFactory;

@Configuration
public class GreetingConfig
{
    public static final String LANG_DE = "de";
    public static final String LANG_EN = "en";
    public static final String LANG_ES = "es";

    @Bean
    public GreetingServiceFactory greetingServiceFactory(final GreetingRepository repository)
    {
        return new GreetingServiceFactory(repository);
    }

    @Bean
    @Primary
    @Profile(LANG_DE)
    GreetingService germanGreetingService(final GreetingServiceFactory greetingServiceFactory)
    {
        return greetingServiceFactory.createGreetingService(LANG_DE);
    }

    @Bean
    @Primary
    @Profile({ "default", LANG_EN })
    GreetingService primaryGreetingService(final GreetingServiceFactory greetingServiceFactory)
    {
        return greetingServiceFactory.createGreetingService(LANG_EN);
    }

    @Bean
    @Primary
    @Profile(LANG_ES)
    GreetingService spanishGreetingService(final GreetingServiceFactory greetingServiceFactory)
    {
        return greetingServiceFactory.createGreetingService(LANG_ES);
    }
}