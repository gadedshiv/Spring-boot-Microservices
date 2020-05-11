package com.demo.miroservices.currencyexchangeservice;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.miroservices.currencyexchangeservice.bean.ExchangeValue;

@RestController
public class CurrencyExchangeController {
	@Autowired
	private CurrencyExchangeRepository repository;
	
	@Autowired
	Environment environment;
	
	@GetMapping("/currency-exchange/{from}/to/{to}")
	public ExchangeValue getCurrencyExchange(@PathVariable String from,@PathVariable String to) {
		ExchangeValue exchangeValue = repository.findByFromAndTo(from, to);
		exchangeValue.setPort(environment.getProperty("server.port"));
		return exchangeValue;
	}

}
