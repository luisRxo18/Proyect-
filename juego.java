package poo.videojuego;
import poo.videojuego.ui.PartidaUI;
import poo.videojuego.ui.Accion;
import java.util.*;
import poo.videojuego.Fabrica;

public class Juego implements poo.videojuego.ui.Partida {
private FabricaDeObjetos fabrica;
private Accion accion;
private String archivo;
private PartidaUI ui;
private int totalRondas;
private int itemsIniciales=3;
private Collection<Item> items = new ArrayList<Item>();
private Collection<Ataque> ataques = new ArrayList<Ataque>();
private Item aux;
private int rondaActual;
private Collection<Personaje> pers = new ArrayList<Personaje>();
private Personaje persoajeActual;

	public void configura(FabricaDeObjetos fabrica, String archivo, PartidaUI ui, int totalRondas, int itmesIniciales){
			this.fabrica = fabrica;
			this.archivo = archivo;
			this.ui=ui;
			this.totalRondas=totalRondas;
			this.itemsIniciales=itmesIniciales;
			pers = this.fabrica.cargaPesonajesDesdeArchivo("personajes.txt");
			ataques = this.fabrica.construyeUnAtaqueDeCadaClase();
			items =this.fabrica.construyeUnItemDeCadaTipo();

	} 
	public void inicia(){
	ui.iniciaPartida();
	for (int i=0; i<totalRondas; i++){
		ui.iniciaRonda();
		rondaActual = rondaActual-1;
		for (int j=0; j<pers.size(); j++){
			ui.limpiaMensajes();
			ui.iniciaTurno();
			accion.ejecuta();
			ui.terminaTurno();
			ui.limpiaMensajes();
		}
	}
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
        
    }

}
