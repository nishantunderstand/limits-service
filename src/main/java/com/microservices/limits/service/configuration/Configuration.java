package com.microservices.limits.service.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


/**
 * Jun 21, 2025,8:36:29 PM 
 * This will map to 
	 * application.properties
	 * limits-service.minimum=2
	 * limits-service.maximum=998
 */

@Component
@ConfigurationProperties("limits-service") // Explained Above // Typo Not Accepted
public class Configuration {

    private int minimum;
    private int maximum;
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
    

}
