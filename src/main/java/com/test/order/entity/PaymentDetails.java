package com.test.order.entity;

import javax.persistence.*;

@Entity
public class PaymentDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String paymentType;
    private String cardNum;
    private String expData;

    @OneToOne(mappedBy = "paymentDetails")
    private Order order;

}
