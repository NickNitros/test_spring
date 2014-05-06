import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import test_spring.service.CustomerService;

public class Application {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(AppConfig.class);
		
	
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//CustomerService service = new CustomerServiceImpl();
		
		CustomerService service = appContext.getBean("customerService", CustomerService.class);

		System.out.println(service.findAll().get(0).getFirstname());
	}

}