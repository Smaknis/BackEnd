
package com.portfolio.BackEnd.repository;

import com.portfolio.BackEnd.model.JobUbication;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface JobUbicationRepository extends JpaRepository<JobUbication, Long> {

	@Query("SELECT jobu FROM JOB_UBICATION jobu WHERE jobu.personId = :personId")
	public List<JobUbication> getjobUbicationByPersonId(@Param("personId") long personId );
    
}
