package cn.chifuyong;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 分析源码 Demo 类
 *
 * @date： 2020/11/5
 * @author: chify
 */
public class SrcDemo {

	public static void main(String[] args) {
		String xmlPath = "application.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
	}

}
