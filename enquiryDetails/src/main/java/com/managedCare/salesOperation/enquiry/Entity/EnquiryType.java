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
@Table(name = "tb_enquirytype")
public class EnquiryType {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "enquiry_type_id")
	private int enquiryTypeId;
	@Column(name = "Enquiry_Name", nullable = false)
	private String name;
	@Column(name = "lead_time", nullable = true)
	private int leadTime;
	@Column(name = "CREATED_BY", nullable = true)
	private String creadtedBy;
	@Column(name = "CREATED_DATE", nullable = true)
	private Timestamp createdDate;
	@Column(name = "UPDATED_BY", nullable = true)
	private String updatedBy;
	@Column(name = "UPDATED_DATE",nullable = true)
	private Timestamp updatedDate;
}
