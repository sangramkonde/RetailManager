package shop.retail.main;

import shop.retail.service.shop.ShopLocator;
import shop.retail.service.shop.ShopLocatorImpl;
import shop.retail.datastore.ShopInMemoryArray;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * This is the class where we launch the retail manager application
 * To run it, here we have used spring boot
 * @author Sangram
 *
 */
@SpringBootApplication(scanBasePackages = "shop.retail")
public class ApplicationLauncher {
	public static void main(String[] args) {
		SpringApplication.run(ApplicationLauncher.class, args);
		System.out.println(RetailMessages.SUCCESS);
	}

	@Bean
	public ObjectMapper objectMapper() {
		return new ObjectMapper();
	}

	@Bean
	public ShopInMemoryArray shopListHolder() {
		return new ShopInMemoryArray();
	}

	@Bean
	public ShopLocator shopLocatorService() {
		return new ShopLocatorImpl();
	}
}
