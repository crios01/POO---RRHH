package Modelos;

public class Accion {

  private int accion_id;
  private String nombre;
  private String descripcion;

  public int getAccion_id() {
    return accion_id;
  }

  public void setAccion_id(int accion_id) {
    this.accion_id = accion_id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }
}