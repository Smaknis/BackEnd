
package com.portfolio.BackEnd.repository;

import com.portfolio.BackEnd.model.SoftSkills;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SoftSkillsRepository extends JpaRepository<SoftSkills, Long> {

	@Query("SELECT soft FROM SOFT_SKILL soft WHERE soft.personId = :personId")
	public List<SoftSkills> getSoftSkillsByPersonId(@Param("personId") long personId );
	
    
}
