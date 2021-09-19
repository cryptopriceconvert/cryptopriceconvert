package com.cryptopriceconverter.sf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Scheduler {

	@Autowired
	public RestTemplate restTemplate;

//	@Scheduled(fixedDelay = 86400000, initialDelay = 1000) // after 24 hours
//	public void fetchCurrencyData() throws JsonMappingException, JsonProcessingException {
//
//		String url = "https://v6.exchangerate-api.com/v6/83ce5e2d42df1a101582e6ef/latest/USD";
//		HttpHeaders headers = new HttpHeaders();
//		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//		HttpEntity<String> entity = new HttpEntity<String>(headers);
//
//		String data = restTemplate.exchange(url, HttpMethod.GET, entity, String.class)
//				.getBody();
//		ObjectMapper mapper = new ObjectMapper();
//		JsonNode rootNode = mapper.readTree(data);
//		JsonNode nameNode = rootNode.path("conversion_rates");
//		Context c = new Context();
//		c.setVariable("currency_rate", nameNode);
//		System.out.println(nameNode);
//	}
}
