
package poo.videojuego;
import java.io.*;
import java.util.*;
import java.util.StringTokenizer;
//last commit
public class Fabrica implements FabricaDeObjetos
{
    int vid,exp;
    public  Personaje construyePersonajeDesdeCadena(String paramString)
    {
        String arreglo[] = new String[3];
        int x=0;
        StringTokenizer personaje = new StringTokenizer(paramString,"|");
        Personaje pers;
        while (personaje.hasMoreTokens()){
            arreglo[x] = personaje.nextToken();
            x++;
        }
        vid = Integer.parseInt(arreglo[1]);
        exp = Integer.parseInt(arreglo[2]);
        pers = new Hombre(arreglo[0],vid,exp);
        return pers;
    }
    
    
    public  Collection<Personaje> cargaPesonajesDesdeArchivo(String paramString){
        int x = 0;
        String datos;
        Collection<Personaje> personajes = new ArrayList<Personaje>();
        try {
            File archivo = new File("personajes.txt");
            BufferedReader br;
            FileReader fr = new FileReader("personajes.txt");
            br = new BufferedReader(fr);
            while ((datos = br.readLine()) != null){
                personajes.add(construyePersonajeDesdeCadena(datos));
            }
            br.close();
            fr.close();
        }
        catch(IOException e){
            System.out.println("Error");
        }
        return personajes;
    }
    
    public  Collection<Item> construyeUnItemDeCadaTipo(){
        Collection<Item> items = new  ArrayList<Item>();
        Hierbas hierb = new Hierbas("hierbas rojas",20,30 );
        Up upp = new Up("potenciador",0,60);
        Spry spr = new Spry("Spry de salud",50,0);
        items.add(hierb);
        items.add(upp);
        items.add(spr);
        return items;
        
    }
    //pendiente
    public  Item construyeItemPorNombre(String paramString){
        Hierbas herbal = new Hierbas(paramString);
        return herbal;
    }
    
    public  Collection<Ataque> construyeUnAtaqueDeCadaClase()    {
        Collection<Ataque> attacks = new  ArrayList<Ataque>();
        Golpe golpe = new Golpe("puño del dragon", 60,0,30);
        Patada patada = new Patada("patada de borracho", 30,0,50);
        Especial especial = new Especial("Gordificio", 100,0,90);
        attacks.add(golpe);
        attacks.add(patada);
        attacks.add(especial);
        return attacks;
    }
    //pendiente
    public  Ataque construyeAtaquePorNombre(String paramString){
        Especial attack = new Especial(paramString);
        return attack;
    }
}
