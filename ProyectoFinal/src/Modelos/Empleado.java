package Modelos;

public class Empleado {

  private int empleado_id;
  private String nombre;

  public Empleado(int empleado_id, String nombre) {
    this.empleado_id = empleado_id;
    this.nombre = nombre;
  }

  public int getEmpleado_id() {
    return empleado_id;
  }

  public void setEmpleado_id(int empleado_id) {
    this.empleado_id = empleado_id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
}