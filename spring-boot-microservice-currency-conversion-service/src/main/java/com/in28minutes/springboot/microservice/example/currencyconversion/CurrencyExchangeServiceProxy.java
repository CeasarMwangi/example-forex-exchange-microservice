package com.in28minutes.springboot.microservice.example.currencyconversion;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * This will be the Feign Proxy to call the Forex Service.
 * 
 * <dependency>
 * 	<groupId>org.springframework.cloud</groupId>
 * 	<artifactId>spring-cloud-starter-openfeign</artifactId>
 * </dependency>
 * 
 * Feign Proxy
 * Feign provide a better alternative to RestTemplate to call REST API.
 * 
 * @FeignClient(name="forex-service") - Declares that this is a Feign Client
 * 
 * 
 * @author kanja
 *
 */
@FeignClient(name="forex-service")
@RibbonClient(name="forex-service")
public interface CurrencyExchangeServiceProxy {
	
	//URI of the service we would want to consume
  @GetMapping("/currency-exchange/from/{from}/to/{to}")
  public CurrencyConversionBean retrieveExchangeValue
    (@PathVariable("from") String from, @PathVariable("to") String to);
}