/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seletiene;

/**
 *
 * @author santi
 */
public class EnvioPorFecha implements TipoEnvio {

    @Override
    public void enviar() {
        
    }
          private String correo;
          private String Nombres;
          private String Apellidos;
          private int numerocel; 
          private String fechaDeseada;

    public EnvioPorFecha(String correo, String Nombres, String Apellidos, int numerocel, String fechaDeseada) {
        this.correo = correo;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.numerocel = numerocel;
        this.fechaDeseada = fechaDeseada;
    }

          
          
          
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public int getNumerocel() {
        return numerocel;
    }

    public void setNumerocel(int numerocel) {
        this.numerocel = numerocel;
    }

    public String getFechaDeseada() {
        return fechaDeseada;
    }

    public void setFechaDeseada(String fechaDeseada) {
        this.fechaDeseada = fechaDeseada;
    }
          
}
