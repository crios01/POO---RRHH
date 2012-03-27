package Modelos;

public class PermisoAcciones {

  private Rol rol;
  private Modulo modulo;
  private Accion accion;

  public Rol getRol() {
    return rol;
  }

  public void setRol(Rol rol) {
    this.rol = rol;
  }

  public Modulo getModulo() {
    return modulo;
  }

  public void setModulo(Modulo modulo) {
    this.modulo = modulo;
  }

  public Accion getAccion() {
    return accion;
  }

  public void setAccion(Accion accion) {
    this.accion = accion;
  }
}