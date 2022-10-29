
package com.portfolio.BackEnd.repository;

import com.portfolio.BackEnd.model.HardSkills;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HardSkillRepository extends JpaRepository<HardSkills, Long> {

	@Query("SELECT hard FROM HARD_SKILL hard WHERE hard.personId = :personId")
	public List<HardSkills> getHardSkillsByPersonId(@Param("personId") long personId );
    
}
