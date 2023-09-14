package com.isc.payment.controller;

import java.util.ArrayList;
import java.util.List;

import com.isc.payment.entity.Customer;
import com.isc.payment.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/customers/{nationalCode}")
    @ResponseBody
    public ResponseEntity<List<Customer>> getAllCustomers(@PathVariable String nationalCode) {
        System.out.println(nationalCode);
        System.out.println("Inside getAllCustomers Handler Method!");
        List<Customer> Customers = new ArrayList<Customer>();

        if (nationalCode == null)
            customerRepository.findAll().forEach(Customers::add);
        else
            customerRepository.findCustomerByNationalCodeIs(nationalCode).forEach(Customers::add);
        System.out.println(Customers.isEmpty());

        if (Customers.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(Customers, HttpStatus.OK);
    }

}
