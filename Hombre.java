package poo.videojuego;
import java.io.*;
import java.util.ArrayList;
import poo.videojuego.ExperienciaNoSuficienteExcepcion;
/** 
Esta clase implementa la interface Ataque
*/
public class Hombre implements poo.videojuego.Personaje {
    //Atributos
    private String nombre;
    private int experiencia;
    private  int vida;
    private ArrayList<Ataque> ataques;
    private ArrayList<Item> items;
    
    /** Constructor
	@param nombre Es el nombre del hombre
	@param experiencia Es la experiencia que tiene el personaje
	@param vida Es la experiencia que tiene el personaje */
    public Hombre (String nombre,int experiencia, int vida){
        this.nombre = nombre;
        this.experiencia = experiencia;
        this.vida = vida;
        ataques = new ArrayList<Ataque>();
        items = new ArrayList<Item>();
    }
    
    //Aqui va el try cath de la experiencia necesaria
    
    /**@return Un objeto de tipo ataque, en caso de no encontrarlo no regresa nada
       @param nombreAtaque Es una cadena de la cual usamos para regresar el ataque*/
    public Ataque lanza(String nombreAtaque){
        for (Ataque A : ataques){
            if (A.getNombre().equals(nombreAtaque)){
                experiencia = experiencia + A.getExperienciaQueAporta();
                ataques.remove(A);
                return A;
            }
        }
        return null;
    }
    /** @return No regresa nada
        @param ataque Recibe un ataque en específico y resta vida dependiendo de el poder de éste*/
    public void recibe (Ataque ataque){
        vida = vida - ataque.getDanoQueCausa();
    }
    
    /** @return No regresa nada
        @para item Sumamos el nivel de energía o de experiencia que aporta*/
    public void usa(Item item){
        if(item.getEnergiaQueAporta()!=0)
            vida+=item.getEnergiaQueAporta();
        if(item.getEnergiaQueAporta()!=0)
            experiencia+=item.getExperienciaQueAporta();
    }
    
    /** @return No regresa nada
        @param ataque Recibe un objeto de la clase Ataque
        Este método recibe un ataque, verifica que se tenga la experiencia necesaria, y en caso de no tenerla,
        manda una excepción*/
    public void guarda (Ataque ataque){
        try{
        if (ataque.getExperienciaNecesaria() <= experiencia){
            ataques.add(ataque);
        }else{
            throw new ExperienciaNoSuficienteExcepcion();
        }
        }
        catch(ExperienciaNoSuficienteExcepcion experere)
        {
            
        }

    }
    
    /** @return Regresa un Arraylist de tipo "Ataque"*/
    public ArrayList<Ataque> getAtaques(){
        return ataques;
    }
    
    /** @return Regresa la experiencia del personaje*/
    public int getExperiencia(){
        return experiencia;
    }
    
    /** @return Regresa el nivel de energía del personaje*/
    public int getEnergia(){
        return vida;
    }
    /** @return Regresa el nombre del personaje*/
    public String getNombre(){
        return nombre;
    }
    /** @return No regresa nada
        @archivo Una cadena de la dirección donde se guarda el archivo
        Si el archivo existe, guarda los datos de los personajes, en caso de no existir manda una excepción*/
    public void guardaEnArchivo(String archivo){
        try{
            File ubicacion = new File(archivo);
            if (!ubicacion.exists())
                ubicacion.createNewFile();
            FileWriter fw = new FileWriter(ubicacion, true);
            fw.write(nombre + "|" + experiencia + "|" + vida + "\n");
            fw.close();
        }catch (IOException err){}
    }
}

