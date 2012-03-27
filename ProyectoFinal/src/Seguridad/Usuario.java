package Seguridad;

public class Usuario {

  String dni;
  String nombre;
  String clave;

  public Usuario(String dni, String nombre, String clave) {
    this.dni = dni;
    this.nombre = nombre;
    this.clave = clave;
  }

  public String getDni() {
    return dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getClave() {
    return clave;
  }

  public void setClave(String clave) {
    this.clave = clave;
  }
}