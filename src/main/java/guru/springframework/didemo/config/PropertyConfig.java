package guru.springframework.didemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;

import guru.springframework.didemo.examplebeans.FakeDataSource;
import guru.springframework.didemo.examplebeans.FakeJmsBroker;

@Configuration
// @PropertySource({ "classpath:datasource.properties", "classpath:jmsbroker.properties" })
@PropertySources({
                   @PropertySource("classpath:datasource.properties"),
                   @PropertySource("classpath:jmsbroker.properties")
})
public class PropertyConfig
{
    // The following bean is provided in Spring Boot environment by auto-configuration. In classical Spring environment it is required to be created like this:
    // @Bean
    // public static PropertySourcesPlaceholderConfigurer properties()
    // {
    // final PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
    // return propertySourcesPlaceholderConfigurer;
    // }

    @Value("${guru.password}")
    String dataSourcePassword;

    @Value("${guru.dburl}")
    String dataSourceUrl;

    @Value("${guru.username}")
    String dataSourceUsername;

    @Autowired
    Environment env;

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
        fakeDataSource.setUsername(env.getProperty("USERNAME"));
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