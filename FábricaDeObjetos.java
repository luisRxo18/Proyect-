package poo.videojuego;

import java.util.Collection;

public class Fabrica implements FabricaDeObjetos
{
  public  Personaje construyePersonajeDesdeCadena(String paramString)
  {

  }

  
  public  Collection<Personaje> cargaPesonajesDesdeArchivo(String paramString);
  
  public  Collection<Item> construyeUnItemDeCadaTipo();
  
  public  Item construyeItemPorNombre(String paramString);
  
  public  Collection<Ataque> construyeUnAtaqueDeCadaClase();
  
  public  Ataque construyeAtaquePorNombre(String paramString);
}
