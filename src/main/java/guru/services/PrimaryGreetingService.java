package guru.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({ "default", "en" })
@Primary
public class PrimaryGreetingService
    implements GreetingService
{
    @Override
    public String sayGreeting()
    {
        return "Hello - Primary Greeting service.";
    }
}