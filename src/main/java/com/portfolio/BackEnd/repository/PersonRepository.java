
package com.portfolio.BackEnd.repository;

import com.portfolio.BackEnd.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import com.portfolio.BackEnd.model.Person;

@Repository
public interface PersonRepository extends JpaRepository <PersonRepository, Long>{

    public void save(Person per);
    
}
