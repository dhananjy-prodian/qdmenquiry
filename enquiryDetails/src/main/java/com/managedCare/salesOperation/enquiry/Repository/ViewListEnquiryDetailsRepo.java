package com.managedCare.salesOperation.enquiry.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.managedCare.salesOperation.enquiry.Entity.EnquiryDetailList;

@Repository
public interface ViewListEnquiryDetailsRepo extends JpaRepository<EnquiryDetailList, Integer>{
		
}
