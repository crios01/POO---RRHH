package TareasGenerales;

import java.util.ArrayList;
import Modelos.Usuario;

public class AdmTareasGenerales {

  private ArrayList<Tarea> tareas = new ArrayList<Tarea>();
  private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

  public Tarea buscarTarea(String codigo) {
    for (Tarea tarea : tareas) {
      if (tarea.getCodigo().equals(codigo));
      return tarea;
    }
    return null;
  }

  public boolean adicionarTarea(Tarea tarea) {
    //verificando los datos del instrumento
    verificarDatoBlanco(tarea);
    boolean repetido = false;
    //Buscando codigo que no se repita
    for (Tarea t : tareas) {
      if (t.getCodigo().equals(tarea.getCodigo())) {
        repetido = true;
      }
    }
    if (repetido) {
      return false;
    }
    tareas.add(tarea);

    return true;
  }

  public boolean noExisteTarea(String codigo) {

    return buscarTarea(codigo) == null;
  }

  public int getTotalTareas() {
    return tareas.size();
  }

  public void eliminarTarea(String codigo) {
    Tarea tarea = buscarTarea(codigo);
    if (tarea != null) {
      tareas.remove(tarea);
    }
  }

  public void verificarDatoBlanco(Tarea tarea2) {
    if (tarea2.getCodigo().length() == 0 || tarea2.getAsunto().length() == 0
            || tarea2.getResponsable().length() == 0 || tarea2.getFechav() == null) {
      throw new TareaRegistradoException("No debe dejar datos en blanco");
    }

  }

  public Usuario adicionarUsuarioSeccionNotificar(String dni) {
    for (Usuario usuario : usuarios) {
      if (usuario.getDni().equals(dni));
      return usuario;
    }
    return null;
  }

  public void eliminarUsuarioSeccionNotificar(String dni) {
    Usuario usuario = adicionarUsuarioSeccionNotificar(dni);
    if (usuario != null) {
      usuarios.remove(usuario);
    }
  }
}