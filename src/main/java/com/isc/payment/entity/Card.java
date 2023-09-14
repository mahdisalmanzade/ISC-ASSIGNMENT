package com.isc.payment.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "card_number")
    private String cardNumber;
    @Column(name = "card_type", unique = true)
    private String cardType;
    @Column(name = "issuer_code")
    private String issuerCode;
    @Column(name = "bank_name")
    private String bankName;
    @Column(name = "expiration_date")
    private Date expirationDate;
    @Column(name = "is_active")
    private boolean isActive;

    // Getter and Setter are implicitly created by Lombok library
}
