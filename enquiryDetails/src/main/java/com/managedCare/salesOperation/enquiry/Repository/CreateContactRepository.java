package com.managedCare.salesOperation.enquiry.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.managedCare.salesOperation.enquiry.Entity.CreateContact;

@Repository
public interface CreateContactRepository extends JpaRepository<CreateContact, Integer>{
	@Query(value="SELECT CONCAT(title,' ',caller_name) from tb_caller_detail",nativeQuery = true)
	List<String> findAllCallerNameWithTitle();
	@Query(value="SELECT CONCAT(title,' ',caller_name) from tb_caller_detail WHERE CALLER_ID =:callerId",nativeQuery = true)
	String getContactById(int callerId);

}
