import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import test_spring.service.CustomerService;
import test_spring.service.CustomerServiceImpl;

@Configuration
@ComponentScan({ "test_spring" })
@PropertySource("app.properties")
public class AppConfig {
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer gePropertySourcesPlaceholdeConfigurer(){
		return new PropertySourcesPlaceholderConfigurer();
	}

	@Bean(name = "customerService")
	@Scope("prototype")
	public CustomerService getCustomerService() {
		CustomerServiceImpl customerService = new CustomerServiceImpl();
		// customerService.setCustomerRepository(getCustomerRepository());
		return customerService;
	}

	/*@Bean(name = "customerRepository")
	public CustomerRepository getCustomerRepository() {
		return new HibernateCustomerRepositoryImpl();
	}*/
}
