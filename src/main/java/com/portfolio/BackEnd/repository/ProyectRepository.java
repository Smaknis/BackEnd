
package com.portfolio.BackEnd.repository;

import com.portfolio.BackEnd.model.Proyect;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectRepository extends JpaRepository<Proyect, Long> {

	@Query("SELECT proyects FROM PROYECT proyects WHERE proyects.personId = :personId")
	public List<Proyect> getProyectByPersonId(@Param("personId") long personId );
	
    
}
