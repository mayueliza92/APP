/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.pp;

import javax.persistence.*;


@Entity
@Table (name = "certificado")
public class Certificado {
    
    
   @Id
   @Column
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id_certificado;
   @Column
   private String codigo_de_identificacion;
   @Column
   private String nombre_curso;

    public int getId_certificado() {
        return id_certificado;
    }

    public void setId_certificado(int id_certificado) {
        this.id_certificado = id_certificado;
    }

    public String getCodigo_de_identificacion() {
        return codigo_de_identificacion;
    }

    public void setCodigo_de_identificacion(String codigo_de_identificacion) {
        this.codigo_de_identificacion = codigo_de_identificacion;
    }

    public String getNombre_curso() {
        return nombre_curso;
    }

    public void setNombre_curso(String nombre_curso) {
        this.nombre_curso = nombre_curso;
    }
   
   
   
}
