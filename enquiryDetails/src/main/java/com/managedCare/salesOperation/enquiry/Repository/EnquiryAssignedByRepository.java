package com.managedCare.salesOperation.enquiry.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.managedCare.salesOperation.enquiry.Entity.AssignedBy;

public interface EnquiryAssignedByRepository extends JpaRepository<AssignedBy, Integer>{
	@Query(value = "select FIRST_NAME from tb_assigned", nativeQuery=true)
	List<String> findbyAssignedFirtsName();

}
