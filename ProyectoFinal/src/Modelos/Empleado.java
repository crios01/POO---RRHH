package Modelos;

public class Empleado extends Usuario {
  private String codEmpleado, codPerfil;

  // Constructor //
  public Empleado(String codEmpleado, String user, String password, String nombres, String apellidos, String codPerfil) {
    super(user, password, nombres, apellidos);
    this.codEmpleado = codEmpleado;
    this.codPerfil = codPerfil;
  }

  // Getter & Setter //
  public String getCodEmpleado() {
    return codEmpleado;
  }
  public void setCodEmpleado(String codEmpleado) {
    this.codEmpleado = codEmpleado;
  }

  public String getCodPerfil() {
    return codPerfil;
  }
  public void setCodPerfil(String codPerfil) {
    this.codPerfil = codPerfil;
  }

}
