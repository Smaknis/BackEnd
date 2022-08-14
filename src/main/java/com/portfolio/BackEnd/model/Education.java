
package com.portfolio.BackEnd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity (name = "education")
public class Education {
    
    @Id
    private Long id;
    @Column
    private String institute;
    @Column
    private String title;
    @Column
    private String score;
    @Column
    private String year_start;
    @Column
    private String year_end;
    @Column
    private String url_logo;
    @Column
    private String person_id;

    public Education() {
    }

    public Education(Long id, String institute, String title, String score, String year_start, String year_end, String url_logo, String person_id) {
        this.id = id;
        this.institute = institute;
        this.title = title;
        this.score = score;
        this.year_start = year_start;
        this.year_end = year_end;
        this.url_logo = url_logo;
        this.person_id = person_id;
    }

        
}
