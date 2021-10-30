package com.cryptopriceconverter.sf.service;

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
//		List<Currency> currencies = new ArrayList<Currency>();
		List<Currency> currenc = currencyRepo.findAll();
		return currenc;
	}
	
	public Currency getCurrencyByID(Long id) {
		Currency c = currencyRepo.findById(id).get();
		return c;
	}
	
	public Currency getCurrencyByName(String name) {
		Currency c = currencyRepo.findByName(name).get();
		return c;
	}
}
