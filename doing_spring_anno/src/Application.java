import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.spring.service.CustomerService;

public class Application {

	public static void main(String[] args) {
		// CustomerService service = new CustomerServiceImpl();

		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		CustomerService service = appContext.getBean("customerService",
				CustomerService.class);

		System.out.println(service.findAll().get(0).getFirstname());
	}

}