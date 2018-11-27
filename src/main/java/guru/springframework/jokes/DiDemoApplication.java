package guru.springframework.jokes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.jokes.controllers.ConstructorInjectedController;
import guru.springframework.jokes.controllers.MyController;
import guru.springframework.jokes.controllers.PropertyInjectedController;
import guru.springframework.jokes.controllers.SetterInjectedController;

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
    }
}