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
@Table(name = "tb_call_received")
public class CallReceivedBy {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "call_received_id")
	private int callReceivedId;
	@Column(name = "Role", nullable = false)
	private String role;
	@Column(name = "NAME", nullable = false)
	private String Name;
	@Column(name = "CREATED_BY", nullable = false)
	private String creadtedBy;
	@Column(name = "CREATED_DATE", nullable = false)
	private Timestamp createdDate;
	@Column(name = "UPDATED_BY", nullable = false)
	private String updatedBy;
	@Column(name = "UPDATED_DATE", nullable = false)
	private Timestamp updatedDate;

}
