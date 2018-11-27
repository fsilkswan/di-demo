package guru.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("de")
@Primary
public class PrimaryGermanGreetingService
    implements GreetingService
{
    @Override
    public String sayGreeting()
    {
        return "Prim\u00E4rer Gru\u00DFdienst.";
    }
}