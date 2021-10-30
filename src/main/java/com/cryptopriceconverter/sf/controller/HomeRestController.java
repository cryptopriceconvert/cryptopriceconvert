package com.cryptopriceconverter.sf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cryptopriceconverter.sf.model.Currency;
import com.cryptopriceconverter.sf.service.CurrencyService;

@RestController
public class HomeRestController {

	@Autowired
	public CurrencyService currencyService;

	@GetMapping("/api/crypto-convert/{conversionUnit}")
	public String getSearchResultViaAjax(@PathVariable("conversionUnit") String conversionUnit) {

		String[] unitArray = conversionUnit.split("-");
		String crypto = unitArray[0];
		Currency data = currencyService.getCurrencyByName(crypto);
		return data.getValue();

	}
}
