package cn.chifuyong.postprocessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

/**
 * 测试 BeanDefinitionRegisterPostProcessor
 *
 * @date： 2020/12/14
 * @author: chify
 */
public class BeanDefinitionRegisterPostProcessorTest implements BeanDefinitionRegistryPostProcessor {

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("postProcessBeanDefinitionRegistry 之前，beanDefinition 数量" + registry.getBeanDefinitionCount());
		AbstractBeanDefinition objectBeanDefinition = BeanDefinitionBuilder.rootBeanDefinition(Object.class).getBeanDefinition();
		//注册一个 beanDeanDefinition
		registry.registerBeanDefinition("testChify",objectBeanDefinition);
		System.out.println("postProcessBeanDefinitionRegistry 之后，beanDefinition 数量" + registry.getBeanDefinitionCount());
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("BeanDefinitionRegisterPostProcessorTest.postProcessBeanFactory，" + beanFactory.getBeanDefinitionCount());
	}

}
