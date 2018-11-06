package guru.springframework;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanPostProcessor
    implements BeanPostProcessor
{
    @Override
    public Object postProcessAfterInitialization(final Object bean, final String beanName)
        throws BeansException
    {
        if( bean instanceof LifeCycleDemoBean )
        {
            ((LifeCycleDemoBean)bean).beanPostProcessorCallAfterInit();
        }

        return bean;
    }

    @Override
    public Object postProcessBeforeInitialization(final Object bean, final String beanName)
        throws BeansException
    {
        if( bean instanceof LifeCycleDemoBean )
        {
            ((LifeCycleDemoBean)bean).beanPostProcessorCallBeforeInit();
        }

        return bean;
    }
}