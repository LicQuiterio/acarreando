package com.tuempresa.facturacion.modelo;

import lombok.*;

@Getter @Setter
public class Incidencia {

	int numero;
	String descripcion;
	
	public String getDescripcion() {
		if(descripcion == null) return "Todavia no hay descripcion";
		return descripcion;
	}
	
}
