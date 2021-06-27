package com.egen.ordermanagment.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="address")
@Getter
@Setter
@Accessors(chain = true)
public class Address{
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "address_id")
    private String addressId;

    @Column(name = "order_billing_addressline1")
    private String addressLine1;

    @Column(name = "order_billing_addressline2")
    private String addressLine2;

    @Column(name = "order_billing_city")
    private String city;

    @Column(name = "order_billing_state")
    private String state;

    @Column(name = "order_billing_zip")
    private String zip;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(columnDefinition = "orders_id")
    public Orders orders;

    public Address(){
    }
}
