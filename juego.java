package poo.videojuego;

public class juego implements poo.videojuego.ui.Partida {
private FabricaDeObjetos fabrica;
private String archivo;
private PartidaUI ui;
private int totalRondas;
private int itmesIniciales=3;
private Collection<Item> items;
private Collection<Ataque> ataques;
private Item aux;
private Collection<Personajes> pers;
	public void configura(FabricaDeObjetos fabrica, String archivo, PartidaUI ui, int totalRondas, int itmesIniciales){
			this.fabrica = fabrica;
			this.archivo = archivo;
			this.ui=ui;
			this.totalRondas=totalRondas;
			this.itmesIniciales=itmesIniciales;
	} 
	public void inicia(){
	fabrica.cargaPersonajesDesdeArchivo();
	this.totalRondas=3;
	this.itemsIniciales=3;
	items = new ArrayList<Item>();
	items = fabrica.construyeUnItemDeCadaTipo();
	ataques = fabrica.construyeUnAtaqueDeCadaClase();
	}
	
	public Collection<Item> getItemsDisponibles(){
		
		return  items;
	}
	public Collection<ataque> getAtaquesDisponibles(){
		return ataques; 

	}
	public Collection<Personajes> getPersonajes() {
		return pers;
	}
	public Personaje getPersonajeEnTurno(){
		return null;
	}
	public int RondaActual() {
		return ; 

	}
	public int getTotalRondas() {
		return totalRondas;
	}
	public void itemUsado(Item item){
		
	}

}
