package com.managedCare.salesOperation.enquiry.Response;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class VerbalAssessment {
	private String value;
	private String label;

}
