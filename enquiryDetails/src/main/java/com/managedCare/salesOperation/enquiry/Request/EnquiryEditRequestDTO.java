package com.managedCare.salesOperation.enquiry.Request;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.stereotype.Component;
import lombok.Data;

@Component
@Data
public class EnquiryEditRequestDTO {
	
	private String title;
	private String name;
	private String code;
	private String mobNo;
	private String address;
	private int enquiryId;
	private Timestamp createdDate;
	private int callerId;
	private int relationshipId;
	private int referralId;
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
