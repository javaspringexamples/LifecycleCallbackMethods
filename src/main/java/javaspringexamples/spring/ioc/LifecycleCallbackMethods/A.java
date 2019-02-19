package javaspringexamples.spring.ioc.LifecycleCallbackMethods;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 
 * @author mounir.sahrani@gmail.com
 *
 */
public class A {
	@PostConstruct
	public void init() throws Exception {
		System.out.println("A @PostConstruct-init() method invoked");
	}

	@PreDestroy
	public void destroy() throws RuntimeException {
		System.out.println("A @PreDestroy-destroy() method invoked");
	}
}
