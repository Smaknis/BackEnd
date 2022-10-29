
package com.portfolio.BackEnd.repository;

import com.portfolio.BackEnd.model.Education;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationRepository extends JpaRepository<Education, Long> {

	@Query("SELECT edu FROM education edu WHERE edu.personId = :personId")
	public List<Education> getEducationByPersonId(@Param("personId") long personId );
    
}
