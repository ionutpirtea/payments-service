package com.demo.paymentsservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.hateoas.ResourceSupport;

import java.util.Objects;


public class PaymentResource extends ResourceSupport {

    @Id
    public String id;

    @JsonIgnore
    private String organisationId;

    private String paymentResource;

    public PaymentResource() {
    }

    public PaymentResource(String organisationId, String paymentResource) {
        this.organisationId = organisationId;
        this.paymentResource = paymentResource;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaymentResource that = (PaymentResource) o;
        return  Objects.equals(id, that.id) &&
                Objects.equals(organisationId, that.organisationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,  organisationId);
    }

    @Override
    public String toString() {
        return paymentResource.toString();
    }

    public void setPaymentResource(String paymentResource) {
        this.paymentResource = paymentResource;
    }

    public String getOrganisationId() {
        return organisationId;
    }

    public String getPaymentResource() {
        return paymentResource;
    }
}

