
package com.portfolio.BackEnd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity (name = "job")
public class Job {
    @Id
    private Long id;
    @Column
    private String position;
    @Column
    private String company;
    @Column
    private String date_start;
    @Column
    private String date_end;
    @Column
    private String actual;
    @Column
    private String url_logo;
    @Column
    private String person_id;
    @Column
    private String job_ubication;
    @Column
    private String journal_type_id;

    public Job() {
    }

    public Job(Long id, String position, String company, String date_start, String date_end, String actual, String url_logo, String person_id, String job_ubication, String journal_type_id) {
        this.id = id;
        this.position = position;
        this.company = company;
        this.date_start = date_start;
        this.date_end = date_end;
        this.actual = actual;
        this.url_logo = url_logo;
        this.person_id = person_id;
        this.job_ubication = job_ubication;
        this.journal_type_id = journal_type_id;
    }
    
    
}
