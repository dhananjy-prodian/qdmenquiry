package com.managedCare.salesOperation.enquiry.Request;



import org.springframework.stereotype.Component;
import lombok.Data;

@Component
@Data
public class CreateContactDTO {
	
	private int callerId;
	private String title;
	private String callerName;
	private String dob;
	private String gender;
	private String code;
	private String mobNumber;
	private String permanentAddress;
	private String currentAddress;
	private String language;

}
