package guru.springframework.didemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import guru.springframework.didemo.examplebeans.FakeDataSource;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig
{
    // The following bean is provided in Spring Boot environment by auto-configuration. In classical Spring environment it is required to be created like this:
    // @Bean
    // public static PropertySourcesPlaceholderConfigurer properties()
    // {
    // final PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
    // return propertySourcesPlaceholderConfigurer;
    // }

    @Value("${guru.dburl}")
    String databaseUrl;

    @Autowired
    Environment env;

    @Value("${guru.password}")
    String password;

    @Value("${guru.username}")
    String username;

    @Bean
    public FakeDataSource fakeDataSource()
    {
        final FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(username);
        fakeDataSource.setUsername(env.getProperty("USERNAME"));
        fakeDataSource.setPassword(password);
        fakeDataSource.setDatabaseUrl(databaseUrl);

        return fakeDataSource;
    }
}