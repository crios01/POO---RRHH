package Modelos;

public class Perfil {
  private String codPerfil, desPerfil;

  // Constructor //
  public Perfil(String codPerfil, String desPerfil) {
    this.codPerfil = codPerfil;
    this.desPerfil = desPerfil;
  }

  // Getter & Setter //
  public String getCodPerfil() {
    return codPerfil;
  }
  public void setCodPerfil(String codPerfil) {
    this.codPerfil = codPerfil;
  }

  public String getDesPerfil() {
    return desPerfil;
  }
  public void setDesPerfil(String desPerfil) {
    this.desPerfil = desPerfil;
  }
  
}
