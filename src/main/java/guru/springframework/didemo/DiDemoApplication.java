package guru.springframework.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.didemo.controllers.ConstructorInjectedController;
import guru.springframework.didemo.controllers.MyController;
import guru.springframework.didemo.controllers.PropertyInjectedController;
import guru.springframework.didemo.controllers.SetterInjectedController;
import guru.springframework.didemo.examplebeans.FakeDataSource;
import guru.springframework.didemo.examplebeans.FakeJmsBroker;

@SpringBootApplication
public class DiDemoApplication
{
    public static void main(final String[] args)
    {
        final ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        final MyController myController = ctx.getBean(MyController.class);
        System.out.println(myController.hello());

        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

        final FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
        System.out.println("FakeDataSource.username: " + fakeDataSource.getUsername());
        System.out.println("FakeDataSource.password: " + fakeDataSource.getPassword());
        System.out.println("FakeDataSource.databaseUrl: " + fakeDataSource.getDatabaseUrl());

        final FakeJmsBroker fakeJmsBroker = ctx.getBean(FakeJmsBroker.class);
        System.out.println("FakeJmsBroker.username: " + fakeJmsBroker.getUsername());
        System.out.println("FakeJmsBroker.password: " + fakeJmsBroker.getPassword());
        System.out.println("FakeJmsBroker.url: " + fakeJmsBroker.getUrl());
    }
}