package com.in28minutes.microservices.limitsservice.configuration;

import org.springframework.stereotype.Component;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Component
@ConfigurationProperties("limits-service")
public class Configuration {
	
	private int minimum; //auto mapped from properties file due to anotation (using setter method)
	
	private int maximum; //auto mapped from properties file due to anotation (using setter method)

	public int getMinimum() {
		return minimum;
	}
	
	public int getMaximum() {
		return maximum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	
	

}
