package com.demo.paymentsservice.controller;


import com.demo.paymentsservice.dao.PaymentResourceRepository;
import com.demo.paymentsservice.model.PaymentResource;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.demo.utils.Utils.parseDate;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@RestController
public class PaymentsServiceController {

    private PaymentResourceRepository paymentResourceRepository;

    @Autowired
    public PaymentsServiceController(PaymentResourceRepository paymentResourceRepository) {
        this.paymentResourceRepository = paymentResourceRepository;
    }

    @RequestMapping(value = "/paymentResource/{id}", method = RequestMethod.GET)
    public PaymentResource paymentResource(@PathVariable(value="id") String id) {
        Optional<PaymentResource> optionalPayment = paymentResourceRepository.findById(id);
        PaymentResource payment = optionalPayment.orElse(new PaymentResource());
        Link link = linkTo(methodOn(PaymentsServiceController.class).paymentResource(payment.id)).withSelfRel();
        payment.add(link);
        return payment;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List payments() {
        List<PaymentResource> payment = paymentResourceRepository.findAll();
        return payment;
    }

    @RequestMapping(value = "/paymentResource/add", method = RequestMethod.POST)
    public String addPayment(@RequestParam(value="paymentJson") String paymentJson) {
        Gson gson = new Gson();
        JsonObject jsonElement = gson.fromJson(paymentJson, JsonElement.class).getAsJsonObject();
        PaymentResource paymentResource = new PaymentResource(jsonElement.get("organisation_id").getAsString(), jsonElement.toString());
        paymentResourceRepository.save(paymentResource);
        return paymentJson;
    }

    @RequestMapping(value = "/addPayments", method = RequestMethod.POST)
    public String addPayments(@RequestParam(value="paymentsJson") String paymentsJson) {
        Gson gson = new Gson();
        JsonArray jsonElements = gson.fromJson(paymentsJson, JsonArray.class);
        List<PaymentResource> paymentResources = new ArrayList<>();
        jsonElements. forEach(jsonElement -> {
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            PaymentResource paymentResource = new PaymentResource(jsonObject.get("organisation_id").getAsString(), jsonElement.toString());
            paymentResources.add(paymentResource);
          }
        );
        paymentResourceRepository.saveAll(paymentResources);
        return ""+paymentResources.size()+" PaymentResources added";
    }




}
