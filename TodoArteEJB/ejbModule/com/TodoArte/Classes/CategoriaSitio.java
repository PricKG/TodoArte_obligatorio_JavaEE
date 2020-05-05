package com.TodoArte.Classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categoriaSitio")
public class CategoriaSitio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nombreCategoria")
    private String nombreCat;

    public CategoriaSitio() {
    }
    
    public CategoriaSitio(int id, String nombreCat) {
		this.id = id;
		this.nombreCat = nombreCat;
	}

	public String getNombreCat() {
        return this.nombreCat;
    }

    public void setNombreCat(String nombreCat) {
        this.nombreCat = nombreCat;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}