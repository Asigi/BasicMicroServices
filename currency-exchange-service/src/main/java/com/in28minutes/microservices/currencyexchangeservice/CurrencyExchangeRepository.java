package com.in28minutes.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {
	
	
	/**
	 * Implementation will be provided by Spring JPA.
	 *	It will convert this into an SQL query where the table will be queried by from and to.
	 */
	CurrencyExchange findByFromAndTo(String from, String to);

}
