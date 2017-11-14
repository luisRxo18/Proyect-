package poo.videojuego;

import java.util.Collection;

public class Fabrica implements FabricaDeObjetos
{
  public abstract Personaje construyePersonajeDesdeCadena(String paramString);

  
  public abstract Collection<Personaje> cargaPesonajesDesdeArchivo(String paramString);
  
  public abstract Collection<Item> construyeUnItemDeCadaTipo();
  
  public abstract Item construyeItemPorNombre(String paramString);
  
  public abstract Collection<Ataque> construyeUnAtaqueDeCadaClase();
  
  public abstract Ataque construyeAtaquePorNombre(String paramString);
}

