package com.demo.paymentsservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.hateoas.ResourceSupport;

import java.time.LocalDate;
import java.util.Objects;


public class PaymentResource extends ResourceSupport {

    @Id
    @JsonIgnore
    public String id;

    @JsonIgnore
    private String paymentResourceId;

    @JsonIgnore
    private String paymentType;

    @JsonIgnore
    private LocalDate processingDate;

    @JsonIgnore
    private String organisationId;

    private String paymentResource;


    public PaymentResource(String paymentResourceId, String paymentType, LocalDate processingDate, String organisationId, String paymentResource) {
        this.paymentResourceId = paymentResourceId;
        this.paymentType = paymentType;
        this.processingDate = processingDate;
        this.organisationId = organisationId;
        this.paymentResource = paymentResource;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaymentResource that = (PaymentResource) o;
        return  Objects.equals(id, that.id) &&
                Objects.equals(paymentResourceId, that.paymentResourceId) &&
                Objects.equals(paymentType, that.paymentType) &&
                Objects.equals(processingDate, that.processingDate) &&
                Objects.equals(organisationId, that.organisationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, paymentResourceId, paymentType, processingDate, organisationId);
    }

    @Override
    public String toString() {
        return paymentResource.toString();
    }

    public void setPaymentResourceId(String paymentResourceId) {
        this.paymentResourceId = paymentResourceId;
    }

    public void setPaymentResource(String paymentResource) {
        this.paymentResource = paymentResource;
    }


    public String getPaymentResourceId() {
        return paymentResourceId;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public LocalDate getProcessingDate() {
        return processingDate;
    }

    public String getOrganisationId() {
        return organisationId;
    }

    public String getPaymentResource() {
        return paymentResource;
    }
}

