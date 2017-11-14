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
	Hierbas hierb = new Item("hierbas rojas",20,30 );
	Up upp = new Item("potenciador",0,60);
	Spry spr = new Item("Spry de salud",50,0);
	items.add(hierb);
	items.add(upp);
	items.add(spr);
	return items;

}
  //pendiente
  public  Item construyeItemPorNombre(String paramString);
  
public  Collection<Ataque> construyeUnAtaqueDeCadaClase()	{
	private Collection<Ataque> attacks = new  Collection<Ataque>();
	Ataque golpe = new Ataque("puño del dragon", 60,0,30);
	Ataque patada = new Ataque("patada de borracho", 30,0,50);
	Ataque especial = new Ataque("Gordificio", 100,0,90);
	attacks.add(golpe);
	attacks.add(patada);
	attacks.add(especial);
	return attacks;
}
  //pendiente 
  public  Ataque construyeAtaquePorNombre(String paramString);
}
