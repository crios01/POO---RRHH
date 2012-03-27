package ControlIngreso;

import Modelos.Empleado;
import Modelos.Rol;
import Modelos.Usuario;
import java.util.ArrayList;
import java.util.List;

public class Listas {

  private List<Usuario> listaUsuario;
  Empleado objEmpleado = new Empleado(0, null);
  Rol objRol = new Rol();

  //Inicio del Constructor
  public Listas() {
    listaUsuario = new ArrayList<Usuario>();

    Rol objrol = new Rol();
    Empleado objempleado = new Empleado(0, null);

    Usuario usuario1 = new Usuario(1, objrol, "Usuario1", "123456", objempleado);
    Usuario usuario2 = new Usuario(2, objrol, "Usuario2", "123457", objempleado);
    Usuario usuario3 = new Usuario(3, objrol, "Usuario3", "123458", objempleado);
    Usuario usuario4 = new Usuario(4, objrol, "Usuario4", "123459", objempleado);

    listaUsuario.add(usuario1);
    listaUsuario.add(usuario2);
    listaUsuario.add(usuario3);
    listaUsuario.add(usuario4);
  }

  public List<Usuario> getListaUsuario() {
    return listaUsuario;
  }

  public void setListaUsuario(List<Usuario> listaUsuario) {
    this.listaUsuario = listaUsuario;
  }
}
