package com.xapi.controllers;


import com.xapi.config.ServiceConfig;
import com.xapi.model.IBAN;
import com.xapi.services.IbanEndPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IbanEndPointServiceController {

    @Autowired
    private IbanEndPointService ibanEndPointService;

    @Autowired
    private ServiceConfig serviceConfig;

    @RequestMapping("/iban/{ibanNumber}")
    public IBAN getIBANInfo(@PathVariable("ibanNumber") String ibanNumber) {
        return ibanEndPointService.getIBAN(ibanNumber);
    }
}
