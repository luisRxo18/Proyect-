package poo.videojuego;
import java.io.*;
import java.util.ArrayList;
import poo.videojuego.ExperienciaNoSuficienteException;
public class Hombre implements poo.videojuego.Personaje {
    //Atributos
    private String nombre;
    private int experiencia;
    private  int vida;
    private ArrayList<Ataque> ataques;
    private ArrayList<Item> items;
    
    //Constructor:
    public Hombre (String nombre,int experiencia, int vida){
        this.nombre = nombre;
        this.experiencia = experiencia;
        this.vida = vida;
        ataques = new ArrayList<Ataque>();
        items = new ArrayList<Item>();
    }
    //Aqui va el try cath de la experiencia necesaria
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
    public void recibe (Ataque ataque){
        vida = vida - ataque.getDanoQueCausa();
    }
    public void usa(Item item){
        vida = item.getEnergiaQueAporta();
        experiencia = item.getExperienciaQueAporta();
        int i = items.indexOf(item);
        items.remove(i);
    }
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
    public ArrayList<Ataque> getAtaques(){
        return ataques;
    }
    public int getExperiencia(){
        return experiencia;
    }
    public int getEnergia(){
        return vida;
    }
    public String getNombre(){
        return nombre;
    }
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
