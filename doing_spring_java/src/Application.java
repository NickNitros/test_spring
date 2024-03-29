import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import test_spring.service.CustomerService;

public class Application {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		ApplicationContext appContext = new AnnotationConfigApplicationContext(
				AppConfig.class);

		// CustomerService service = new CustomerServiceImpl();

		CustomerService service = appContext.getBean("customerService",
				CustomerService.class);
		
		CustomerService service2 = appContext.getBean("customerService",
				CustomerService.class);

		// proving singleton
		System.out.println(service);
		System.out.println(service2);

		System.out.println(service.findAll().get(0).getFirstname());
	}

}