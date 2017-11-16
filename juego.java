package poo.videojuego;
import poo.videojuego.ui.PartidaUI;
import poo.videojuego.ui.Accion;
import java.util.*;
import poo.videojuego.Fabrica;

public class juego implements poo.videojuego.ui.Partida {
private FabricaDeObjetos fabrica;
private String archivo;
private PartidaUI ui;
private int totalRondas;
private int itemsIniciales=3;
private Collection<Item> items;
private Collection<Ataque> ataques;
private Item aux;
private int rondaActual;
private Collection<Personaje> pers;
private Personaje persoajeActual;

	public void configura(FabricaDeObjetos fabrica, String archivo, PartidaUI ui, int totalRondas, int itmesIniciales){
			this.fabrica = fabrica;
			this.archivo = archivo;
			this.ui=ui;
			this.totalRondas=totalRondas;
			this.itemsIniciales=itmesIniciales;
	} 
	public void inicia(){
        
	fabrica.cargaPersonajesDesdeArchivo("hola");
	this.totalRondas=3;
	this.itemsIniciales=3;
	items = new ArrayList<Item>();
	items = fabrica.construyeUnItemDeCadaTipo();
	ataques = fabrica.construyeUnAtaqueDeCadaClase();
	}
	
	public Collection<Item> getItemsDisponibles(){
		
		return  items;
	}
	public Collection<Ataque> getAtaquesDisponibles(){
		return ataques; 

	}
	public Collection<Personaje> getPersonajes() {
		return pers;
	}
	public Personaje getPersonajeEnTurno(){
		return null;
	}
	public int getRondaActual() {
		return rondaActual;

	}
	public int getTotalRondas() {
		return totalRondas;
	}
	public void itemUsado(Item item){
        persoajeActual.usa(item);
        items.remove(item);
		
	}
    public void ejecutaAccion(Accion a)
    {
        System.out.println("accion \n");
    }

}
