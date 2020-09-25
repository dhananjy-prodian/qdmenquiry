package com.managedCare.salesOperation.enquiry.Request;



import org.springframework.stereotype.Component;
import lombok.Data;

@Component
@Data
public class ReferralDTO {
	
	private int referralId;
	private String name;

}
