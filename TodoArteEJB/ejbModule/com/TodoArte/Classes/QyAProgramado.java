package com.TodoArte.Classes;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.io.Serializable;


public class QyAProgramado implements Serializable{
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
	
	@Basic
	@Column(name = "fechaYHoraInicio")
    private Date fechaYHoraInicio;
    
	@Basic
	@Column(name = "fechaYHoraFin")
    private Date fechaYHoraFin;

    public QyAProgramado() {
    }

    public QyAProgramado(int id, Date fechaYHoraInicio, Date fechaYHoraFin) {
        this.id = id;
        this.fechaYHoraInicio = fechaYHoraInicio;
        this.fechaYHoraFin = fechaYHoraFin;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaYHoraInicio() {
        return this.fechaYHoraInicio;
    }

    public void setFechaYHoraInicio(Date fechaYHoraInicio) {
        this.fechaYHoraInicio = fechaYHoraInicio;
    }

    public Date getFechaYHoraFin() {
        return this.fechaYHoraFin;
    }

    public void setFechaYHoraFin(Date fechaYHoraFin) {
        this.fechaYHoraFin = fechaYHoraFin;
    }
}