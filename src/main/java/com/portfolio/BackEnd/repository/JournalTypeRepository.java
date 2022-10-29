
package com.portfolio.BackEnd.repository;

import com.portfolio.BackEnd.model.JournalType;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface JournalTypeRepository extends JpaRepository<JournalType, Long> {

	@Query("SELECT journal FROM JOURNAL_TYPE journal WHERE journal.personId = :personId")
	public List<JournalType> getJournalTypeByPersonId(@Param("personId") long personId );
	
    
}
