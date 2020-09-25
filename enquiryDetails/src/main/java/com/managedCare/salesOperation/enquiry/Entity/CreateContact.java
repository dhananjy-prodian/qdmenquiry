package com.managedCare.salesOperation.enquiry.Entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "tb_caller_detail")
public class CreateContact {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "CALLER_ID", nullable = false)
	private int callerId;
	@Column(name = "title", nullable = false)
	private String title;
	@Column(name= "CALLER_NAME", nullable = false)
	private String callerName;
	@Column(name = "DOB", nullable = false)
	private String dob;
	@Column(name = "GENDER", nullable = false)
	private String gender;
	@Column(name = "CODE", nullable = false)
	private String code;
	@Column(name = "mobNumber", nullable = false)
	private String mobNumber;
	@Column(name = "PERMANENT_ADDRESS", nullable = false)
	private String permanentAddress;
	@Column(name = "CURRENT_ADDRESS", nullable = false)
	private String currentAddress;
	@Column(name = "LANGUAGE", nullable = false)
	private String language;
	@Column(name = "CREATED_BY", nullable = true)
	private String creadtedBy;
	@Column(name = "CREATED_DATE", nullable = true)
	private Timestamp createdDate;
	@Column(name = "UPDATED_BY", nullable = true)
	private String updatedBy;
	@Column(name = "UPDATED_DATE",nullable = true)
	private Timestamp updatedDate;
	@OneToOne(mappedBy="contactAdded",fetch = FetchType.EAGER)
	private EnquiryDetails enquiry;
}
