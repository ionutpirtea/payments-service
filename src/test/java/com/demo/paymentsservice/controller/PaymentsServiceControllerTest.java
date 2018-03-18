package com.demo.paymentsservice.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest
public class PaymentsServiceControllerTest {


    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnPaymentResourceById()  throws  Exception{


        MockHttpServletRequestBuilder requestBuilder = get("/paymentResource?id=216d4da9-e59a-4cc6-8df3-3da6e7580b77");
        ResultActions perform = this.mockMvc.perform(requestBuilder);
        perform.andDo(print()).andExpect(status().isOk())
                .andExpect(jsonPath("$.paymentResource").value("{\"type\":\"Payment\",\"paymentId\":\"216d4da9-e59a-4cc6-8df3-3da6e7580b77\",\"version\":0,\"organisation_id\":\"743d5b63-8e6f-432e-a8fa-c5d8d2ee5fcb\",\"attributes\":{\"amount\":\"100.21\",\"beneficiary_party\":{\"account_name\":\"W Owens\",\"account_number\":\"31926819\",\"account_number_code\":\"BBAN\",\"account_type\":0,\"address\":\"1 The Beneficiary Localtown SE2\",\"bank_id\":\"403000\",\"bank_id_code\":\"GBDSC\",\"name\":\"Wilfred Jeremiah Owens\"},\"charges_information\":{\"bearer_code\":\"SHAR\",\"sender_charges\":[{\"amount\":\"5.00\",\"currency\":\"GBP\"},{\"amount\":\"10.00\",\"currency\":\"USD\"}],\"receiver_charges_amount\":\"1.00\",\"receiver_charges_currency\":\"USD\"},\"currency\":\"GBP\",\"debtor_party\":{\"account_name\":\"EJ Brown Black\",\"account_number\":\"GB29XABC10161234567801\",\"account_number_code\":\"IBAN\",\"address\":\"10 Debtor Crescent Sourcetown NE1\",\"bank_id\":\"203301\",\"bank_id_code\":\"GBDSC\",\"name\":\"Emelia Jane Brown\"},\"end_to_end_reference\":\"Wil piano Jan\",\"fx\":{\"contract_reference\":\"FX123\",\"exchange_rate\":\"2.00000\",\"original_amount\":\"200.42\",\"original_currency\":\"USD\"},\"numeric_reference\":\"1002001\",\"payment_id\":\"123456789012345678\",\"payment_purpose\":\"Paying for goods/services\",\"payment_scheme\":\"FPS\",\"payment_type\":\"Credit\",\"processing_date\":\"2017-01-18\",\"reference\":\"PaymentResource for Em's piano lessons\",\"scheme_payment_sub_type\":\"InternetBanking\"" +
                        ",\"scheme_payment_type\":\"ImmediatePayment\",\"sponsor_party\":{\"account_number\":\"56781234\",\"bank_id\":\"123123\",\"bank_id_code\":\"GBDSC\"}}}"));
    }
}