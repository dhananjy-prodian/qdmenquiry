package com.managedCare.salesOperation.enquiry.Response;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Recommendation {
	
	private int id;
	private String label;
	private int value;
	private String type;
	

}
