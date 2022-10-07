package com.tuempresa.facturacion.calculadores;

import java.util.*;

import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import com.tuempresa.facturacion.modelo.*;

import lombok.*;

@Entity @Getter @ Setter
public class Autor {
	@Id @GeneratedValue(generator="system-uuid") @Hidden
	 @GenericGenerator(name="system-uuid", strategy = "uuid")
	 @Column(length=32)
	 String oid;
	 @Column(length=50) @Required
	 String nombre;
	 
	 @OneToMany(mappedBy = "autor", cascade=CascadeType.REMOVE)
	 @ListProperties("numero, descripcion, precio")
	 Collection<Producto> productos;
}
