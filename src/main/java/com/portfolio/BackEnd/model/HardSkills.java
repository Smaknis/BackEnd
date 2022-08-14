
package com.portfolio.BackEnd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity (name = "hard_skill")
public class HardSkills {
    
    @Id
    private Long id;
    @Column
    private String title;
    @Column
    private String score;
    @Column
    private String person_id;

    public HardSkills() {
    }

    public HardSkills(Long id, String title, String score, String person_id) {
        this.id = id;
        this.title = title;
        this.score = score;
        this.person_id = person_id;
    }
    
    
}
