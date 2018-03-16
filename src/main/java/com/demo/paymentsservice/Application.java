package com.demo.paymentsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private CustomerRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args)  {

		repository.deleteAll();

		// save a couple of customers
		repository.save(new PaymentResource(0,"4ee3a8d8-ca7b-4290-a52c-dd5b6165ec43", "Credit", LocalDateTime.parse("2015-02-20")
				, "743d5b63-8e6f-432e-a8fa-c5d8d2ee5fcb" , "{\"data\":[{\"type\":\"Payment\",\"paymentId\":\"4ee3a8d8-ca7b-4290-a52c-dd5b6165ec43\",\"version\":0,\"organisation_id\":\"743d5b63-8e6f-432e-a8fa-c5d8d2ee5fcb\",\"attributes\":{\"amount\":\"100.21\",\"beneficiary_party\":{\"account_name\":\"W Owens\",\"account_number\":\"31926819\",\"account_number_code\":\"BBAN\",\"account_type\":0,\"address\":\"1 The Beneficiary Localtown SE2\",\"bank_id\":\"403000\",\"bank_id_code\":\"GBDSC\",\"name\":\"Wilfred Jeremiah Owens\"},\"charges_information\":{\"bearer_code\":\"SHAR\",\"sender_charges\":[{\"amount\":\"5.00\",\"currency\":\"GBP\"},{\"amount\":\"10.00\",\"currency\":\"USD\"}],\"receiver_charges_amount\":\"1.00\",\"receiver_charges_currency\":\"USD\"},\"currency\":\"GBP\",\"debtor_party\":{\"account_name\":\"EJ Brown Black\",\"account_number\":\"GB29XABC10161234567801\",\"account_number_code\":\"IBAN\",\"address\":\"10 Debtor Crescent Sourcetown NE1\",\"bank_id\":\"203301\",\"bank_id_code\":\"GBDSC\",\"name\":\"Emelia Jane Brown\"},\"end_to_end_reference\":\"Wil piano Jan\",\"fx\":{\"contract_reference\":\"FX123\",\"exchange_rate\":\"2.00000\",\"original_amount\":\"200.42\",\"original_currency\":\"USD\"},\"numeric_reference\":\"1002001\",\"payment_id\":\"123456789012345678\",\"payment_purpose\":\"Paying for goods/services\",\"payment_scheme\":\"FPS\",\"payment_type\":\"Credit\",\"processing_date\":\"2017-01-18\",\"reference\":\"Payment for Em's piano lessons\",\"scheme_payment_sub_type\":\"InternetBanking\",\"scheme_payment_type\":\"ImmediatePayment\",\"sponsor_party\":{\"account_number\":\"56781234\",\"bank_id\":\"123123\",\"bank_id_code\":\"GBDSC\"}}}"));

		repository.save(new PaymentResource(0,"4ee3a8d8-ca7b-4290-a52c-dd5b6165ec43", "Credit", LocalDateTime.parse("2015-02-20")
				, "743d5b63-8e6f-432e-a8fa-c5d8d2ee5fcb" , "{\"data\":[{\"type\":\"Payment\",\"paymentId\":\"4ee3a8d8-ca7b-4290-a52c-dd5b6165ec43\",\"version\":0,\"organisation_id\":\"743d5b63-8e6f-432e-a8fa-c5d8d2ee5fcb\",\"attributes\":{\"amount\":\"100.21\",\"beneficiary_party\":{\"account_name\":\"W Owens\",\"account_number\":\"31926819\",\"account_number_code\":\"BBAN\",\"account_type\":0,\"address\":\"1 The Beneficiary Localtown SE2\",\"bank_id\":\"403000\",\"bank_id_code\":\"GBDSC\",\"name\":\"Wilfred Jeremiah Owens\"},\"charges_information\":{\"bearer_code\":\"SHAR\",\"sender_charges\":[{\"amount\":\"5.00\",\"currency\":\"GBP\"},{\"amount\":\"10.00\",\"currency\":\"USD\"}],\"receiver_charges_amount\":\"1.00\",\"receiver_charges_currency\":\"USD\"},\"currency\":\"GBP\",\"debtor_party\":{\"account_name\":\"EJ Brown Black\",\"account_number\":\"GB29XABC10161234567801\",\"account_number_code\":\"IBAN\",\"address\":\"10 Debtor Crescent Sourcetown NE1\",\"bank_id\":\"203301\",\"bank_id_code\":\"GBDSC\",\"name\":\"Emelia Jane Brown\"},\"end_to_end_reference\":\"Wil piano Jan\",\"fx\":{\"contract_reference\":\"FX123\",\"exchange_rate\":\"2.00000\",\"original_amount\":\"200.42\",\"original_currency\":\"USD\"},\"numeric_reference\":\"1002001\",\"payment_id\":\"123456789012345678\",\"payment_purpose\":\"Paying for goods/services\",\"payment_scheme\":\"FPS\",\"payment_type\":\"Credit\",\"processing_date\":\"2017-01-18\",\"reference\":\"Payment for Em's piano lessons\",\"scheme_payment_sub_type\":\"InternetBanking\",\"scheme_payment_type\":\"ImmediatePayment\",\"sponsor_party\":{\"account_number\":\"56781234\",\"bank_id\":\"123123\",\"bank_id_code\":\"GBDSC\"}}}"));
		repository.save(new PaymentResource(0,"216d4da9-e59a-4cc6-8df3-3da6e7580b77",  "Credit", LocalDateTime.parse("2017-01-18"), "743d5b63-8e6f-432e-a8fa-c5d8d2ee5fcb",
				"\"type\":\"PaymentResource\",\"paymentId\":\"216d4da9-e59a-4cc6-8df3-3da6e7580b77\",\"version\":0,\"organisation_id\":\"743d5b63-8e6f-432e-a8fa-c5d8d2ee5fcb\",\"attributes\":{\"amount\":\"100.21\",\"beneficiary_party\":{\"account_name\":\"W Owens\",\"account_number\":\"31926819\",\"account_number_code\":\"BBAN\",\"account_type\":0,\"address\":\"1 The Beneficiary Localtown SE2\",\"bank_id\":\"403000\",\"bank_id_code\":\"GBDSC\",\"name\":\"Wilfred Jeremiah Owens\"},\"charges_information\":{\"bearer_code\":\"SHAR\",\"sender_charges\":[{\"amount\":\"5.00\",\"currency\":\"GBP\"},{\"amount\":\"10.00\",\"currency\":\"USD\"}],\"receiver_charges_amount\":\"1.00\",\"receiver_charges_currency\":\"USD\"},\"currency\":\"GBP\",\"debtor_party\":{\"account_name\":\"EJ Brown Black\",\"account_number\":\"GB29XABC10161234567801\",\"account_number_code\":\"IBAN\",\"address\":\"10 Debtor Crescent Sourcetown NE1\",\"bank_id\":\"203301\",\"bank_id_code\":\"GBDSC\",\"name\":\"Emelia Jane Brown\"},\"end_to_end_reference\":\"Wil piano Jan\",\"fx\":{\"contract_reference\":\"FX123\",\"exchange_rate\":\"2.00000\",\"original_amount\":\"200.42\",\"original_currency\":\"USD\"},\"numeric_reference\":\"1002001\",\"payment_id\":\"123456789012345678\",\"payment_purpose\":\"Paying for goods/services\",\"payment_scheme\":\"FPS\",\"payment_type\":\"Credit\",\"processing_date\":\"2017-01-18\",\"reference\":\"PaymentResource for Em's piano lessons\",\"scheme_payment_sub_type\":\"InternetBanking\",\"scheme_payment_type\":\"ImmediatePayment\",\"sponsor_party\":{\"account_number\":\"56781234\",\"bank_id\":\"123123\",\"bank_id_code\":\"GBDSC\"}}}"));

		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (PaymentResource paymentResource : repository.findAll()) {
			System.out.println(paymentResource);
		}
		System.out.println();

		// fetch an individual customer
		System.out.println("PaymentResource found with findByOrgId('Alice'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByPaymentId("4ee3a8d8-ca7b-4290-a52c-dd5b6165ec43"));

		System.out.println("Customers found with findByDate('date'):");
		System.out.println("--------------------------------");
		for (PaymentResource paymentResource : repository.findByProcessingDate(LocalDateTime.parse("2015-02-20"))) {
			System.out.println(paymentResource);
		}

	}

}
