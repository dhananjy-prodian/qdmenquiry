package com.managedCare.salesOperation.enquiry.Response;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class SeenDoctor {
	private boolean is_seen;
	private String statement;

}
