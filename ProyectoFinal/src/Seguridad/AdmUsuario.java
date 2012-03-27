package Seguridad;

import java.util.ArrayList;

public class AdmUsuario {

  private ArrayList<Usuario> usuarios;

  public AdmUsuario() {
    // Creacion de la coleccion de usuarios
    usuarios = new ArrayList<Usuario>();
  }

  public void registrarUsuario(String dni, String nombre, String clave) {
    if (noExisteDni(dni)) {
      Usuario nuevoUsuario = new Usuario(dni, nombre, clave);
      usuarios.add(nuevoUsuario);
    }
  }

  public Usuario buscarUsuario(String dni) {
    for (Usuario usuario : usuarios) {
      if (usuario.getDni().equals(dni)) {
        return usuario;
      }
    }
    return null;
  }

  public int getTotalUsuarios() {
    return usuarios.size();
  }

  private boolean noExisteDni(String dni) {
    return buscarUsuario(dni) == null;
  }

  public void eliminarUsuario(String dni) {
    Usuario usuario = buscarUsuario(dni);
    if (usuario != null) {
      usuarios.remove(usuario);
    }
  }
}