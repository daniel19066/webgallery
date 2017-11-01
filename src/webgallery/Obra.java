/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webgallery;

/**
 *
 * @author ESTUDIANTE
 */
public class Obra {
    private String nombre;
    private String estilo;
    private String tecnica;
    private double precio;

    public Obra(String nombre, String estilo, String tecnica, double precio) {
        this.nombre = nombre;
        this.estilo = estilo;
        this.tecnica = tecnica;
        this.precio = precio;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
