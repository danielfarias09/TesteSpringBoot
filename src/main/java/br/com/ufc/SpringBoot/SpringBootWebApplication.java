package br.com.ufc.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "br.com.ufc.SpringBoot.model")
@EnableJpaRepositories(basePackages = "br.com.ufc.SpringBoot.repository")
@SpringBootApplication(scanBasePackages = "br.com.ufc.SpringBoot")
public class SpringBootWebApplication{

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootWebApplication.class, args);
	}

	
}
