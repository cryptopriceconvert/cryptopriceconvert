package com.cryptopriceconverter.sf.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cryptopriceconverter.sf.model.Currency;
import com.cryptopriceconverter.sf.repo.CurrencyRepository;

@Service
public class CurrencyService {

	@Autowired
	public CurrencyRepository currencyRepo;
	
	public List<Currency> getAllCurrencies(){
		List<Currency> currencies = new ArrayList<Currency>();
		// List<Currency> currenc = currencyRepo.findAll();
		return currencies;
	}
	
	public Currency getCurrencyByID(Long id) {
		Currency c = currencyRepo.findById(id).get();
		return c;
	}
}
