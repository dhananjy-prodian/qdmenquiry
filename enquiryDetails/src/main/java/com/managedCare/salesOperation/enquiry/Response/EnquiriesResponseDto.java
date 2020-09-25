package com.managedCare.salesOperation.enquiry.Response;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.stereotype.Component;

import com.managedCare.salesOperation.enquiry.Entity.EnquiryType;

import lombok.Data;

@Component
@Data
public class EnquiriesResponseDto {
	
	private int enquiry_id;
	private Enquiries_Type enquiry_type;
	private Timestamp enquired_on;
	private String name;
	private String gender;
	private int age;
	private CallInformation call_information;
	private CallerInformation caller_information;
	private List<ContactInformation> contact_information;
	private String complaint;
	private String medical_history;
	private SeenDoctor seen_a_doctor;
	private List<VerbalAssessment> verbal_assement;
	private List<ActivityOfDailyLiving> activities_of_daily_living;
	private  List<String> other_activities;
	private Recommendation recommendations;
	private List<ServiceReferred> services_referred;
	private String regen_rehab_criteria;
	private String other_issues;
	private SourceOfReferral source_of_referrel;	
}
