
package com.portfolio.BackEnd.controller;

import com.portfolio.BackEnd.dto.Portfolio;
import com.portfolio.BackEnd.dto.Resultado;
import com.portfolio.BackEnd.model.Job;
import com.portfolio.BackEnd.model.Person;
import com.portfolio.BackEnd.repository.PersonRepository;
import com.portfolio.BackEnd.service.PortfolioServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
public class Controller {
    
    @Autowired
    private PortfolioServices portfolioServices;
    
        @GetMapping("/person")
        @ResponseBody
	List<PersonRepository> getPerson() {
		return portfolioServices.getPerson();
	}
    
        
        @GetMapping("/portfolio/{id}")
        @ResponseBody
	Portfolio getPortfolio(@PathVariable int id) {
            return portfolioServices.getPortfolio(id);
	}
	
        @PostMapping("/portfolio/person/actualizar")
        @ResponseBody
        Resultado actualizarDatosPerson(@RequestBody Person p ) {
            return portfolioServices.actualizarDatosPerson(p);
    }

    @PostMapping("/portfolio/experiencia/agregar")
    @ResponseBody
    Resultado agregarJob( Job job ) {
    	System.out.println(job);
    	// aca hay capa de servicios que realice la operacion
    	return new Resultado(false,"No implementado!");
    }
    
    @PostMapping("/portfolio/experiencia/actualizar")
    @ResponseBody
    Resultado actualizarJob( Job job ) {
    	System.out.println(job);
    	// aca hay capa de servicios que realice la operacion
    	return new Resultado(false,"No implementado!");
    }

    @PostMapping("/portfolio/experiencia/eliminar/{experienciaId}")
    @ResponseBody
    Resultado eliminarJob( @PathVariable int jobId ) {
    	System.out.println(jobId);
    	// aca hay capa de servicios que realice la operacion
    	return new Resultado(false,"No implementado!");
    }
    
    
}
