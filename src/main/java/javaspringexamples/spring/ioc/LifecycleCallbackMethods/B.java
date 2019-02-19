package javaspringexamples.spring.ioc.LifecycleCallbackMethods;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * 
 * @author mounir.sahrani@gmail.com
 *
 */
public class B implements InitializingBean, DisposableBean {

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("B InitializingBean-afterPropertiesSet() method invoked");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("B DisposableBean-destroy() method invoked");
	}

}
