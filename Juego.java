package poo.videojuego;
import poo.videojuego.ui.PartidaUI;
import poo.videojuego.ui.Accion;
import java.util.*;
import poo.videojuego.Ataque;
import poo.videojuego.FabricaDeObjetos;
import poo.videojuego.Item;
import poo.videojuego.Personaje;



public class Juego implements poo.videojuego.ui.Partida {
    private FabricaDeObjetos fabrica;
    private String archivo;
    private PartidaUI ui;
    private int totalRondas;
    private int itemsIniciales=3;
    private Collection<Item> items = new ArrayList<Item>();
    private Collection<Ataque> ataques = new ArrayList<Ataque>();
    private Item aux;
    private int rondaActual;
    private Collection<Personaje> pers = new ArrayList<Personaje>();
    private Personaje personajeActual;
    private int equiv,noTurn;
    
    
    
    public void configura(FabricaDeObjetos fabrica, String archivo, PartidaUI ui, int totalRondas, int itmesIniciales){
        this.archivo = archivo;
        pers = fabrica.cargaPesonajesDesdeArchivo(archivo);
        this.fabrica = fabrica;
        this.ui=ui;
        this.totalRondas=totalRondas;
        this.itemsIniciales=itmesIniciales;
        noTurn = 1;
        rondaActual=1;
        
        if(itemsIniciales<3){
            aux = fabrica.construyeItemPorNombre("hierbas");
        
        for(int i=0;i<itemsIniciales;i++){
            items.add(aux);
        }
        
        }
        int equiv =itemsIniciales /3;
        if(equiv>0){
            this.items =fabrica.construyeUnItemDeCadaTipo();
            for(int i=0;i<equiv-1;i++){
                items=fabrica.construyeUnItemDeCadaTipo();
                
            }
            equiv = itemsIniciales - equiv*3;
        }
        if(equiv !=0 ){
            Item moment = fabrica.construyeItemPorNombre("spray");
            for(int i=0;i<equiv;i++){
                items.add(moment);
            }
            this.ataques = fabrica.construyeUnAtaqueDeCadaClase();
            
        }
    }
    
    


    public void inicia(){
        ui.iniciaPartida();
    }
    
    public Collection<Item> getItemsDisponibles(){
        
        return  items;
    }
    public Collection<Ataque> getAtaquesDisponibles(){
        return this.ataques;
        
    }
    public Collection<Personaje> getPersonajes() {
        return pers;
    }
    public Personaje getPersonajeEnTurno(){
        int varTemp =1;
        for(Personaje p : pers){
            if(noTurn ==1){
                personajeActual = p;
                break;
            }
             varTemp++;
        }
        return personajeActual;
    }
    public int getRondaActual() {
        return rondaActual;
        
    }
    public int getTotalRondas() {
        return totalRondas;
    }
    @Override
    public void itemUsado(Item item){
        if(item != null){
            items.remove(item);
        }
    }
    public void ejecutaAccion(Accion a)
    {
        System.out.println("accion \n");
        ui.iniciaRonda();
        ui.limpiaMensajes();
        ui.iniciaTurno();
        a.ejecuta();
        ui.terminaTurno();
        noTurn++;
        if(pers.size()< noTurn){
            noTurn=1;
            ui.terminaRonda();
            rondaActual++;
        
        }
        if(totalRondas < rondaActual){
            ui.terminaPartida();
            rondaActual=-1;
            for(Personaje b: pers ){
                b.guardaEnArchivo(archivo);
            }
        }
        
    }
    
}
