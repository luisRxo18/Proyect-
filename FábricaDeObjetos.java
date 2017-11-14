package poo.videojuego;
import java.util.Collection;

public class Fabrica implements FabricaDeObjetos
String[] arreglo;
arreglo = new String[3];

{
  public  Personaje construyePersonajeDesdeCadena(String paramString)
  {
  	StringTokenizer personaje = new StringTokenizer(paramString,"|");
	Personaje pers;
  	while (personaje.hasMoreTokens){
  		arreglo[x].add(nextToken())
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
