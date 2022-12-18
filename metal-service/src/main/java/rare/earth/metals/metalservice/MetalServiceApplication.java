package rare.earth.metals.metalservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import util.ApplicationRunner;

@SpringBootApplication
@EnableEurekaClient
@EnableMongoRepositories
public class MetalServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MetalServiceApplication.class, args);
	}

	@Bean
	public ApplicationRunner applicationStartupRunner() {
		return new ApplicationRunner();
	}

}
