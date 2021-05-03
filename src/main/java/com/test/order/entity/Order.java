package com.test.order.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "ORDERS")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PAYMENT_ID")
    private PaymentDetails paymentDetails;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            mappedBy = "order"
    )
    private Set<ProductOrdered> products;


    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public PaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(PaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    public Set<ProductOrdered> getProducts() {
        return products;
    }

    public void setProducts(Set<ProductOrdered> products) {
        this.products = products;
    }
}
