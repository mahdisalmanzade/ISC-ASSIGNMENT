package com.isc.payment.repository;

import com.isc.payment.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    @Query(value = "SELECT * FROM customer c WHERE c.national_code=?1 " , nativeQuery = true)
    List<Customer> findCustomerByNationalCodeIs(String nationalCode);
}
