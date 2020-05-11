package com.demo.currencyconversionservice;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.currencyconversionservice.bean.CurrencyConversion;

@RestController
public class CurrencyConversionServiceController {
	@Autowired
	CurrencyExchangeProxy proxy;
	
	@GetMapping("/currency-coversion/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion convertCurrency(@PathVariable String from,@PathVariable String to,@PathVariable BigDecimal quantity) {
		CurrencyConversion currencyconversion=proxy.getCurrencyExchange(from, to);
		return new CurrencyConversion(currencyconversion.getId(),from,to,currencyconversion.getConversionMultiple(),quantity,currencyconversion.getConversionMultiple().multiply(quantity),currencyconversion.getPort());
		
	}

}
