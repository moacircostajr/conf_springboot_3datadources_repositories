package br.com.mercator.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableTransactionManagement
@SpringBootApplication(scanBasePackageClasses = ServerApplication.class)
public class ServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }
}
