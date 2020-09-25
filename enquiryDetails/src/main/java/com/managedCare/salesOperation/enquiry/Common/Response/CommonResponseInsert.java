package com.managedCare.salesOperation.enquiry.Common.Response;

import java.io.Serializable;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class CommonResponseInsert implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String status;
	private HttpStatus statusCode;
	private String message;
	private String data;
	private String error;
	
	
	

}
