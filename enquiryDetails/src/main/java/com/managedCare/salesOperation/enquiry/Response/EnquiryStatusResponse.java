package com.managedCare.salesOperation.enquiry.Response;

import java.util.List;
import lombok.Data;

@Data
public class EnquiryStatusResponse {
	private List<Status> stats;
	private List<EnquiryListResponseDetails> list;
	
}
