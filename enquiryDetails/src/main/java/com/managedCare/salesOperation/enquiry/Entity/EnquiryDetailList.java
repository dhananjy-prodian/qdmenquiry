package com.managedCare.salesOperation.enquiry.Entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "tb_enquiry")
public class EnquiryDetailList {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ENQUIRY_ID", nullable = false)
	private int enquiryId;
	@Column(name = "created_date",nullable = false)
	private Timestamp createdDate;
	@Column(name = "NAME", nullable = false)
	private String name;
	@Column(name = "status",nullable = false)
	private String status;
	@Column(name = "lead_time", nullable = false)
	private int leadTime;
}
