package poo.videojuego;
import java.util.Collection;

public class Fabrica implements FabricaDeObjetos

private Collection<Personaje> personajes = new  Collection<Personaje>();
private String[] arreglo = new String[3];
private int x = 0;

{
  public  Personaje construyePersonajeDesdeCadena(String paramString)
  {
  	StringTokenizer personaje = new StringTokenizer(paramString,"|");
	Personaje pers;
  	while (personaje.hasMoreTokens){
  		arreglo[x] = pers.nextToken();
  	}
	per = new (arreglo[0],Integer.parseInt(arreglo[1]),Integer.parseInt(arreglos[2]));
	return per;
  }

  
  public  Collection<Personaje> cargaPesonajesDesdeArchivo(String paramString){
	
	try {
     	File archivo = new File("personajes.txt");
      	BufferedReader br;
	FileReader fr = new FileReader("personajes.txt");
	br = new BufferedReader(fr);
	while ((datos = br.readLine())!= null){
	   	personajes.add(construyePersonajeDesdeCadena(datos));
	}
	}
	catch(IOException e){
        System.out.println("Error");
    	}
	return personajes;
  }
  
  public  Collection<Item> construyeUnItemDeCadaTipo();
  
  public  Item construyeItemPorNombre(String paramString);
  
  public  Collection<Ataque> construyeUnAtaqueDeCadaClase();
  
  public  Ataque construyeAtaquePorNombre(String paramString);
}
