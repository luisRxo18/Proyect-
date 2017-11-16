
package poo.videojuego;
import java.io.*;
import java.util.*;
import java.util.StringTokenizer;


/**Clase que implementa de FabricaDeObjetos*/
public class Fabrica implements FabricaDeObjetos
{
    int vid,exp;
    
    /**
    Con este método, apartir de una cadena generamos a nuestro personaje y regresamos el objeto "personaje"
    @param paramString Recibimos como cadena los datos de nuestro personaje
    @return objeto de tipo Personaje*/
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
    
    /** 
    Abrimos una archivo especificado con el parametro String y generamos apartir de ahí a nuestros personajes
    a nuestros personajes.
    
    @return Una colección de objetos de tipo Personaje
    @param paramSting Cadena la ruta donde está guardado el archivo donde están los datos de nuestros personajes
    */
    public  Collection<Personaje> cargaPesonajesDesdeArchivo(String paramString){
        int x = 0;
        String datos;
        Collection<Personaje> personajes = new ArrayList<Personaje>();
        try {
            File archivo = new File(paramString);
            BufferedReader br;
            FileReader fr = new FileReader(paramString);
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
    
    /** Construye un item de hierbas, un potenciador y un spry de salud
    	@return Regresa una colección con los ítems creados
    */
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
    /** Construímos únicamente un item dependiendo el parametro que se envie
    	@return Objeto del tipo de item que se pidió
	@param paramString Recibimos el nombre del Item por el nombre del item
*/
    public  Item construyeItemPorNombre(String paramString){
        Hierbas herbal = new Hierbas(paramString);
	Up upo = new Up(paramString);
	Spry sp = new Spry(paramString);
	if(herbal.getNombre().equals(paramString)){
	
        return herbal;
	}
	else if(upo.getNombre().equals(paramString))
	{
	return upo;	
	}
	else {
		return sp;
	}
}

    /** Construye un ataque de puño del dragón, un patada de borracho y un gordificio
    	@return Regresa una colección con los ataques creados
    */
    public  Collection<Ataque> construyeUnAtaqueDeCadaClase() 
   {
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
    /** Construímos únicamente un ataque dependiendo el parametro que se envie
    	@return Objeto del tipo de ataque que se pidió
	@param paramString Recibimos el nombre del ataque por el nombre del item
*/
    public  Ataque construyeAtaquePorNombre(String paramString){
        Especial es = new Especial(paramString);
	Golpe gol = new Golpe(paramString);
	Patada pa = new Patada(paramString);
	if(es.getNombre().equals(paramString)){
	
        return es;
	}
	else if(gol.getNombre().equals(paramString))
	{
	return gol;	
	}
	else {
		return pa;
	}
    }
}
