package cn.chifuyong.factorybean;

import org.springframework.beans.factory.FactoryBean;

import java.util.Map;
import java.util.Properties;

/**
 * 测试 FactroyBean
 *
 * @date： 2020/12/11
 * @author: chify
 */
public class FactoryBeanTest implements FactoryBean<Properties> {

	@Override
	public Properties getObject() throws Exception {
		Properties properties = new Properties();
		Properties sysProperties =  System.getProperties();
		Map<String, String> envProperties = System.getenv();
		properties.putAll(sysProperties);
		properties.putAll(envProperties);
		return properties;
	}

	@Override
	public Class<?> getObjectType() {
		return Properties.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
