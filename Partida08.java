/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.videojuego.impl;

/*
 import java.io.BufferedWriter;
 import java.io.FileWriter;
 import java.io.IOException;
 import java.io.PrintWriter;*/
import java.util.ArrayList;
import java.util.Collection;
import poo.videojuego.Ataque;
import poo.videojuego.FabricaDeObjetos;
import poo.videojuego.Item;
import poo.videojuego.Personaje;
import poo.videojuego.ui.Accion;
import poo.videojuego.ui.Partida;
import poo.videojuego.ui.PartidaUI;


/**
 *
 * @author Hector
 */
public class Partida08 implements Partida {

    private PartidaUI pui;
    private Collection<Personaje> personajes;
    private Collection<Item> itemsDisponibles;
    private Collection<Ataque> ataquesDisponibles;
    private String archivo;
    private int totalRondas;
    private Personaje personajeEnTurno;
    private int rondaActual, turno;

    @Override
    public void configura(FabricaDeObjetos fabrica, String archivo, PartidaUI pui, int totalRondas, int itemsIniciales) {
        personajes = new ArrayList<Personaje>();
        itemsDisponibles = new ArrayList<Item>();
        ataquesDisponibles = new ArrayList<Ataque>();
        this.archivo = archivo;
        personajes = fabrica.cargaPesonajesDesdeArchivo(archivo);
        this.pui = pui;
        int elem = itemsIniciales / 3;
        int i;
        System.out.println("elem " + elem + " itemsIniciales " + itemsIniciales);
        //System.out.println("Size " + itemsDisponibles.size());
        if (itemsIniciales<3){
            Item itemprov = new Item08("corazon");
            for(i=0;i<itemsIniciales;i+=1)
                itemsDisponibles.add(itemprov);
            System.out.println("Size " + itemsDisponibles.size());
        }
        if(elem>=1){
            itemsDisponibles = fabrica.construyeUnItemDeCadaTipo();
            System.out.println("Size " + itemsDisponibles.size());
            for(i=0;i<elem-1;i+=1)
                itemsDisponibles.addAll(fabrica.construyeUnItemDeCadaTipo());
            elem = itemsIniciales - elem*3;
        }
        if (elem != 0){
            Item itemprov = new Item08("pocion");
            for(i=0;i<elem;i+=1)
                itemsDisponibles.add(itemprov);
            System.out.println("Size " + itemsDisponibles.size());
        }
        ataquesDisponibles = fabrica.construyeUnAtaqueDeCadaClase();
        this.totalRondas = totalRondas;
        //personajeEnTurno = null;
        turno = 1;
        rondaActual = 1;
        //System.out.println("Personajes iniciales " + personajes.size());
    }

    @Override
    public void inicia() {
        //System.out.println("Entro al metodo inicia");
        pui.iniciaPartida();
    }

    @Override
    public void ejecutaAccion(Accion accion) {
        pui.iniciaRonda();
        pui.limpiaMensajes();
        pui.iniciaTurno();
        accion.ejecuta();
        pui.terminaTurno();
        turno += 1;
        if (personajes.size() < turno) {
            turno = 1;
            pui.terminaRonda();
            rondaActual += 1;
        }
        if (totalRondas < rondaActual) {
            pui.terminaPartida();
            rondaActual = -1;
            for (Personaje personaje : personajes) {
                personaje.guardaEnArchivo(archivo);
            }
        }

        /*try{
         /*BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
         PrintWriter pw = new PrintWriter(bw);
         pw.flush();
         pw.close();
         bw.close();
         for(Personaje personaje : personajes)
         personaje.guardaEnArchivo(archivo);
         }catch(IOException e){
         System.out.println("Error al abrir el archivo" + e.getMessage());
         }*/
    }

    @Override
    public Collection<Item> getItemsDisponibles() {
        return itemsDisponibles;
    }

    @Override
    public Collection<Ataque> getAtaquesDisponibles() {
        return ataquesDisponibles;
    }

    @Override
    public Collection<Personaje> getPersonajes() {
        return personajes;
    }

    @Override
    public Personaje getPersonajeEnTurno() {
        int i = 1;
        //System.out.println("Turno buscado " + turno);
        for (Personaje personaje : personajes) {
            if (i == turno) {
                personajeEnTurno = personaje;
                //System.out.println("nombre " + personajeEnTurno.getNombre()+ " turno " + i + " size " + personajes.size());
                break;
            }
            i += 1;
        }
        
        return personajeEnTurno;
    }

    @Override
    public int getRondaActual() {
        return rondaActual;
    }

    @Override
    public int getTotalRondas() {
        return totalRondas;
    }

    @Override
    public void itemUsado(Item item) {
        if (item != null) {
            itemsDisponibles.remove(item);
        }
    }

}
