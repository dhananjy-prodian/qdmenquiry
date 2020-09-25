package com.managedCare.salesOperation.enquiry.Entity;


import java.sql.Timestamp;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;


@Entity
@Data
@Table(name = "tb_enquiry")
public class EnquiryDetails{
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ENQUIRY_ID", nullable = false)
	private int enquiryId;
	@Column(name = "created_date", nullable = false)
	private Timestamp createdDate;
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
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="tb_assigned_id")
	private AssignedBy assignedBy;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="CALLER_ID")
	private CreateContact contactAdded;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="RELATIONSHIP_ID")
	private Relationship relationship;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "tb_referral_id")
	private Referral referral;
	@Column(name = "COMPLAIN", nullable = true)
	private String complain;
	@Column(name="Role", nullable = true)
	private String role;
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
	@Column(name = "status",nullable = false)//Open Close Pending
	private String status;
	@OneToOne(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="enquiry_type_id")
	private EnquiryType enquiryTypeId;
	@Column(name = "lead_time", nullable = false)
	private int leadTime;
	@Column(name = "closed_time",nullable = true)
	private Timestamp closedTime;
	@Column(name = "created_By", nullable = false)
	private String createdBy;
	@Column(name = "updated_by",nullable = false)
	private String updatedBy;
	@Column(name = "updated_date",nullable = false)
	private Timestamp updatedDate;
}
