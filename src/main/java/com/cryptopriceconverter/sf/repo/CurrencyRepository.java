package com.cryptopriceconverter.sf.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cryptopriceconverter.sf.model.Currency;

public interface CurrencyRepository extends JpaRepository<Currency, Long>{

//	public List<Currency> find
}
