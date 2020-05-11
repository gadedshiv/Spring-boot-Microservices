package com.demo.currencyconversionservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.demo.currencyconversionservice.bean.CurrencyConversion;


@FeignClient("currency-exchange-service")
@RibbonClient("currency-exchange-service")
public interface CurrencyExchangeProxy {
	
	@GetMapping("/currency-exchange/{from}/to/{to}")
	public CurrencyConversion getCurrencyExchange(@PathVariable("from") String from,@PathVariable("to") String to);
	

}
