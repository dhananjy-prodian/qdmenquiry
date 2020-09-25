package com.managedCare.salesOperation.enquiry.Repository;

import java.sql.Timestamp;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.managedCare.salesOperation.enquiry.Entity.GetEnquiry;


@Repository
@Transactional
public interface UpdateEnquiryRepo extends JpaRepository<GetEnquiry, Integer>{
	@Query(value = "Select enquiry_id,address,ambulation,bathing,bed_mobility,caller_name,code,complain,created_date,doc_seen,feeding,grooming,height,med_hist,mobile_number,recommendation,rehab_criteria,service_preferred,title,toileting,transfer,weight,caller_id,tb_referral_id,relationship_id from tb_enquiry where enquiry_id= :id",nativeQuery=true)
	GetEnquiry findEnquiryById(int id);
	@Modifying
	@Query(value="Update tb_enquiry set address = :address,title=:title,caller_Name=:callerName,code = :code,mobile_number=:mobNo, caller_id=:callerId,relationship_id=:relationshipId,tb_referral_id=:referralId,complain=:complain,med_hist=:medHistory,doc_seen=:docCheck,height=:height,weight=:weight,feeding=:feeding,bathing=:bathing,toileting=:toileting,grooming=:grooming,ambulation=:ambulation,transfer=:transfer,bed_Mobility=:bedMobility,recommendation=:recommendation,service_preferred=:servicePreferred,activities=:activitiesDet,rehab_criteria=:rehab,status=:status,enquiry_type_id=:enquiryTypeId,lead_time=:leadTime,created_By=:createdBy,created_date=:createdDate,updated_by=:updatedBy,updated_date=current_timestamp where enquiry_id= :id",nativeQuery=true)
	int updateEnquiry(String address, String title, String callerName, String code, String mobNo, int callerId,int relationshipId, int referralId, String complain, String medHistory, boolean docCheck, String height,String weight, int feeding, int bathing, int toileting, int grooming, int ambulation, int transfer,int bedMobility, int recommendation, int servicePreferred,String activitiesDet,String rehab,int enquiryTypeId, String status, int leadTime,String createdBy,Timestamp createdDate,String updatedBy, int id);

}
