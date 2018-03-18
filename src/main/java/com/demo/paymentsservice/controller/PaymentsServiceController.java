package com.demo.paymentsservice.controller;


import com.demo.paymentsservice.dao.PaymentResourceRepository;
import com.demo.paymentsservice.model.PaymentResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

@RestController
public class PaymentsServiceController {

    private PaymentResourceRepository paymentResourceRepository;

    @Autowired
    public PaymentsServiceController(PaymentResourceRepository paymentResourceRepository) {
        this.paymentResourceRepository = paymentResourceRepository;
    }

    @RequestMapping(value = "/paymentResource/{id}", method = RequestMethod.GET)
    public PaymentResource paymentResource(@PathVariable(value="id") String id) {
        PaymentResource payment = paymentResourceRepository.findByPaymentResourceId(id);
        Link selfLink = linkTo(PaymentResource.class).slash(payment.getPaymentResourceId()).withSelfRel();
        payment.add(selfLink);
        return payment;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List payments() {
        List<PaymentResource> payment = paymentResourceRepository.findAll();
        return payment;
    }


}
