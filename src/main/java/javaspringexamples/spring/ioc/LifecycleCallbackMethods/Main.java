package javaspringexamples.spring.ioc.LifecycleCallbackMethods;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author mounir.sahrani@gmail.com
 *
 */
public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:/applicationContext.xml");
		applicationContext.registerShutdownHook();
	}

}
