package com.managedCare.salesOperation.enquiry.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.managedCare.salesOperation.enquiry.Entity.Referral;

@Repository
public interface ReferralRepository extends JpaRepository<Referral, Integer> {

	@Query(value = "select NAME from tb_referral", nativeQuery = true)
	public List<String> findAllReferralByName();
	@Query(value = "Select Name from tb_referral where tb_referral_id = :referralId",nativeQuery = true)
	public String getReferralById(int referralId);

}
