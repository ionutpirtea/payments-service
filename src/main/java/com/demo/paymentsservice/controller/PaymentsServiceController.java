package com.demo.paymentsservice.controller;


import com.demo.paymentsservice.dao.PaymentResourceRepository;
import com.demo.paymentsservice.model.PaymentResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentsServiceController {

    private PaymentResourceRepository paymentResourceRepository;

    @Autowired
    public PaymentsServiceController(PaymentResourceRepository paymentResourceRepository) {
        this.paymentResourceRepository = paymentResourceRepository;
    }

    @RequestMapping("/paymentResource")
    public PaymentResource paymentResource(@RequestParam(value="id") String id) {
        PaymentResource payment = paymentResourceRepository.findByPaymentResourceId(id);
        return payment;
    }
}
