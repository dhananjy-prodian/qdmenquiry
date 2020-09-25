package com.managedCare.salesOperation.enquiry.Entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.Getter;

@Entity
@Data
@Getter
@Table(name = "tb_enquiry")
public class GetEnquiry {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ENQUIRY_ID", nullable = false)
	private int enquiryId;
	@Column(name = "Title", nullable = false)
	private String title;
	@Column(name = "NAME", nullable = false)
	private String name;
	@Column(name = "Code", nullable = false)
	private String code;
	@Column(name = "Mobile_Number", nullable = false)
	private String mobNo;
	@Column(name="Address", nullable = false)
	private String address;
	@Column(name="Role", nullable = true)
	private String role;
	@Column(name="caller_id", nullable = false)
	private int callerId;
	@Column(name="relationship_id", nullable = false)
	private int relationshipId;
	@Column(name="tb_referral_id", nullable = false)
	private int referralId;
	@Column(name = "tb_assigned_id")
	private int assignedId;
	@Column(name = "COMPLAIN", nullable = true)
	private String complain;
	@Column(name = "Med_Hist", nullable = false)
	private String medicalHistory;
	@Column(name = "Doc_Seen", nullable = false)
	private boolean docCheck;
	@Column(name = "Height", nullable = false)
	private String height;
	@Column(name = "Weight", nullable = false)
	private String weight;
	@Column(name = "feeding", nullable = false)
	private int feeding;
	@Column(name = "bathing", nullable = false)
	private int bathing;
	@Column(name = "toileting", nullable = false)
	private int toileting;
	@Column(name = "grooming", nullable = false)
	private int grooming;
	@Column(name = "ambulation", nullable = false)
	private int ambulation;
	@Column(name= "transfer", nullable = false)
	private int transfer;
	@Column(name= "bed_mobility", nullable = false)
	private int bedMobilty;
	@Column(name= "recommendation", nullable = false)
	private int recommendation;
	@Column(name= "servicePreferred", nullable = false)
	private int servicePreferred;
	@Column(name = "activities",nullable = true)
	private String activities;
	@Column(name= "rehab_criteria", nullable = false)
	private String rehabCriteria;
	@Column(name="enquiry_type_id", nullable = false)
	private int enquiryTypeId;
	@Column(name = "status",nullable = false)//Open Close Pending
	private String status;
	@Column(name = "lead_time", nullable = false)
	private int leadTime;
	@Column(name = "created_By", nullable = false)
	private String createdBy;
	@Column(name = "closed_time",nullable = true)
	private Timestamp closedTime;
	@Column(name = "updated_by",nullable = false)
	private String updatedBy;
	@Column(name = "updated_date",nullable = false)
	private Timestamp updatedDate;
	@Column(name = "created_date", nullable = false)
	private Timestamp createdDate;
}