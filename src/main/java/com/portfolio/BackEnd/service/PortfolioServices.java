
package com.portfolio.BackEnd.service;


import com.portfolio.BackEnd.model.Person;
import com.portfolio.BackEnd.repository.EducationRepository;
import com.portfolio.BackEnd.repository.HardSkillRepository;
import com.portfolio.BackEnd.repository.JobRepository;
import com.portfolio.BackEnd.repository.JobUbicationRepository;
import com.portfolio.BackEnd.repository.JournalTypeRepository;
import com.portfolio.BackEnd.repository.PersonRepository;
import com.portfolio.BackEnd.repository.ProyectRepository;
import com.portfolio.BackEnd.repository.SoftSkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.BackEnd.dto.Portfolio;
import com.portfolio.BackEnd.dto.Resultado;
import com.portfolio.BackEnd.model.Education;
import com.portfolio.BackEnd.model.HardSkills;
import com.portfolio.BackEnd.model.Job;
import com.portfolio.BackEnd.model.Proyect;
import com.portfolio.BackEnd.model.SoftSkills;
import java.sql.Date;

@Service
public class PortfolioServices {
    
    @Autowired
    private EducationRepository educationRepository;
    
    @Autowired 
    private HardSkillRepository hardSkillRepository;
    
    @Autowired 
    private JobRepository jobRepository;
            
    /*@Autowired 
    private JobUbicationRepository jobubicationRepository;
            
    @Autowired 
    private JournalTypeRepository journalTypeRepository;*/
               
    @Autowired 
    private PersonRepository personRepository;
    
    @Autowired 
    private ProyectRepository proyectRepository;
    
    @Autowired
    private SoftSkillsRepository softSkillsRepository;
    
    public List<PersonRepository> getPerson(){
        return personRepository.findAll();
    }
    
    public Portfolio getPortfolio(long personId) {
		
		// recupera desde la persistencia los datos
		
		Person person=  (Person) personRepository.findById(personId).orElse(null);
		
		List<Job> jobs = jobRepository.getJobByPersonId(personId);
                
                List<Education> edu = educationRepository.getEducationByPersonId(personId);
                
                List<Proyect> proy = proyectRepository.getProyectByPersonId(personId);
                
                List<HardSkills> hard = hardSkillRepository.getHardSkillsByPersonId(personId);
                
                List<SoftSkills> soft = softSkillsRepository.getSoftSkillsByPersonId(personId);

		// coloca la informacion el el portfolio
		Portfolio portf = new Portfolio();
		portf.setPerson (person);
		portf.setJob(jobs);
		portf.setEducation(edu);
                portf.setProyect(proy);
                portf.setHardSkills(hard);
                portf.setSoftSkills(soft);
                
		return portf;
		
	}
	
	
	
	
	
	public Resultado actualizarDatosPerson( Person per ) {
	
		if ( per!=null && personRepository.existsById(per.getId())) {

			personRepository.save(per);

			return new Resultado(true, "Actualizado!"); 
			
		}
		
		return new Resultado(false, "No se ha actualizado!");
	}

	public Resultado agregarExperiencia ( Job job) {
		return new Resultado(false, "No implementado!");
	}
	public Resultado actualizarExperiencia ( Job job) {
		return new Resultado(false, "No implementado!");
	}
	public Resultado borrarExperiencia ( Long id) {
		return new Resultado(false, "No implementado!");
	}
	
	/*public void inicializarDatos() {
		if ( personRepository.count()==0 ) {
			System.out.println("Inicializando la Base de Datos");
			personRepository.save(new Person(1,"Marcelo","Paris","Profesor sincrono Argentina Programa - Yo Programo"));
			personRepository.save(new Person(2,"Javier","Paris","Hermano de Marcelo"));
			
			experienciaRepository.save(new Experiencia(1, "Programador Java"   , Date.valueOf("2001-01-01") , 1 ));
			experienciaRepository.save(new Experiencia(2, "Programador HTML"   , Date.valueOf("2012-02-01") , 1 ));
			experienciaRepository.save(new Experiencia(3, "Programador Angular", Date.valueOf("2018-01-01") , 1 ));
			experienciaRepository.save(new Experiencia(4, "Programador COBOL", Date.valueOf("2018-04-04") , 2 ));
			System.out.println("Incializacion Realizada!");
//		} else {
//			actualizarDatosPersona(new Persona(2,"Javier","Paris","Tecnico en Electronica"));
		}
	}*/
    
}
