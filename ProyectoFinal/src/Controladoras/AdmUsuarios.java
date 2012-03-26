package Controladoras;

import java.util.ArrayList;
import Modelos.Usuario;
import Modelos.Empleado;

public class AdmUsuarios {
  private ArrayList<Usuario> dbUsuarios = new ArrayList<Usuario>();
  
  private void simularUsuarios(){
    this.dbUsuarios.add(new Empleado("001", "cMenese", "cesmen111", "César", "Meneses", "1"));
    this.dbUsuarios.add(new Empleado("002", "sPérez", "sanper222", "Sandra", "Pérez", "2"));
    this.dbUsuarios.add(new Empleado("003", "jRabanal", "josrab333", "José", "Rabanal", "3"));
    this.dbUsuarios.add(new Empleado("004", "gGutierrez", "gongut444", "Gonzalo", "Gutierrez", "4"));
    this.dbUsuarios.add(new Empleado("005", "cSalinas", "carsal555", "Carlos", "Salinas", "5"));
  }
  
  // Verifica si Usuario existe //
  public Usuario existeUsuario(String user) {
    simularUsuarios();
    Usuario usuarioEncontrado = null;
    for (Usuario usuario : dbUsuarios) {
      if (usuario.getUser().equals(user)) {
        usuarioEncontrado = usuario;
      }
    }
    return usuarioEncontrado;
  }
  // Validar Password //
    public boolean validarPassword(String userName, String password) {
    boolean acceso = false;
    Usuario usuarioValido = existeUsuario(userName);
    if (usuarioValido.getPassword().equals(password)) {
      acceso = true;
    }
    return acceso;
  }
  // Verificar campos vacios //
  public boolean verificaCampo(String campo){
    if (campo != null){
      return true;
    }
    return false;
  }
  
}
