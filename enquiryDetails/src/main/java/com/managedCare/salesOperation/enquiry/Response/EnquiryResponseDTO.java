package com.managedCare.salesOperation.enquiry.Response;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.stereotype.Component;

import com.managedCare.salesOperation.enquiry.Entity.EnquiryType;

import lombok.Data;

@Component
@Data
public class EnquiryResponseDTO {
	
	private String title;
	private String name;
	private String code;
	private String mobNo;
	private String address;
	private int enquiryId;
	private Timestamp createdDate;
	private int callerId;
	private String contactName;
	private int relationshipId;
	private String relationshipName;//Relationship
	private int referralId;//Referral
	private String referralName;
	private String complain;
	private String medicalHistory;
	private boolean docCheck;
	private String height;
	private String weight;
	private int feeding;
	private int bathing;
	private int toileting;
	private int grooming;
	private int ambulation;
	private int transfer;
	private int bedMobilty;
	private int recommendation;
	private int servicePreferred;
	private List<Integer> activities;
	private String rehabCriteria;
	private int enquiryTypeId;
	private String status;
	private int leadTime;
	private String createdBy;
	private Timestamp closedTime;
	private String updatedBy;
	private Timestamp updatedDate;
		
}
