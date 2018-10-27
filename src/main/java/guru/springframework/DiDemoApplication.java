package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.controllers.MyController;

@SpringBootApplication
public class DiDemoApplication
{
    public static void main(final String[] args)
    {
        final ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        final MyController controller1 = (MyController)ctx.getBean("myController");
        controller1.hello();

        final MyController controller2 = ctx.getBean(MyController.class);
        controller2.hello();
    }
}