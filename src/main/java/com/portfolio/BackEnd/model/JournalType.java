
package com.portfolio.BackEnd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity (name = "journal_type")
public class JournalType {
    @Id
    private Long id;
    @Column
    private String journal_type;

    public JournalType() {
    }

    public JournalType(Long id, String journal_type) {
        this.id = id;
        this.journal_type = journal_type;
    }
    
    
}
