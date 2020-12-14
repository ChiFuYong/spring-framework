package cn.chifuyong.postprocessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * 测试 Spring BeanFactoryPostProcessor
 *
 * @date： 2020/12/11
 * @author: chify
 */
public class BeanFactoryPostProcessorTest1 implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("TestBeanFactoryPostProcessor1。。");
	}
}
