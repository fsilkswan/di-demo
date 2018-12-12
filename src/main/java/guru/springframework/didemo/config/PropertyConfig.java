package guru.springframework.didemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import guru.springframework.didemo.examplebeans.FakeDataSource;
import guru.springframework.didemo.examplebeans.FakeJmsBroker;

@Configuration
public class PropertyConfig
{
    @Value("${guru.password}")
    String dataSourcePassword;

    @Value("${guru.dburl}")
    String dataSourceUrl;

    @Value("${guru.username}")
    String dataSourceUsername;

    @Value("${guru.jms.password}")
    String jmsBrokerPassword;

    @Value("${guru.jms.url}")
    String jmsBrokerUrl;

    @Value("${guru.jms.username}")
    String jmsBrokerUsername;

    @Bean
    public FakeDataSource fakeDataSource()
    {
        final FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(dataSourceUsername);
        fakeDataSource.setPassword(dataSourcePassword);
        fakeDataSource.setDatabaseUrl(dataSourceUrl);

        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker()
    {
        final FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUsername(jmsBrokerUsername);
        fakeJmsBroker.setPassword(jmsBrokerPassword);
        fakeJmsBroker.setUrl(jmsBrokerUrl);

        return fakeJmsBroker;
    }
}