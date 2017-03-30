package com.xapi.services;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xapi.config.ServiceConfig;
import com.xapi.model.BankData;
import com.xapi.model.IBAN;
import com.xapi.model.SepaData;
import com.xapi.model.Validation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URL;
import java.util.ArrayList;

@Service
public class IbanEndPointService {

    @Autowired
    ServiceConfig config;

    private final RestTemplate restTemplate;

    public IbanEndPointService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @HystrixCommand(fallbackMethod="retrieveFallbackgetIBAN")
    public IBAN getIBAN(String ibanNumber) {
        String apiProtocol = config.getApiProtocol();
        String apiIbanDomain = config.getApiDomain();
        String apiPath = config.getApiPath();
        String apiIbanValidatorEndPoint = config.getApiIbanValidatorEndPoint();
        String apiKey = config.getApikey();
        String apiFormat = config.getApiFormat();
        String urlApiValidationIban = apiProtocol + "://" + apiIbanDomain + apiPath + apiIbanValidatorEndPoint + "?format={apiFormat}&api_key={apiKey}&iban={ibanNumber}";
        return this.restTemplate.getForObject(urlApiValidationIban, IBAN.class, apiFormat, apiKey, ibanNumber);
    }

    @HystrixCommand
    public IBAN retrieveFallbackgetIBAN(String ibanNumber) {
        return new IBAN();
    }
}
