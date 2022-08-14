
package com.portfolio.BackEnd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyect {
    @Id
    private Long id;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private String person_id;

    public Proyect() {
    }

    public Proyect(Long id, String name, String description, String person_id) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.person_id = person_id;
    }
    
    
}
