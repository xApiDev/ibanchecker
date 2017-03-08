package com.xapi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ServiceConfig{

  @Value("${iban.apiProtocol}")
  private String apiProtocol;

  @Value("${iban.apiDomain}")
  private String apiDomain;

  @Value("${iban.apiPath}")
  private String apiPath;

  @Value("${iban.apiIbanValidatorEndPoint}")
  private String apiIbanValidatorEndPoint;

  @Value("${iban.apikey}")
  private String apikey;

  @Value("${iban.apiFormat}")
  private String apiFormat;

  public String getApiProtocol() {
    return apiProtocol;
  }

  public String getApiDomain() {
    return apiDomain;
  }

  public String getApiPath() {
    return apiPath;
  }

  public String getApiIbanValidatorEndPoint() {
    return apiIbanValidatorEndPoint;
  }

  public String getApikey() {
    return apikey;
  }

  public String getApiFormat() {
    return apiFormat;
  }
}
