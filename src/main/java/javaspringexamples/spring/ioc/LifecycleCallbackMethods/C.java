package javaspringexamples.spring.ioc.LifecycleCallbackMethods;

/**
 * 
 * @author mounir.sahrani@gmail.com
 *
 */
public class C {
	public void init() throws Exception {
		System.out.println("C init-method=\"init\"-init() method invoked");
	}

	public void destroy() throws RuntimeException {
		System.out.println("C destroy-method=\"destroy\"-destroy() method invoked");
	}
}
