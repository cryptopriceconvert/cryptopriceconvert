package com.cryptopriceconverter.sf.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cryptopriceconverter.sf.model.Currency;

public interface CurrencyRepository extends JpaRepository<Currency, Long>{

	Optional<Currency> findByName(String name);

}
