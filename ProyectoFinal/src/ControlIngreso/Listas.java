package ControlIngreso;

import Modelos.Empleado;
import Modelos.Rol;
import Modelos.Usuario;
import java.util.ArrayList;
import java.util.List;

public class Listas {

  private List<Usuario> listaUsuario;
  // Empleado objEmpleado = new Empleado(1, "");
  // Rol objRol = new Rol();

  //Inicio del Constructor
  public Listas() {
    listaUsuario = new ArrayList<Usuario>();

    Rol objRol = new Rol();
    Empleado objEmpleado1 = new Empleado(1, "Miguel ruiz");
    Empleado objEmpleado2 = new Empleado(2, "José Santos");
    Empleado objEmpleado3 = new Empleado(3, "Ana Trelles");
    Empleado objEmpleado4 = new Empleado(4, "Karla Ríos");

    Usuario usuario1 = new Usuario(1, objRol, "Usuario1", "123456", objEmpleado1);
    Usuario usuario2 = new Usuario(2, objRol, "Usuario2", "123457", objEmpleado2);
    Usuario usuario3 = new Usuario(3, objRol, "Usuario3", "123458", objEmpleado3);
    Usuario usuario4 = new Usuario(4, objRol, "Usuario4", "123459", objEmpleado4);

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
