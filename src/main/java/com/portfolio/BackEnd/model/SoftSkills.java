
package com.portfolio.BackEnd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity (name = "soft_skill")
public class SoftSkills {
    @Id
    private Long id_soft;
    @Column
    private String title_soft;
    @Column
    private String score_soft;
    @Column
    private String person_id;

    public SoftSkills() {
    }

    public SoftSkills(Long id_soft, String title_soft, String score_soft, String person_id) {
        this.id_soft = id_soft;
        this.title_soft = title_soft;
        this.score_soft = score_soft;
        this.person_id = person_id;
    }
    
    
}
