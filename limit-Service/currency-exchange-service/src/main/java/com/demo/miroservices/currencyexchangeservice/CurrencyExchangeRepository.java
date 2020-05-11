package com.demo.miroservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.miroservices.currencyexchangeservice.bean.ExchangeValue;

public interface CurrencyExchangeRepository extends JpaRepository<ExchangeValue, Long>{
	
	public ExchangeValue findByFromAndTo(String from,String to);

}
