package com.demo.paymentsservice;
/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import static org.assertj.core.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PaymentResourceRepositoryTests {

    @Autowired
    CustomerRepository repository;

    PaymentResource payment1, payment2, payment3;

    @Before
    public void setUp() {

        repository.deleteAll();

        payment1 = repository.save(new PaymentResource(0,"4ee3a8d8-ca7b-4290-a52c-dd5b6165ec43", "Credit", LocalDateTime.parse("2015-02-20")
                , "743d5b63-8e6f-432e-a8fa-c5d8d2ee5fcb" , "{\"data\":[{\"type\":\"Payment\",\"paymentId\":\"4ee3a8d8-ca7b-4290-a52c-dd5b6165ec43\",\"version\":0,\"organisation_id\":\"743d5b63-8e6f-432e-a8fa-c5d8d2ee5fcb\",\"attributes\":{\"amount\":\"100.21\",\"beneficiary_party\":{\"account_name\":\"W Owens\",\"account_number\":\"31926819\",\"account_number_code\":\"BBAN\",\"account_type\":0,\"address\":\"1 The Beneficiary Localtown SE2\",\"bank_id\":\"403000\",\"bank_id_code\":\"GBDSC\",\"name\":\"Wilfred Jeremiah Owens\"},\"charges_information\":{\"bearer_code\":\"SHAR\",\"sender_charges\":[{\"amount\":\"5.00\",\"currency\":\"GBP\"},{\"amount\":\"10.00\",\"currency\":\"USD\"}],\"receiver_charges_amount\":\"1.00\",\"receiver_charges_currency\":\"USD\"},\"currency\":\"GBP\",\"debtor_party\":{\"account_name\":\"EJ Brown Black\",\"account_number\":\"GB29XABC10161234567801\",\"account_number_code\":\"IBAN\",\"address\":\"10 Debtor Crescent Sourcetown NE1\",\"bank_id\":\"203301\",\"bank_id_code\":\"GBDSC\",\"name\":\"Emelia Jane Brown\"},\"end_to_end_reference\":\"Wil piano Jan\",\"fx\":{\"contract_reference\":\"FX123\",\"exchange_rate\":\"2.00000\",\"original_amount\":\"200.42\",\"original_currency\":\"USD\"},\"numeric_reference\":\"1002001\",\"payment_id\":\"123456789012345678\",\"payment_purpose\":\"Paying for goods/services\",\"payment_scheme\":\"FPS\",\"payment_type\":\"Credit\",\"processing_date\":\"2017-01-18\",\"reference\":\"Payment for Em's piano lessons\",\"scheme_payment_sub_type\":\"InternetBanking\",\"scheme_payment_type\":\"ImmediatePayment\",\"sponsor_party\":{\"account_number\":\"56781234\",\"bank_id\":\"123123\",\"bank_id_code\":\"GBDSC\"}}}"));
        payment2 = repository.save(new PaymentResource(0,"216d4da9-e59a-4cc6-8df3-3da6e7580b77",  "Credit", LocalDateTime.parse("2017-01-18"), "743d5b63-8e6f-432e-a8fa-c5d8d2ee5fcb",
                "\"type\":\"PaymentResource\",\"paymentId\":\"216d4da9-e59a-4cc6-8df3-3da6e7580b77\",\"version\":0,\"organisation_id\":\"743d5b63-8e6f-432e-a8fa-c5d8d2ee5fcb\",\"attributes\":{\"amount\":\"100.21\",\"beneficiary_party\":{\"account_name\":\"W Owens\",\"account_number\":\"31926819\",\"account_number_code\":\"BBAN\",\"account_type\":0,\"address\":\"1 The Beneficiary Localtown SE2\",\"bank_id\":\"403000\",\"bank_id_code\":\"GBDSC\",\"name\":\"Wilfred Jeremiah Owens\"},\"charges_information\":{\"bearer_code\":\"SHAR\",\"sender_charges\":[{\"amount\":\"5.00\",\"currency\":\"GBP\"},{\"amount\":\"10.00\",\"currency\":\"USD\"}],\"receiver_charges_amount\":\"1.00\",\"receiver_charges_currency\":\"USD\"},\"currency\":\"GBP\",\"debtor_party\":{\"account_name\":\"EJ Brown Black\",\"account_number\":\"GB29XABC10161234567801\",\"account_number_code\":\"IBAN\",\"address\":\"10 Debtor Crescent Sourcetown NE1\",\"bank_id\":\"203301\",\"bank_id_code\":\"GBDSC\",\"name\":\"Emelia Jane Brown\"},\"end_to_end_reference\":\"Wil piano Jan\",\"fx\":{\"contract_reference\":\"FX123\",\"exchange_rate\":\"2.00000\",\"original_amount\":\"200.42\",\"original_currency\":\"USD\"},\"numeric_reference\":\"1002001\",\"payment_id\":\"123456789012345678\",\"payment_purpose\":\"Paying for goods/services\",\"payment_scheme\":\"FPS\",\"payment_type\":\"Credit\",\"processing_date\":\"2017-01-18\",\"reference\":\"PaymentResource for Em's piano lessons\",\"scheme_payment_sub_type\":\"InternetBanking\",\"scheme_payment_type\":\"ImmediatePayment\",\"sponsor_party\":{\"account_number\":\"56781234\",\"bank_id\":\"123123\",\"bank_id_code\":\"GBDSC\"}}}"));
    }

    @Test
    public void setsIdOnSave() {

        PaymentResource payment4 = repository.save(new PaymentResource(0,"97fe60ba-1334-439f-91db-32cc3cde036a", "Credit", LocalDateTime.parse("2015-02-20"), "743d5b63-8e6f-432e-a8fa-c5d8d2ee5fcb",
                "{\"type\":\"Payment\",\"paymentId\":\"97fe60ba-1334-439f-91db-32cc3cde036a\",\"version\":0,\"organisation_id\":\"743d5b63-8e6f-432e-a8fa-c5d8d2ee5fcb\",\"attributes\":{\"amount\":\"100.21\",\"beneficiary_party\":{\"account_name\":\"W Owens\",\"account_number\":\"31926819\",\"account_number_code\":\"BBAN\",\"account_type\":0,\"address\":\"1 The Beneficiary Localtown SE2\",\"bank_id\":\"403000\",\"bank_id_code\":\"GBDSC\",\"name\":\"Wilfred Jeremiah Owens\"},\"charges_information\":{\"bearer_code\":\"SHAR\",\"sender_charges\":[{\"amount\":\"5.00\",\"currency\":\"GBP\"},{\"amount\":\"10.00\",\"currency\":\"USD\"}],\"receiver_charges_amount\":\"1.00\",\"receiver_charges_currency\":\"USD\"},\"currency\":\"GBP\",\"debtor_party\":{\"account_name\":\"EJ Brown Black\",\"account_number\":\"GB29XABC10161234567801\",\"account_number_code\":\"IBAN\",\"address\":\"10 Debtor Crescent Sourcetown NE1\",\"bank_id\":\"203301\",\"bank_id_code\":\"GBDSC\",\"name\":\"Emelia Jane Brown\"},\"end_to_end_reference\":\"Wil piano Jan\",\"fx\":{\"contract_reference\":\"FX123\",\"exchange_rate\":\"2.00000\",\"original_amount\":\"200.42\",\"original_currency\":\"USD\"},\"numeric_reference\":\"1002001\",\"payment_id\":\"123456789012345678\",\"payment_purpose\":\"Paying for goods/services\",\"payment_scheme\":\"FPS\",\"payment_type\":\"Credit\",\"processing_date\":\"2017-01-18\",\"reference\":\"Payment for Em's piano lessons\",\"scheme_payment_sub_type\":\"InternetBanking\",\"scheme_payment_type\":\"ImmediatePayment\",\"sponsor_party\":{\"account_number\":\"56781234\",\"bank_id\":\"123123\",\"bank_id_code\":\"GBDSC\"}}}"));

        assertThat(payment4.paymentId).isNotNull();
    }



    @Test
    public void findsByExample() {

        PaymentResource probe = new PaymentResource(0,null, "Credit", LocalDateTime.parse("2015-02-20"), null, null);

        List<PaymentResource> result = repository.findAll(Example.of(probe));

        assertThat(result).hasSize(2).extracting("paymentId").contains("4ee3a8d8-ca7b-4290-a52c-dd5b6165ec43", "216d4da9-e59a-4cc6-8df3-3da6e7580b77");
    }
}