
package com.portfolio.BackEnd.dto;

import com.portfolio.BackEnd.model.Education;
import com.portfolio.BackEnd.model.HardSkills;
import com.portfolio.BackEnd.model.Job;
import com.portfolio.BackEnd.model.JobUbication;
import com.portfolio.BackEnd.model.JournalType;
import com.portfolio.BackEnd.model.Person;
import com.portfolio.BackEnd.model.Proyect;
import com.portfolio.BackEnd.model.SoftSkills;
import java.util.List;

public class Portfolio {
    
    private Person person;
	private List<Job> job;
        private List<Education> edu;
        private List<HardSkills> hard;
        private List<JobUbication> jobu;
        private List<JournalType> journal;
        private List<Proyect> proyect;
        private List<SoftSkills> soft;
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public List<Job> getJob() {
		return job;
	}
	public void setJob(List<Job> job) {
		this.job = job;
	}
        public List<Education> getEducation() {
		return edu;
	}
	public void setEducation(List<Education> edu) {
		this.edu = edu;
	}
        public List<HardSkills> getHardSkills() {
                return hard;
	}
	public void setHardSkills(List<HardSkills> hard) {
		this.hard = hard;
	}
        public List<JobUbication> getJobUbication() {
                return jobu;
	}
	public void setJobUbication(List<JobUbication> jobu) {
		this.jobu = jobu;
	}
        public List<JournalType> getJournalType() {
                return journal;
	}
	public void setJournalType(List<JournalType> journal) {
		this.journal = journal;
	}
        public List<Proyect> getProyect() {
                return proyect;
	}
	public void setProyect(List<Proyect> proyect) {
		this.proyect = proyect;
	}
        public List<SoftSkills> getSoftSkills() {
                return soft;
	}
	public void setSoftSkills(List<SoftSkills> soft) {
		this.soft = soft;
        }
        
}
