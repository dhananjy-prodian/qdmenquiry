package com.managedCare.salesOperation.enquiry.Response;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class ServiceReferred {
	private int value;
	private String label;

}
