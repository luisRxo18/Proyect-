package poo.videojuego;

public class juego implements poo.videojuego.Partida {
private FabricaDeObjetos fabrica;
private String archivo;
private PartidaUI ui;
private int totalRondas;
private int itemsIniciales;
	public void configura(FabricaDeObjetos fabrica, String archivo, PartidaUI ui, int totalRondas, int itemsIniciales){
			this.fabrica = fabrica;
			this.archivo = archivo;
			this.ui=ui;
			this.totalRondas=totalRondas;
			this.itemsIniciales=itemsIniciales;
	} 
	public void inicia(){


	}
	public Collection<Item> getItemsDisponibles(){
		return null; 

	}
	public Collection<ataque> getAtaquesDisponibles(){
		return null; 

	}
	public Collection<Personajes> getPersonajes() {
		return null;
	}
	public Personaje getPersonajeEnTurno(){
		return null;
	}
	public int RondaActual() {
		return null; 

	}
	public int getTotalRondas() {
		return null;
	}
	public void itemUsado(Item item){
		
	}

}
