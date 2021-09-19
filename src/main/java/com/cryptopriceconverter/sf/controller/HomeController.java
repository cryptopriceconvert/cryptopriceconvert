package com.cryptopriceconverter.sf.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.cryptopriceconverter.sf.model.AllCrypto;
import com.cryptopriceconverter.sf.model.Currency;
import com.cryptopriceconverter.sf.service.CurrencyService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class HomeController {

	@Autowired
	public CurrencyService currencyService;

	@Autowired
	public RestTemplate restTemplate;

	@GetMapping("/")
	public String getFirstHomePage() {
		return "home.html";
	}

	@GetMapping("/home")
	public String getHomePage() {
		return "home.html";
	}

	@GetMapping("/about-us")
	public String getAboutUsPage() {
		return "about-us.html";
	}

	@GetMapping("/privacy-policy")
	public String getPrivacyPolicyPage() {
		return "privacy-policy.html";
	}

	@GetMapping("/contact-us")
	public String getContactUsPage() {
		return "contact-us.html";
	}

	@GetMapping("/blog")
	public String getBlogPage() {
		return "blog.html";
	}

	// end point would be http://base_url/currency-convert/usd-to-inr
	@GetMapping("/currency-convert/{conversionUnit}")
	public String convertCurrency(@PathVariable("conversionUnit") String conversionUnit) {
		List<Currency> currencies = currencyService.getAllCurrencies();
		Currency cs = currencyService.getCurrencyByID(1L);
		currencies.forEach(c -> System.out.println(c));
		System.out.println(cs.getName());
		return conversionUnit + ".html";
	}

	// end point would be http://base_url/crypto-convert/btc-to-dot
	@GetMapping("/crypto-convert/{conversionUnit}")
	public String convertCrypto(@PathVariable("conversionUnit") String conversionUnit) {
		System.out.println(conversionUnit);
		return conversionUnit;
	}

	@GetMapping("/crypto/price")
	public String cryptoPrice(Model model) throws JsonMappingException, JsonProcessingException {
		String url = "https://api.wazirx.com/api/v2/tickers";
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);

		String data = restTemplate.exchange(url, HttpMethod.GET, entity, String.class).getBody();
		ObjectMapper mapper = new ObjectMapper();
		AllCrypto rootNode = mapper.readValue(data, AllCrypto.class);
		model.addAttribute("allCrypto", rootNode);
		return "success.html";
	}
}
