package guru.springframework.jokes.repositories;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl
    implements GreetingRepository
{
    @Override
    public String getEnglishGreeting()
    {
        return "Hello - Primary Greeting service.";
    }

    @Override
    public String getGermanGreeting()
    {
        return "Prim\u00E4rer Gru\u00DFdienst.";
    }

    @Override
    public String getSpanishGreeting()
    {
        return "Servicio de Saludo Primario.";
    }
}