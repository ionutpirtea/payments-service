package com.demo.paymentsservice;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<PaymentResource, String> {

    public PaymentResource findByPaymentId(String paymentId);

    public List<PaymentResource> findByProcessingDate(LocalDateTime processingDate);

}
