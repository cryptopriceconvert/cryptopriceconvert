package com.cryptopriceconverter.sf.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Ethinr {

	private String base_unit;
	private String quote_unit;
	private BigDecimal buy;
	
	public String getBase_unit() {
		return base_unit;
	}
	public void setBase_unit(String base_unit) {
		this.base_unit = base_unit;
	}
	public String getQuote_unit() {
		return quote_unit;
	}
	public void setQuote_unit(String quote_unit) {
		this.quote_unit = quote_unit;
	}
	public BigDecimal getBuy() {
		return buy;
	}
	public void setBuy(BigDecimal buy) {
		this.buy = buy;
	}
	
	
}
