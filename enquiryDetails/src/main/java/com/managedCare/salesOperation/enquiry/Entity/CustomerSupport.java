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

@Table(name = "tb_customer_support")
public class CustomerSupport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_support_id")
	private int supportId;
	@Column(name = "FIRST_NAME", nullable = false)
	private String firstName;
	@Column(name = "LAST_NAME", nullable = false)
	private String lastName;
	@Column(name = "CREATED_BY", nullable = false)
	private String creadtedBy;
	@Column(name = "CREATED_DATE", nullable = false)
	private Timestamp createdDate;
	@Column(name = "UPDATED_BY", nullable = false)
	private String updatedBy;
	@Column(name = "UPDATED_DATE", nullable = false)
	private Timestamp updatedDate;
}
