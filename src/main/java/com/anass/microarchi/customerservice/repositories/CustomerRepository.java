package com.anass.microarchi.customerservice.repositories;

import com.anass.microarchi.customerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
