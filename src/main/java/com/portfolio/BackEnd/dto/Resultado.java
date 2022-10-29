
package com.portfolio.BackEnd.dto;


public class Resultado {
    private boolean isOk;
    private String descripcion;
    
    
    
	public Resultado(boolean isOk, String descripcion) {
		super();
		this.isOk = isOk;
		this.descripcion = descripcion;
	}
	
	public boolean isOk() {
		return isOk;
	}
	public void setOk(boolean isOk) {
		this.isOk = isOk;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
