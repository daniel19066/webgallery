/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webgallery;

import java.util.ArrayList;

/**
 *
 * @author ESTUDIANTE
 */
public class Galeria {
    private ArrayList<Artista> artistas;
    private ArrayList<comprador> compradores;

    public Galeria(ArrayList<Artista> artistas, ArrayList<comprador> compradores) {
        this.artistas = artistas;
        this.compradores = compradores;
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(ArrayList<Artista> artistas) {
        this.artistas = artistas;
    }

    public ArrayList<comprador> getCompradores() {
        return compradores;
    }

    public void setCompradores(ArrayList<comprador> compradores) {
        this.compradores = compradores;
    }


    public void crear_Obra(Artista artista,String nombre,String estilo
    ,String tecnica,double precio) {
        if(this.artistas.contains(artista)){
        artista.publicar_obra(nombre,estilo,tecnica,precio);
        }
    }
    public void mostrar_obras(String nombre_art){
        for(int i=0;i<this.artistas.size();i++){
        if(this.artistas.get(i).getNombre()==nombre_art){
            for(int k=0;k<this.artistas.get(i).getNumero_obras();k++){
                Obra[]obras =this.artistas.get(i).getObras();
                System.out.println(obras[k].getNombre());
            }
        }
        }
    }
    
    
}
