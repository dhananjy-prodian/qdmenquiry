package com.managedCare.salesOperation.enquiry.Response;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class CallInformation {
	
	
	private  CallReceivedBy received_by;
	private  AssignedTo assigned_to;

}
