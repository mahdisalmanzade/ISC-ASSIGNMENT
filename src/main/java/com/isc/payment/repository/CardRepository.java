package com.isc.payment.repository;

import com.isc.payment.entity.Card;
import com.isc.payment.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {

}
