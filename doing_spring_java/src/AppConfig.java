import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import test_spring.rep.CustomerRepository;
import test_spring.rep.HibernateCustomerRepositoryImpl;
import test_spring.service.CustomerService;
import test_spring.service.CustomerServiceImpl;

@Configuration
public class AppConfig {

	@Bean(name = "customerService")
	public CustomerService getCustomerService() {
		CustomerServiceImpl customerService = new CustomerServiceImpl(
				getCustomerRepository());
		// customerService.setCustomerRepository(getCustomerRepository());
		return customerService;
	}

	@Bean(name = "customerRepository")
	public CustomerRepository getCustomerRepository() {
		return new HibernateCustomerRepositoryImpl();
	}
}
