package guru.springframework;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemoBean
    implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware
{
    public LifeCycleDemoBean()
    {
        System.out.println("## I'm in the LifeCycleBean constructor!");
    }

    @Override
    public void afterPropertiesSet()
        throws Exception
    {
        System.out.println("## The LifeCycleBean has its properties set!");
    }

    @PostConstruct
    public void annotatedPostConstruct()
    {
        System.out.println("## The @PostConstruct annotated method has been called!");
    }

    @PreDestroy
    public void annotatedPreDestroy()
    {
        System.out.println("## The @PreDestroy annotated method has been called!");
    }

    public void beanPostProcessorCallAfterInit()
    {
        System.out.println("## The beanPostProcessorCallAfterInit() method has been called by the BeanPostProcessor!");
    }

    public void beanPostProcessorCallBeforeInit()
    {
        System.out.println("## The beanPostProcessorCallBeforeInit() method has been called by the BeanPostProcessor!");
    }

    @Override
    public void destroy()
        throws Exception
    {
        System.out.println("## The LifeCycleBean has been terminated!");
    }

    @Override
    public void setApplicationContext(final ApplicationContext applicationContext)
        throws BeansException
    {
        System.out.println("## The ApplicationContext has been set!");
    }

    @Override
    public void setBeanFactory(final BeanFactory beanFactory)
        throws BeansException
    {
        System.out.println("## The BeanFactory has been set!");
    }

    @Override
    public void setBeanName(final String name)
    {
        System.out.println("## My bean name is: " + name);
    }
}