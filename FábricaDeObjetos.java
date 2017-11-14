package poo.videojuego;
import java.util.Collection;

public class Fabrica implements FabricaDeObjetos


{
  public  Personaje construyePersonajeDesdeCadena(String paramString)
  {
  	StringTokenizer personaje = new StringTokenizer(paramString,"|");
  	while (personaje.hasMoreTokens){
  		arreglo[x].add(nextToken())
  	}
  }

  
  public  Collection<Personaje> cargaPesonajesDesdeArchivo(String paramString){
	
	try {
     	File archivo = new File("personajes.txt");
      	BufferedReader br;
	FileReader fr = new FileReader("personajes.txt");
	br = new BufferedReader(fr);
	while ((datos = br.readLine())!= null){
	   	construyePersonajeDesdeCadena(datos);
	}
	}
	catch(IOException e){
        System.out.println("Error");
    	}
  }
  
  public  Collection<Item> construyeUnItemDeCadaTipo();
  
  public  Item construyeItemPorNombre(String paramString);
  
  public  Collection<Ataque> construyeUnAtaqueDeCadaClase();
  
  public  Ataque construyeAtaquePorNombre(String paramString);
}
