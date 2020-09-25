package com.managedCare.salesOperation.enquiry.Response;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class AssignedTo {
	private int id;
	private String role;
	private String name;

}
