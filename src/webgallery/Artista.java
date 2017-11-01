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
public class Artista {
    private String nombre;
    private int numero_obras;
    private Obra[] obras;

    public Artista(String nombre, int num_obras) {
        this.nombre=nombre;
        this.numero_obras=num_obras;
        this.obras=new Obra[num_obras];
    }

    public int getNumero_obras() {
        return numero_obras;
    }

    public void setNumero_obras(int numero_obras) {
        this.numero_obras = numero_obras;
    }

    public Obra[] getObras() {
        return obras;
    }

    public void setObras(Obra[] obras) {
        this.obras = obras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    public void publicar_obra(String nombre,String estilo
    ,String tecnica,double precio){
        for(int i=0; i<this.numero_obras;i++){
            if(obras[i]==null){
                obras[i]=new Obra(nombre, estilo, tecnica, precio);
            }
        }
    }
}
