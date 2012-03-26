package Modelos;

public class Usuario {
  private String user, password, nombres, apellidos;

  // Constructor //
  public Usuario(String user, String password, String nombres, String apellidos) {
    this.user = user;
    this.password = password;
    this.nombres = nombres;
    this.apellidos = apellidos;
  }
  // Getter & Setter //
  public String getUser() {
    return user;
  }
  public void setUser(String user) {
    this.user = user;
  }
  
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  public String getNombres() {
    return nombres;
  }
  public void setNombres(String nombres) {
    this.nombres = nombres;
  }

  public String getApellidos() {
    return apellidos;
  }
  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

}
