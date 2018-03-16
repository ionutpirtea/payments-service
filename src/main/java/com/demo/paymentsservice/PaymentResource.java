package com.demo.paymentsservice;

import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.Objects;


public class PaymentResource {

    @Id
    public String id;

    public int version;

    public String paymentId;

    public String paymentType;

    public LocalDateTime processingDate;

    public String organisationId;

    public String paymentDataJson;


    public PaymentResource(int version, String paymentId, String paymentType, LocalDateTime processingDate, String organisationId, String paymentDataJson) {
        this.version = version;
        this.paymentId = paymentId;
        this.paymentType = paymentType;
        this.processingDate = processingDate;
        this.organisationId = organisationId;
        this.paymentDataJson = paymentDataJson;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaymentResource that = (PaymentResource) o;
        return version == that.version &&
                Objects.equals(id, that.id) &&
                Objects.equals(paymentId, that.paymentId) &&
                Objects.equals(paymentType, that.paymentType) &&
                Objects.equals(processingDate, that.processingDate) &&
                Objects.equals(organisationId, that.organisationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, paymentId, paymentType, processingDate, organisationId);
    }

    @Override
    public String toString() {
        return paymentDataJson.toString();
    }
}

