package poo.videojuego;
import java.util.Collection;

public class Fabrica implements FabricaDeObjetos
{
  public  Personaje construyePersonajeDesdeCadena(String paramString)
  {
	private String[] arreglo = new String[3];
  	StringTokenizer personaje = new StringTokenizer(paramString,"|");
	Personaje pers;
  	while (personaje.hasMoreTokens){
  		arreglo[x] = pers.nextToken();
  	}
	per = new (arreglo[0],Integer.parseInt(arreglo[1]),Integer.parseInt(arreglos[2]));
	return per;
  }

  
  public  Collection<Personaje> cargaPesonajesDesdeArchivo(String paramString){
	private int x = 0;
	private Collection<Personaje> personajes = new  Collection<Personaje>();
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
  
public  Collection<Item> construyeUnItemDeCadaTipo(){
	private Collection<Item> items = new  Collection<Item>();
	Item hierbas = new Item("hierbas",20,30 );
	Item up = new Item("potenciador",0,60);
	Item spry = new Item("Spry de salud",50,0);
	items.add(hierbas);
	items.add(up);
	items.add(spry);
	return items;

}
  
  public  Item construyeItemPorNombre(String paramString);
  
  public  Collection<Ataque> construyeUnAtaqueDeCadaClase();
  
  public  Ataque construyeAtaquePorNombre(String paramString);
}
