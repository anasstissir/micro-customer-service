package com.anass.microarchi.customerservice;

import com.anass.microarchi.customerservice.entities.Customer;
import com.anass.microarchi.customerservice.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerRepository customerRepository) {
        return args -> {
            customerRepository.save(new Customer(null, "Anass", "mail@mail"));
            customerRepository.save(new Customer(null, "moha", "moha@moha"));
            customerRepository.findAll().forEach(System.out::println);
        };
    }
}
