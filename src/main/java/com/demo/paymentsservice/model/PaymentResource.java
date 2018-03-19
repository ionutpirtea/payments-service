package com.demo.paymentsservice.model;

import com.fasterxml.jackson.annotation.JsonRawValue;
import org.springframework.data.annotation.Id;
import org.springframework.hateoas.Link;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class PaymentResource  {

    @Id
    private String id;

    @JsonRawValue
    private String paymentResource;

    private final List<Link> links = new ArrayList<>();

    public PaymentResource() {
    }

    public PaymentResource( String paymentResource) {
        this.paymentResource = paymentResource;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaymentResource that = (PaymentResource) o;
        return  Objects.equals(id, that.id) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "{ id:"+id + ","+ paymentResource +"}";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getPaymentResource() {
        return paymentResource;
    }

    public void add(Link link) {
        this.links.add(link);
    }

}

