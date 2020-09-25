package com.managedCare.salesOperation.enquiry.Request;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.stereotype.Component;
import com.managedCare.salesOperation.enquiry.Entity.CreateContact;
import com.managedCare.salesOperation.enquiry.Entity.EnquiryType;
import com.managedCare.salesOperation.enquiry.Entity.Referral;
import com.managedCare.salesOperation.enquiry.Entity.Relationship;
import lombok.Data;

@Component
@Data
public class EnquiryRequestDTO {
	private int enquiryId;
	private String title;
	private String name;
	private String code;
	private String mobNo;
	private String address;
	private Timestamp createdDate;
	private CreateContact contactAdded;
	private Relationship relationship;
	private Referral referral;
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
	private String status;
	private EnquiryType enquiryType;
	private int leadTime;
	private String createdBy;
	private Timestamp closedTime;
	private String updatedBy;
	private Timestamp updatedDate;

}
