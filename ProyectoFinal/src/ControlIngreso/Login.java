package ControlIngreso;

import java.util.List;
import Modelos.Usuario;

public class Login {

  private List<Usuario> listaUsuario;

  Login(List<Usuario> listaUsuario) {
    this.listaUsuario = listaUsuario;
  }

  public boolean isUsuarioValido(String Usuario, String Clave) {
    for (Usuario bean : getListaUsuario()) {
      if (bean.getUsuario().equals(Usuario)) {
        if (bean.getClave().equals(Clave)) {
          return true;
        }
        return false;
      }
    }
    return false;
  }

  public List<Usuario> getListaUsuario() {
    return listaUsuario;
  }

  public void setListaUsuario(List<Usuario> listaUsuario) {
    this.listaUsuario = listaUsuario;
  }
}