package com.isc.payment.controller;

import java.util.ArrayList;
import java.util.List;

import com.isc.payment.entity.Card;
import com.isc.payment.entity.Customer;
import com.isc.payment.repository.CardRepository;
import com.isc.payment.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class CardController {
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/customers/{customerId}/cards")
    public ResponseEntity<List<Card>> getAllCardsByTutorialId(@PathVariable Long tutorialId) throws Exception {
        System.out.println(tutorialId);
        Customer customer = customerRepository.findById(tutorialId)
                .orElseThrow(() -> new Exception("Not found Tutorial with id = " + tutorialId));

        List<Card> comments = new ArrayList<Card>();
        comments.addAll(customer.getCardList());

        return new ResponseEntity<>(comments, HttpStatus.OK);
    }


}
