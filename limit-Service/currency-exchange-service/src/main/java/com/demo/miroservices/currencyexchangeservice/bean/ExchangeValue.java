package com.demo.miroservices.currencyexchangeservice.bean;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class ExchangeValue {
	public void setPort(String port) {
		this.port = port;
	}


	@Id
	private Long id;
	@Column(name="currency_from")
	private String from;
	@Column(name="currency_to")
	private String to;
	private BigDecimal conversionMultiple;
	private String port;
	public String getPort() {
		return port;
	}


	protected ExchangeValue() {
		
	}
	
	
	public ExchangeValue(Long id, String from, String to, BigDecimal conversionMultiple, String port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.port=port;
	}


	public Long getId() {
		return id;
	}


	public String getFrom() {
		return from;
	}


	public String getTo() {
		return to;
	}


	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

}
