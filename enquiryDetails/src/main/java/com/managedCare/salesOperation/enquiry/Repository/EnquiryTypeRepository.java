package com.managedCare.salesOperation.enquiry.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.managedCare.salesOperation.enquiry.Entity.EnquiryType;

@Repository
public interface EnquiryTypeRepository extends JpaRepository<EnquiryType,Integer>{
	
	@Query(value = "select Enquiry_Name from tb_enquirytype", nativeQuery = true)
	public List<String> findAllEnquiryTypeByName();

}
