package com.demo.paymentsservice.dao;

import com.demo.paymentsservice.model.PaymentResource;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDate;
import java.util.List;

public interface PaymentResourceRepository extends MongoRepository<PaymentResource, String> {

    PaymentResource findByPaymentResourceId(String paymentResourceId);

    List<PaymentResource> findByProcessingDate(LocalDate processingDate);

}
