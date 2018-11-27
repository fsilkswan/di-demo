package guru.springframework.jokes.services;

import org.springframework.stereotype.Service;

@Service
public final class GreetingServiceImpl
    implements GreetingService
{
    public static final String HELLO_GURUS = "Hello Gurus!!!!";

    @Override
    public String sayGreeting()
    {
        return HELLO_GURUS;
    }
}