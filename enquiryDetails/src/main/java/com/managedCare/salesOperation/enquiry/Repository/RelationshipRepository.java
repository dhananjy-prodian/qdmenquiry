package com.managedCare.salesOperation.enquiry.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.managedCare.salesOperation.enquiry.Entity.Relationship;

@Repository
public interface RelationshipRepository extends JpaRepository<Relationship, Integer>{
	
	@Query(value = "select RELATIONSHIP from tb_relationship", nativeQuery = true)
	public List<String> findAllRelationship();
	@Query(value = "select RELATIONSHIP from tb_relationship WHERE relationship_id = :relationshipId", nativeQuery = true)
	public String getNameById(int relationshipId);

}
