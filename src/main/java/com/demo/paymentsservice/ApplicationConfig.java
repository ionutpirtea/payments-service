package com.demo.paymentsservice;

import com.demo.utils.PaymentResourceJsonDecorator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value={"classpath:payments-services.properties"}, ignoreResourceNotFound = false)
@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
public class ApplicationConfig {

    @Value("${host.name}") String hostName;

    @Bean
    public PaymentResourceJsonDecorator paymentResourceDecorator() {
        return  new PaymentResourceJsonDecorator(hostName);
    }
}
