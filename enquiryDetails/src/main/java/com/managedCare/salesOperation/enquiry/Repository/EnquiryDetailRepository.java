package com.managedCare.salesOperation.enquiry.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.managedCare.salesOperation.enquiry.Entity.CustomerSupport;

@Repository
public interface EnquiryDetailRepository extends JpaRepository<CustomerSupport, Integer>{
	
	@Query(value = "select FIRST_NAME from tb_customer_support", nativeQuery=true)
	public List<String> findAllCustomerByFirstName();

	
	
	
	
}
