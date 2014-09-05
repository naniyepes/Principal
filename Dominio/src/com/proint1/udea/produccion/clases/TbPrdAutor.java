package com.proint1.udea.produccion.clases;

// default package
// Generated 10-may-2014 11:58:30 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

import com.proint1.udea.administracion.entidades.configuracion.Pais;
import com.proint1.udea.administracion.entidades.terceros.Persona;

/**
 * TbPrdAutor generated by hbm2java
 */
public class TbPrdAutor implements java.io.Serializable {

	private long nbAutIdn;
	private Pais tbAdmPaises;
	private Persona tbAdmPersona;
	private Set tbPrdAutoresxproduccions = new HashSet(0);

	public TbPrdAutor() {
	}

	public TbPrdAutor(long nbAutIdn, Pais tbAdmPaises,
			Persona tbAdmPersona) {
		this.nbAutIdn = nbAutIdn;
		this.tbAdmPaises = tbAdmPaises;
		this.tbAdmPersona = tbAdmPersona;
	}

	public TbPrdAutor(long nbAutIdn, Pais tbAdmPaises,
			Persona tbAdmPersona, Set tbPrdAutoresxproduccions) {
		this.nbAutIdn = nbAutIdn;
		this.tbAdmPaises = tbAdmPaises;
		this.tbAdmPersona = tbAdmPersona;
		this.tbPrdAutoresxproduccions = tbPrdAutoresxproduccions;
	}

	public long getNbAutIdn() {
		return this.nbAutIdn;
	}

	public void setNbAutIdn(long nbAutIdn) {
		this.nbAutIdn = nbAutIdn;
	}

	public Pais getTbAdmPaises() {
		return this.tbAdmPaises;
	}

	public void setTbAdmPaises(Pais tbAdmPaises) {
		this.tbAdmPaises = tbAdmPaises;
	}

	public Persona getTbAdmPersona() {
		return this.tbAdmPersona;
	}

	public void setTbAdmPersona(Persona tbAdmPersona) {
		this.tbAdmPersona = tbAdmPersona;
	}

	public Set getTbPrdAutoresxproduccions() {
		return this.tbPrdAutoresxproduccions;
	}

	public void setTbPrdAutoresxproduccions(Set tbPrdAutoresxproduccions) {
		this.tbPrdAutoresxproduccions = tbPrdAutoresxproduccions;
	}

}
