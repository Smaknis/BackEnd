
package com.portfolio.BackEnd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class JobUbication {
    @Id
    private Long id;
    @Column
    private String job_ubication;

    public JobUbication() {
    }

    public JobUbication(Long id, String job_ubication) {
        this.id = id;
        this.job_ubication = job_ubication;
    }
    
    
}
